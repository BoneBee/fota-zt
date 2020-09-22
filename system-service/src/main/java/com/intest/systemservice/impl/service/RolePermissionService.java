package com.intest.systemservice.impl.service;


import com.intest.dao.entity.RolePermissionBto;

public interface RolePermissionService {
    RolePermissionBto getRolePermissionId(String rolePermissionId);

    int addRolePermission(RolePermissionBto permissionBto);

    int updateRolePermission(RolePermissionBto permissionBto);

    int deleteRolePermission(String rolePermissionId);
}
