package com.intest.dao.mapper;

import com.intest.dao.entity.PermissionBto;
import com.intest.dao.entity.RoleBto;
import com.intest.dao.entity.RoleBtoExample;
import com.intest.dao.entity.RolePermissionBto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionExtendMapper {

    void insertPermission(List<PermissionBto> permissionBtos);


}