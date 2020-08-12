package com.intest.basicservice.table.impl.service;


import com.intest.dao.entity.UserBto;

public interface UserService {
    UserBto getUserByname(String name);

    int addUser(UserBto person);

    int updateUser(UserBto person);

    boolean deleteUser(String name);
}
