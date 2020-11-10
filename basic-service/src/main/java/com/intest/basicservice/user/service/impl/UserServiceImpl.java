package com.intest.basicservice.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.basicservice.menu.service.MenuService;
import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.basicservice.user.request.AddUserRequest;
import com.intest.basicservice.user.request.DeleteUserRequest;
import com.intest.basicservice.user.request.UpdatePassworldRequest;
import com.intest.basicservice.user.request.UpdateUserRequest;
import com.intest.basicservice.user.response.ResetPassworldResponse;
import com.intest.basicservice.user.response.UserPage;
import com.intest.basicservice.user.service.UserService;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.exception.CustomException;
import com.intest.common.jwt.JwtUtil;
import com.intest.common.jwt.constant.RedisConstant;
import com.intest.common.redis.JedisUtil;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.util.BCrypt;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.*;
import com.intest.dao.entity.system.RoleListDateExtend;
import com.intest.dao.entity.system.UserListDateExtend;
import com.intest.dao.entity.table.MenuByTableIdExtend;
import com.intest.dao.entity.table.MenuExtend;
import com.intest.dao.mapper.*;
import com.intest.partsservice.part.response.DateResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@TableDataAnnotation
public class UserServiceImpl implements UserService {

    private Log logger = LogFactory.getLog(this.getClass());

    @Value("${config.refreshToken-expireTime}")
    private String refreshTokenExpireTime;

    @Autowired
    UserBtoMapper userBtoMapper;

    @Autowired
    MenuService menuService;

    @Autowired
    UserRoleBtoMapper userRoleBtoMapper;

    @Autowired
    LoginLogBtoMapper loginLogBtoMapper;

    @Autowired
    UserRoleExtendMapper userRoleExtendMapper;

    @Autowired
    RoleExtendMapper roleExtendMapper;

    @Autowired
    MenuExtendMapper menuExtendMapper;

    @Autowired
    TableExtendMapper tableExtendMapper;

    /**
     * create by: zhanghui
     * description: TODO
     * create time: 2020/8/21 11:12
     *
     * @param userName
     * @param password
     * @return com.intest.basicservice.user.vo.LoginVO
     */
    @Override
    public LoginVO checkLogin(String Ip, String browser, String userName, String password) {
        LoginVO vo = new LoginVO();

        // 检查用户名是否正确
        UserBto user = getUserByName(userName);
        // 未查询到账号，则用户名和密码错误
        if (user == null) {
            vo.setIsCanLogin(2);
        } else {
            // 重试次数为0，则账号被冻结
            if (user.getPasswordRetryCount() == 0) {
                vo.setIsCanLogin(2);
            } else {
                // 校验密码
                if (!BCrypt.checkpw(password, user.getLoginPassword())) {
                    if (user.getPasswordRetryCount() == 0) {
                        vo.setIsCanLogin(3);
                    } else {
                        vo.setIsCanLogin(2);
                        vo.setFreeNum(user.getPasswordRetryCount().intValue() - 1);
                        updateUserByErrorPwd(user.getUserId(), user.getPasswordRetryCount().intValue());
                    }
                    LoginLogBto loginLogBto = new LoginLogBto();
                    loginLogBto.setLoginlogId(UUID.randomUUID() + "");
                    loginLogBto.setFkUserId(user.getUserId());
                    loginLogBto.setLoginResult((short) 0);
                    loginLogBto.setLoginIp(Ip);
                    loginLogBto.setBrowser(browser);
                    loginLogBto.setNote("登陆失败，密码错误");
                    loginLogBto.setIsdelete((short) 1);
                    loginLogBto.setCreateat(new Date());
                    loginLogBto.setCreateby(user.getUserId());
                    loginLogBtoMapper.insert(loginLogBto);
                } else {
                    LoginLogBto loginLogBto = new LoginLogBto();
                    loginLogBto.setLoginlogId(UUID.randomUUID() + "");
                    loginLogBto.setFkUserId(user.getUserId());
                    loginLogBto.setLoginResult((short) 1);
                    loginLogBto.setLoginIp(Ip);
                    loginLogBto.setBrowser(browser);
                    loginLogBto.setNote("登陆成功");
                    loginLogBto.setIsdelete((short) 1);
                    loginLogBto.setCreateat(new Date());
                    loginLogBto.setCreateby(user.getUserId());
                    loginLogBtoMapper.insert(loginLogBto);

                    updateUserBySuccess(user.getUserId());
                    vo.setIsCanLogin(1);
                    //vo.setToken(bcrptTokenGenerator.generate(userName));
                    vo.setMenus(menuService.getMenuByUserId(user.getUserId()));

                    try {
                        //if (JedisUtil.exists(Constant.PREFIX_SHIRO_CACHE + user.getUserId())) {
                        //    Object token = JedisUtil.getObject(Constant.PREFIX_SHIRO_CACHE + user.getUserId());
                        //} else {
                        //String token = bcrptTokenGenerator.generate(user.getUserId());
                        //JedisUtil.setObject(Constant.PREFIX_SHIRO_CACHE + user.getUserId(), vo.getToken(), Constant.EXRP_DAY);
                        //JedisUtil.setObject(Constant.PREFIX_SHIRO_ACCESS_TOKEN + vo.getToken(), user.getUserId(), Constant.EXRP_DAY);
                        //}

                        // 清除可能存在的shiro权限信息缓存
                        if (JedisUtil.exists(RedisConstant.PREFIX_SHIRO_CACHE + user.getUserId())) {
                            JedisUtil.delKey(RedisConstant.PREFIX_SHIRO_CACHE + user.getUserId());
                        }

                        // 设置RefreshToken，时间戳为当前时间戳，直接设置即可(不用先删后设，会覆盖已有的RefreshToken)
                        String currentTimeMillis = String.valueOf(System.currentTimeMillis());
                        JedisUtil.setJson(RedisConstant.PREFIX_SHIRO_REFRESH_TOKEN + user.getUserId(), currentTimeMillis,
                                Integer.parseInt(refreshTokenExpireTime));

                        // 从Header中Authorization返回AccessToken，时间戳为当前时间戳
                        String token = JwtUtil.sign(user.getUserId(), currentTimeMillis);
                        vo.setToken(token);
                    } catch (Exception ex) {
                        logger.error(ex);
                    }
                }
            }
        }

        return vo;
    }

    /**
     * create by: zhanghui
     * description: 获取带token的用户信息
     * create time: 2020/8/24 22:05
     *
     * @param userId
     * @return com.intest.basicservice.user.vo.LoginVO
     */
    @Override
    public LoginVO getUserLoginInfo(String userId) {
        LoginVO vo = new LoginVO();
        vo.setIsCanLogin(1);
        //vo.setToken(bcrptTokenGenerator.generate(userId));
        vo.setMenus(menuService.getMenuByUserId(userId));
        return vo;
    }

    @Override
    public int inRegister(AddUserRequest request, UserBto user) {
        ValidateHelper.validateNull(request, new String[]{"loginName", "loginPassword", "accountKind", "accountStatus"});
        String account = request.getLoginName();
        String passworld = request.getLoginPassword();
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(account);
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos.size() != 0) {
            throw new CustomException("已存在相同用户名，请重新修改用户名");
        }
        UserBto userBto = new UserBto();
        UUID uuid = UUID.randomUUID();
        String yan = BCrypt.gensalt();
        String hashd = BCrypt.hashpw(passworld, yan);
        userBto.setUserId(uuid + "");
        userBto.setLoginName(request.getLoginName());
        userBto.setLoginPassword(hashd);
        userBto.setCsprng(yan);
        userBto.setRealName(request.getRealName());
        userBto.setDepartment(request.getDepartment());
        userBto.setMobile(request.getMobile());
        userBto.setCompanyEmail(request.getCompanyEmail());
        userBto.setSex((short) request.getSex());
        userBto.setNote(request.getNote());
        userBto.setAccountKind((short) request.getAccountKind());
        userBto.setPasswordRetryCount(5);
        userBto.setAccountStatus((short) request.getAccountStatus());
        userBto.setIsdelete((short) 1);
        userBto.setCreateat(new Date());
        userBto.setCreateby(user.getRealName());
        UserRoleBto userRoleBto = new UserRoleBto();
        userRoleBto.setUserRoleId(UUID.randomUUID() + "");
        userRoleBto.setFkUserId(uuid + "");
        userRoleBto.setFkRoleId(request.getRoleId());
        userRoleBto.setIsdelete((short) 1);
        userRoleBto.setCreateat(new Date());
        userRoleBto.setCreateby(user.getRealName());
        if (userBtoMapper.insert(userBto) == 1 && userRoleBtoMapper.insert(userRoleBto) == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int updateUser(UpdateUserRequest request) {
        ValidateHelper.validateNull(request, new String[]{"userId", "realName"});
        UserBto newUser = userBtoMapper.selectByPrimaryKey(request.getUserId());
        if (newUser == null) {
            throw new CustomException("您要修改的用户不存在");
        }
        newUser.setRealName(request.getRealName());
        newUser.setDepartment(request.getDepartment());
        newUser.setMobile(request.getMobile());
        newUser.setCompanyEmail(request.getCompanyEmail());
        newUser.setAccountStatus((short) request.getAccountStatus());
        UserRoleBtoExample example = new UserRoleBtoExample();
        UserRoleBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkUserIdEqualTo(request.getUserId());
        List<UserRoleBto> userRoleBtos = userRoleBtoMapper.selectByExample(example);
        if (userRoleBtos == null && userRoleBtos.size() == 0) {
            throw new CustomException("您要修改的用户对应角色不存在");
        }
        UserRoleBto userRoleBto = userRoleBtos.get(0);
        userRoleBto.setFkRoleId(request.getRoleId());
        if (userBtoMapper.updateByPrimaryKey(newUser) == 1 && userRoleBtoMapper.updateByPrimaryKey(userRoleBto) == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int deleteUser(List<DeleteUserRequest> request) {
        if (request.size() == 0) {
            throw new CustomException("请输入要删除的用户ID");
        }
        List<UserRoleBto> userRoleBtos = new ArrayList<>();
        for (DeleteUserRequest userIdBean : request) {
            UserRoleBtoExample example = new UserRoleBtoExample();
            UserRoleBtoExample.Criteria criteria = example.createCriteria();
            criteria.andFkUserIdEqualTo(userIdBean.getId());
            List<UserRoleBto> userRoleBto = userRoleBtoMapper.selectByExample(example);
            if (userRoleBto != null && userRoleBto.size() != 0) {
                userRoleBtos.add(userRoleBto.get(0));
            }
        }
        if (userRoleBtos.size() == 0) {
            throw new CustomException("未找到对应角色");
        }
        if (userRoleExtendMapper.deleteListUserId(userRoleBtos) == 1 && userRoleExtendMapper.deleteListUserRoleId(userRoleBtos) == 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public int resetPassworld(String userId) {
        if (!StringUtils.isNotEmptyStr(userId)) {
            throw new CustomException("用户ID不能为空");
        }
        UserBto userBto = userBtoMapper.selectByPrimaryKey(userId);
        if (userBto == null) {
            throw new CustomException("该用户不存在");
        }
        String yan = userBto.getCsprng();
        String hashd = BCrypt.hashpw("abCD12", yan);
        userBto.setLoginPassword(hashd);
        if (userBtoMapper.updateByPrimaryKey(userBto) != 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public int updatePassworld(UpdatePassworldRequest request) {
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(request.getLoginName());
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos == null) {
            throw new CustomException("未找到该用户");
        }
        if (!BCrypt.checkpw(request.getOldPassworld(), userBtos.get(0).getLoginPassword())) {
            throw new CustomException("您输入的旧密码错误，请重试");
        }
        if (!request.getNewPassworld().equals(request.getIsPassworld())) {
            throw new CustomException("您两次输入的密码不一致，请重试");
        }
        String yan = userBtos.get(0).getCsprng();
        String hashd = BCrypt.hashpw(request.getNewPassworld(), yan);
        userBtos.get(0).setLoginPassword(hashd);
        if (userBtoMapper.updateByPrimaryKey(userBtos.get(0)) != 1) {
            return 0;
        }
        return 1;
    }

    @Override
    @TableDataAnnotation(tableId = "262c1a6f-a568-42a8-92c1-30fdceded241")
    public PagerDataBaseVO getUserInfo(UserPage model) {
        PagerDataBaseVO user = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<UserListDateExtend> userListDateExtends = userRoleExtendMapper.getUserDate();
        PageInfo<UserListDateExtend> pageInfo = new PageInfo<>(userListDateExtends);
        int index = pageInfo.getStartRow() - 1;
        for (UserListDateExtend userListDateExtend : userListDateExtends) {
            userListDateExtend.setIndex(index += 1);
        }

        user.setTotal(pageInfo.getTotal());
        user.setData(userListDateExtends);
        return user;
    }

    @Override
    public List<MenuExtend> getUserPermission(String userId) {
        List<RoleListDateExtend> roleListDateExtends = roleExtendMapper.getRoleListDate();
        if (roleListDateExtends == null || roleListDateExtends.size() == 0) {
            throw new CustomException("未找到角色关系表");
        }
        List<MenuExtend> menuS = getRolePermissionList();
        List<UserListDateExtend> userDate = userRoleExtendMapper.getUserDate();
        if (userDate == null || userDate.size() == 0) {
            throw new CustomException("角色列表");
        }
        UserListDateExtend roleMessage = null;
        for (UserListDateExtend extend : userDate) {
            if (userId.equals(extend.getUserId())) {
                roleMessage = extend;
            }
        }
        List<RoleListDateExtend> roleListDateExtendList = new ArrayList<>();
        for (RoleListDateExtend roleListDateExtend : roleListDateExtends) {
            if (roleMessage.getRoleId().equals(roleListDateExtend.getRoleId())) {
                roleListDateExtendList.add(roleListDateExtend);
            }
        }
        for (MenuExtend menuExtend1 : menuS) {
            for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                if (menuExtend1.getKey().equals(roleListDateExtend.getResourceId())) {
                    menuExtend1.setChecked(true);
                }
            }
            for (MenuExtend menuExtend2 : menuExtend1.getChildren()) {
                for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                    if (menuExtend2.getKey().equals(roleListDateExtend.getResourceId())) {
                        menuExtend2.setChecked(true);
                    }
                }
                for (MenuExtend menuExtend3 : menuExtend2.getChildren()) {
                    for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                        if (menuExtend3.getKey().equals(roleListDateExtend.getResourceId())) {
                            menuExtend3.setChecked(true);
                        }
                    }
                    for (MenuExtend menuExtend4 : menuExtend3.getChildren()) {
                        for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                            if (menuExtend4.getKey().equals(roleListDateExtend.getResourceId())) {
                                menuExtend4.setChecked(true);
                            }
                        }
                    }
                }
            }
        }
        return menuS;
    }

    @Override
    public int updateUserState(String userId, int state) {
        if (!StringUtils.isNotEmptyStr(userId)) {
            throw new CustomException("用户ID不能为空");
        }
        UserBto userBto = userBtoMapper.selectByPrimaryKey(userId);
        if (userBto == null) {
            throw new CustomException("该用户不存在");
        }
        userBto.setAccountStatus((short) state);
        if (userBtoMapper.updateByPrimaryKey(userBto) != 1) {
            return 0;
        }
        return 1;
    }

    @Override
    public DateResponse selectLoginName(String loginName, String id) {
        if (!StringUtils.isNotEmptyStr(loginName)) {
            throw new CustomException("登陆账户不能为空");
        }
        if (StringUtils.isNotEmptyStr(id)) {
            UserBto userBto = userBtoMapper.selectByPrimaryKey(id);
            if (userBto.getLoginName().equals(loginName)) {
                return new DateResponse(0);
            }
        }
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(loginName);
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos == null || userBtos.size() == 0) {
            return new DateResponse(0);
        } else {
            return new DateResponse(1);
        }
    }

    @Override
    public DateResponse selectPhone(String phone, String id) {
        if (!StringUtils.isNotEmptyStr(phone)) {
            throw new CustomException("手机号不能为空");
        }
        if (StringUtils.isNotEmptyStr(id)) {
            UserBto userBto = userBtoMapper.selectByPrimaryKey(id);
            if (userBto.getMobile().equals(phone)) {
                return new DateResponse(0);
            }
        }
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(phone);
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos == null || userBtos.size() == 0) {
            return new DateResponse(0);
        } else {
            return new DateResponse(1);
        }
    }


    @Override
    public DateResponse selectMail(String mail, String id) {
        if (!StringUtils.isNotEmptyStr(mail)) {
            throw new CustomException("邮箱不能为空");
        }
        if (StringUtils.isNotEmptyStr(id)) {
            UserBto userBto = userBtoMapper.selectByPrimaryKey(id);
            if (userBto.getCompanyEmail().equals(mail)) {
                return new DateResponse(0);
            }
        }
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(mail);
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos == null || userBtos.size() == 0) {
            return new DateResponse(0);
        } else {
            return new DateResponse(1);
        }
    }

    public List<MenuExtend> getRolePermissionList() {
        List<MenuExtend> menuExtends = menuExtendMapper.findAllRecursion();
        if (menuExtends == null || menuExtends.size() == 0) {
            throw new CustomException("未找到菜单信息");
        }
        List<MenuByTableIdExtend> menuByTableIdExtends = tableExtendMapper.getMenuByTableIdDate();
        if (menuByTableIdExtends == null || menuByTableIdExtends.size() == 0) {
            throw new CustomException("未找到表单信息");
        }
        for (MenuExtend menuExtend : menuExtends) {
            menuExtend.setChecked(false);
            for (MenuExtend extend : menuExtend.getChildren()) {
                extend.setChecked(false);
                List<MenuByTableIdExtend> menu = new ArrayList<>();
                for (MenuByTableIdExtend menuByTableIdExtend : menuByTableIdExtends) {
                    if (extend.getKey().equals(menuByTableIdExtend.getMenuId())) {
                        menu.add(menuByTableIdExtend);
                    }
                }
                List<MenuByTableIdExtend> typeMenu = menu.stream().filter(distinctByKey(MenuByTableIdExtend::getTableId)).collect(Collectors.toList());
                List<MenuExtend> tableMenu = new ArrayList<>();
                int i = 0;
                for (MenuByTableIdExtend men : typeMenu) {
                    List<MenuExtend> model = new ArrayList<>();
                    for (MenuByTableIdExtend menuByTableIdExtend : menuByTableIdExtends) {
                        if (men.getTableId().equals(menuByTableIdExtend.getTableId()) && StringUtils.isNotEmptyStr(menuByTableIdExtend.getToolBarItemId())) {
                            MenuExtend tableIdExtend = new MenuExtend(menuByTableIdExtend.getToolBarItemId(), "", 1, false, menuByTableIdExtend.getItemName(), new ArrayList<>());
                            model.add(tableIdExtend);
                        }
                    }
                    MenuExtend tableIdExtend = new MenuExtend(men.getTableId(), "", 1, false, "表格" + (i += 1), model);
                    tableMenu.add(tableIdExtend);
                }
                extend.setChildren(tableMenu);
            }
        }
        return menuExtends;
    }

    public boolean logout(String account) {
        Boolean result = true;

        // 清除shiro权限信息缓存
        if (JedisUtil.exists(RedisConstant.PREFIX_SHIRO_CACHE + account)) {
            JedisUtil.delKey(RedisConstant.PREFIX_SHIRO_CACHE + account);
        }
        // 清除RefreshToken
        JedisUtil.delKey(RedisConstant.PREFIX_SHIRO_REFRESH_TOKEN + account);

        return result;
    }

    /**
     * create by: zhanghui
     * description: TODO
     * create time: 2020/8/21 11:11
     *
     * @param userName
     * @return com.intest.dao.entity.UserBto
     */
    private UserBto getUserByName(String userName) {
        UserBtoExample userBtoExample = new UserBtoExample();
        UserBtoExample.Criteria userBtoCriteria = userBtoExample.createCriteria();
        userBtoCriteria.andLoginNameEqualTo(userName);
        userBtoCriteria.andIsdeleteEqualTo((short) 1);
        List<UserBto> userBtos = userBtoMapper.selectByExample(userBtoExample);
        if (userBtos.size() > 0) {
            return userBtos.get(0);
        } else {
            return null;
        }
    }

    /**
     * create by: zhanghui
     * description: TODO
     * create time: 2020/8/22 11:07
     * 账号正确，密码错误时，更新重试次数和账号冻结状态
     *
     * @param userId
     * @param passwordRetryCount
     * @return boolean
     */
    private boolean updateUserByErrorPwd(String userId, int passwordRetryCount) {
        UserBtoExample userBtoExample = new UserBtoExample();
        UserBtoExample.Criteria userBtoCriteria = userBtoExample.createCriteria();
        userBtoCriteria.andUserIdEqualTo(userId);
        userBtoCriteria.andIsdeleteEqualTo((short) 1);

        UserBto user = new UserBto();
        user.setPasswordRetryCount(passwordRetryCount - 1);
        // 如果剩余次数为零，则冻结账号
        if (passwordRetryCount == 0) {
            user.setAccountStatus((short) 0);
        }
        userBtoMapper.updateByExampleSelective(user, userBtoExample);
        return true;
    }

    /**
     * create by: zhanghui
     * description: TODO
     * create time: 2020/8/22 11:18
     * 登录成功，更新密码重试次数
     *
     * @param userId
     * @return boolean
     */
    private boolean updateUserBySuccess(String userId) {
        UserBtoExample userBtoExample = new UserBtoExample();
        UserBtoExample.Criteria userBtoCriteria = userBtoExample.createCriteria();
        userBtoCriteria.andUserIdEqualTo(userId);
        userBtoCriteria.andIsdeleteEqualTo((short) 1);

        UserBto user = new UserBto();
        user.setPasswordRetryCount(5);
        user.setLastLoginat(new Date());

        int count = userBtoMapper.updateByExampleSelective(user, userBtoExample);
        return count > 0;
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentHashMap<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
