package com.intest.basicservice.user.service;


import com.intest.basicservice.user.response.UserPage;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.UserBto;

public interface UserService {

    LoginVO checkLogin(String userName, String password);

    LoginVO getUserLoginInfo(String userId);

    UserBto getUserByname(String name);

    UserBto getUserByUserId(String userId);

    int addUser(UserBto person);

    int updateUser(UserBto person);

    int deleteUser(String userId);

    PagerDataBaseVO getUserInfo(UserPage model);
}
