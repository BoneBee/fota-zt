package com.intest.systemservice.impl.service;


import com.intest.dao.entity.RoleBto;

public interface RoleService {

    RoleBto getRoleById(String roleId);

    RoleBto getRoleByName(String roleName);

    int addRole(RoleBto roleBto);

    int updateRole(RoleBto roleBto);

    int deleteRole(String roleId);
}
