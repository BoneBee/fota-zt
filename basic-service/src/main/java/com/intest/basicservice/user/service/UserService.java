package com.intest.basicservice.user.service;


import com.intest.basicservice.user.vo.LoginVO;
import com.intest.dao.entity.UserBto;

public interface UserService {

    LoginVO checkLogin(String userName, String password);

    LoginVO getUserLoginInfo(String userId);

    UserBto getUserByname(String name);

    int addUser(UserBto person);

    int updateUser(UserBto person);

    boolean deleteUser(String name);
}
