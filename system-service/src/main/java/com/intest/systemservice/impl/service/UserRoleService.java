package com.intest.systemservice.impl.service;


import com.intest.dao.entity.UserRoleBto;

public interface UserRoleService {
    UserRoleBto getUserRoleById(String userRoleId);

    UserRoleBto getUserRoleByUserId(String userId);

    int addUserRole(UserRoleBto userRoleBto);

    int updateUserRole(UserRoleBto userRoleBto);

    int deleteUserRole(String userRoleId);
}
