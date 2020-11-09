package com.intest.dao.mapper;

import com.intest.dao.entity.RoleBto;
import com.intest.dao.entity.RolePermissionBto;
import com.intest.dao.entity.RolePermissionBtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermissionExtendMapper {

    void insertRolePermission(List<RolePermissionBto> rolePermissionBtos);

    void deleteRolePermission(List<RolePermissionBto> rolePermissionBtos);

    void deletePermission(List<RolePermissionBto> permissionBtos);

    void  deleteListByRoleId(List<RolePermissionBto> roleBtos);


}