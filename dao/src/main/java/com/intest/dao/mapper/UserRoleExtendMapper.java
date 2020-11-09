package com.intest.dao.mapper;


import com.intest.dao.entity.UserRoleBto;
import com.intest.dao.entity.system.UserListDateExtend;

import java.util.List;

public interface UserRoleExtendMapper {

    List<UserListDateExtend> getUserDate();

    void deleteListUserRoleId(List<UserRoleBto> permissionBtos);

    void deleteListUserId(List<UserRoleBto> roleBtos);

}