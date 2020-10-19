package com.intest.systemservice.impl.service;


import com.intest.dao.entity.RolePermissionBto;

import java.util.List;

public interface RolePermissionService {
    RolePermissionBto getRolePermissionId(String rolePermissionId);

    List<RolePermissionBto> getRolePermissionListByRoleId(String roleId);

    int addRolePermission(RolePermissionBto permissionBto);

    int updateRolePermission(RolePermissionBto permissionBto);

    int deleteRolePermission(String rolePermissionId);
}
