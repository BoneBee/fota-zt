package com.intest.basicservice.user.service;


import com.intest.basicservice.user.response.UserPage;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.UserBto;

import java.util.List;

public interface UserService {

    LoginVO checkLogin(String Ip, String browser,String userName, String password);

    LoginVO getUserLoginInfo(String userId);

    UserBto getUserByname(String name);

    UserBto getUserByPhone(String phone);

    UserBto getUserByUserName(String userName);

    UserBto getUserByUserId(String userId);

    List<UserBto> getUserList();

    int addUser(UserBto person);

    int updateUser(UserBto person);

    int deleteUser(String userId);

    PagerDataBaseVO getUserInfo(UserPage model);
}
