package com.intest.basicservice.user.service.impl;

import com.intest.basicservice.menu.service.MenuService;
import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.common.constant.Constant;
import com.intest.basicservice.table.config.jwt.BcrptTokenGenerator;
import com.intest.basicservice.table.config.redis.JedisUtil;
import com.intest.basicservice.user.response.LoginResponse;
import com.intest.basicservice.user.service.UserService;
import com.intest.basicservice.user.util.BCrypt;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.UserBtoExample;
import com.intest.dao.mapper.UserBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserBtoMapper userBtoMapper;

    @Autowired
    MenuService menuService;

    @Autowired
    BcrptTokenGenerator bcrptTokenGenerator;

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
                        vo.setFreeNum(user.getPasswordRetryCount() - 1);
                        updateUserByErrorPwd(user.getUserId(), user.getPasswordRetryCount());
                    }
                } else {
                    updateUserBySuccess(user.getUserId());
                    vo.setIsCanLogin(1);
                    vo.setToken(bcrptTokenGenerator.generate(userName));
                    vo.setMenus(menuService.getMenuByUserId(user.getUserId()));

                    try {
                        if (JedisUtil.exists(Constant.PREFIX_SHIRO_CACHE + userName)) {
                            Object token = JedisUtil.getObject(Constant.PREFIX_SHIRO_CACHE + userName);
                        } else {
                            String token = bcrptTokenGenerator.generate(userName);
                            JedisUtil.setObject(Constant.PREFIX_SHIRO_CACHE + userName, token, Constant.EXRP_DAY);
                            JedisUtil.setObject(Constant.PREFIX_SHIRO_ACCESS_TOKEN + token, userName, Constant.EXRP_DAY);
                        }
                    } catch (Exception ex) {
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
     * @param userId
     * @param passwordRetryCount
     * @return boolean
     */
    private boolean updateUserByErrorPwd(String userId,int passwordRetryCount) {
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
    public int addUser(UserBto userBto) {
        return userBtoMapper.insert(userBto);
    }

    @Override
    public int updateUser(UserBto userBto) {
        return userBtoMapper.updateByPrimaryKey(userBto);
    }

    @Override
    public boolean deleteUser(String name) {
        return false;
    }
}
