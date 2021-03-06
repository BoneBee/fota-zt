package com.intest.systemservice.impl.service;


import com.intest.common.exception.ResponseBean;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.table.MenuExtend;
import com.intest.systemservice.request.AddRoleRequet;
import com.intest.systemservice.request.DeleteRoleRequet;
import com.intest.systemservice.request.UpdateRoleRequet;
import com.intest.systemservice.response.RoleListResponse;

import java.util.List;

public interface RoleService {

    List<MenuExtend> getRolePermissionList();

    ResponseBean addRole(AddRoleRequet request);

    ResponseBean updateRole(UpdateRoleRequet request, UserBto bto);

    ResponseBean deleteRole(List<DeleteRoleRequet> request);

    PagerDataBaseVO getRoleTmpInfo(SystemPage model);

    ResponseBean selectLoginName( String roleName,  String id);

    List<RoleListResponse> getRoleList();


}
