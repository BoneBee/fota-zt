package com.intest.systemservice.impl.service.impl;

import com.intest.dao.entity.RolePermissionBto;
import com.intest.dao.mapper.RolePermissionBtoMapper;
import com.intest.systemservice.impl.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionImpl implements RolePermissionService {

    @Autowired
    RolePermissionBtoMapper mapper;

    @Override
    public RolePermissionBto getRolePermissionId(String rolePermissionId) {
        return mapper.selectByPrimaryKey(rolePermissionId);
    }

    @Override
    public int addRolePermission(RolePermissionBto permissionBto) {
        return mapper.insert(permissionBto);
    }

    @Override
    public int updateRolePermission(RolePermissionBto permissionBto) {
        return mapper.updateByPrimaryKey(permissionBto);
    }

    @Override
    public int deleteRolePermission(String rolePermissionId) {
        return mapper.deleteByPrimaryKey(rolePermissionId);
    }
}
