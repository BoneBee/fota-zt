package com.intest.systemservice.impl.service;


import com.intest.dao.entity.PermissionBto;

import java.util.List;

public interface PermissionService {
    PermissionBto getRoleById(String permissionId);

    int addPermission(PermissionBto permissionBto);

    int updatePermission(PermissionBto permissionBto);

    int deletePermission(String permissionId);
}
