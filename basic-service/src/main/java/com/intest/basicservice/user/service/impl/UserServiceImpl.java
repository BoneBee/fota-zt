package com.intest.basicservice.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.basicservice.menu.service.MenuService;
import com.intest.basicservice.user.response.UserPage;
import com.intest.basicservice.user.response.UserResponse;
import com.intest.basicservice.user.service.UserService;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.jwt.JwtUtil;
import com.intest.common.jwt.constant.RedisConstant;
import com.intest.common.redis.JedisUtil;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.util.BCrypt;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.RoleBtoMapper;
import com.intest.dao.mapper.UserBtoMapper;
import com.intest.dao.mapper.UserRoleBtoMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    RoleBtoMapper roleBtoMapper;

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
    public LoginVO checkLogin(String userName, String password) {
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
                } else {
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

    @Override
    public UserBto getUserByname(String loginName) {
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(loginName);
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos != null && userBtos.size() != 0) {
            return userBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public UserBto getUserByPhone(String phone) {
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(phone);
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos != null && userBtos.size() != 0) {
            return userBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public UserBto getUserByUserName(String userName) {
        return null;
    }

    @Override
    public UserBto getUserByUserId(String userId) {
        return userBtoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<UserBto> getUserList() {
        List<UserBto> userBtoList = userBtoMapper.selectByExample(null);
        return userBtoList;
    }

    @Override
    public int addUser(UserBto userBto) {
        return userBtoMapper.insert(userBto);
    }

    @Override
    public int updateUser(UserBto userBto) {
        return userBtoMapper.updateByPrimaryKey(userBto);
    }

    @Override
    public int deleteUser(String userId) {
        return userBtoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    @TableDataAnnotation(tableId = "262c1a6f-a568-42a8-92c1-30fdceded241")
    public PagerDataBaseVO getUserInfo(UserPage model) {
        PagerDataBaseVO user = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<UserBto> userBtos = userBtoMapper.selectByExample(null);
        List<UserResponse> userResponseList = new ArrayList<>();
        PageInfo<UserBto> pageInfo = new PageInfo<UserBto>(userBtos);
        int index = pageInfo.getStartRow() - 1;
        for (UserBto userBto : userBtos) {
            UserRoleBtoExample example = new UserRoleBtoExample();
            UserRoleBtoExample.Criteria criteria = example.createCriteria();
            criteria.andFkUserIdEqualTo(userBto.getUserId());
            List<UserRoleBto> userRoleBtos = userRoleBtoMapper.selectByExample(example);
            RoleBto roleBto = null;
            if (userRoleBtos != null && userRoleBtos.size() != 0) {
                roleBto = roleBtoMapper.selectByPrimaryKey(userRoleBtos.get(0).getFkRoleId());
            }
            UserResponse userResponse = new UserResponse(index += 1, userBto.getUserId(), userBto.getLoginName(), userBto.getRealName(), roleBto != null ? roleBto.getRoleName() : "", roleBto != null ? roleBto.getRoleId() : "", userBto.getDepartment(), userBto.getMobile(), userBto.getCompanyEmail(), userBto.getSex() == 1 ? "男" : "女", userBto.getNote(), userBto.getAccountKind() == 1 ? "系统用户账户" : "服务账户", userBto.getLastLoginat(), userBto.getAccountStatus(), userBto.getCreateat(), userBto.getCreateby());
            userResponseList.add(userResponse);
        }
        user.setTotal(pageInfo.getTotal());
        user.setData(userResponseList);
        return user;
    }
}
