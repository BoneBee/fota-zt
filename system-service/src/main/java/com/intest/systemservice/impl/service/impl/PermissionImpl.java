package com.intest.systemservice.impl.service.impl;

import com.intest.dao.entity.PermissionBto;
import com.intest.dao.mapper.PermissionBtoMapper;
import com.intest.systemservice.impl.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionImpl implements PermissionService {
    @Autowired
    PermissionBtoMapper mapper;

    @Override
    public PermissionBto getPermissionById(String permissionId) {
        return mapper.selectByPrimaryKey(permissionId);
    }

    @Override
    public int addPermission(PermissionBto permissionBto) {
        return mapper.insert(permissionBto);
    }

    @Override
    public int updatePermission(PermissionBto permissionBto) {
        return mapper.updateByPrimaryKey(permissionBto);
    }

    @Override
    public int deletePermission(String permissionId) {
        return mapper.deleteByPrimaryKey(permissionId);
    }
}
