package com.intest.systemservice.impl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.basicservice.user.service.impl.UserServiceImpl;
import com.intest.common.exception.CustomException;
import com.intest.common.exception.ResponseBean;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.*;
import com.intest.dao.entity.system.RoleListDateExtend;
import com.intest.dao.entity.table.MenuByTableIdExtend;
import com.intest.dao.entity.table.MenuExtend;
import com.intest.dao.mapper.*;
import com.intest.partsservice.part.response.DateResponse;
import com.intest.systemservice.impl.service.RoleService;
import com.intest.systemservice.impl.service.SystemPage;
import com.intest.systemservice.request.AddRoleRequet;
import com.intest.systemservice.request.DeleteRoleRequet;
import com.intest.systemservice.request.UpdateRoleRequet;
import com.intest.systemservice.response.RoleDetailListResponse;
import com.intest.systemservice.response.RoleListResponse;
import com.intest.systemservice.response.SystemMenuResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@TableDataAnnotation
public class RoleImpl implements RoleService {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RoleBtoMapper roleBtoMapper;

    @Autowired
    RolePermissionImpl rolePermissionImpl;

    @Autowired
    PermissionExtendMapper permissionExtendMapper;

    @Autowired
    RolePermissionExtendMapper rolePermissionExtendMapper;

    @Autowired
    RoleExtendMapper roleExtendMapper;


    @Override
    public List<MenuExtend> getRolePermissionList() {
        return userService.getRolePermissionList();
    }

    @Override
    public ResponseBean addRole(AddRoleRequet request) {
        ValidateHelper.validateNull(request, new String[]{"roleName", "roleType"});
        RoleBto roleBto = new RoleBto();
        roleBto.setRoleId(UUID.randomUUID() + "");
        roleBto.setRoleName(request.getRoleName());
        roleBto.setRoleType((short) request.getRoleType());
        roleBto.setIsdelete((short) 1);
        roleBto.setCreateat(new Date());
        roleBto.setRemark(request.getRemark());
        roleBto.setCreateby("admin");
        List<PermissionBto> permissionBtos = new ArrayList<>();
        List<RolePermissionBto> rolePermissionBtoList = new ArrayList<>();
        if (request.getList() != null && request.getList().size() != 0) {
            for (AddRoleRequet.PermissionBean permissionBean : request.getList()) {
                PermissionBto bto = new PermissionBto();
                bto.setPermissionId(UUID.randomUUID() + "");
                bto.setFkResourceId(permissionBean.getKey());
                bto.setResourceType((short) permissionBean.getType());
                bto.setIsdelete((short) 1);
                bto.setCreateat(new Date());
                bto.setCreateby("admin");
                permissionBtos.add(bto);
                RolePermissionBto rolePermissionBto = new RolePermissionBto();
                rolePermissionBto.setRolepermissionId(UUID.randomUUID() + "");
                rolePermissionBto.setFkRoleId(roleBto.getRoleId());
                rolePermissionBto.setFkPermissionId(bto.getPermissionId());
                rolePermissionBto.setDefaultChecked((short) 1);
                rolePermissionBto.setIsdelete((short) 1);
                rolePermissionBto.setCreateat(new Date());
                rolePermissionBto.setCreateby("admin");
                rolePermissionBtoList.add(rolePermissionBto);
            }
            permissionExtendMapper.insertPermission(permissionBtos);
            rolePermissionExtendMapper.insertRolePermission(rolePermissionBtoList);
        }
        if (roleBtoMapper.insert(roleBto) != 1) {
            throw new CustomException("新增角色失败！");
        }
        return new ResponseBean(1, "新增角色成功", null);
    }

    @Override
    public ResponseBean updateRole(UpdateRoleRequet request, UserBto bto) {
        ValidateHelper.validateNull(request, new String[]{"roleName", "roleType", "roleId"});
        List<RolePermissionBto> rolePermissionBtoList = rolePermissionImpl.getRolePermissionListByRoleId(request.getRoleId());
        if (rolePermissionBtoList != null && rolePermissionBtoList.size() != 0) {
            rolePermissionExtendMapper.deletePermission(rolePermissionBtoList);
            rolePermissionExtendMapper.deleteRolePermission(rolePermissionBtoList);
        }

        RoleBto roleBto = roleBtoMapper.selectByPrimaryKey(request.getRoleId());
        roleBto.setRoleName(request.getRoleName());
        roleBto.setRoleType((short) request.getRoleType());
        roleBto.setIsdelete((short) 1);
        roleBto.setUpdateat(new Date());
        roleBto.setRemark(request.getRemark());
        roleBto.setUpdateby(bto.getRealName());
        if (request.getList() != null && request.getList().size() != 0) {
            List<PermissionBto> permissionBtos = new ArrayList<>();
            List<RolePermissionBto> rolePermissionBtoList1 = new ArrayList<>();
            for (AddRoleRequet.PermissionBean permissionBean : request.getList()) {
                PermissionBto bto1 = new PermissionBto();
                bto1.setPermissionId(UUID.randomUUID() + "");
                bto1.setFkResourceId(permissionBean.getKey());
                bto1.setResourceType((short) permissionBean.getType());
                bto1.setIsdelete((short) 1);
                bto1.setCreateat(new Date());
                bto1.setCreateby(bto.getRealName());
                permissionBtos.add(bto1);
                RolePermissionBto rolePermissionBto = new RolePermissionBto();
                rolePermissionBto.setRolepermissionId(UUID.randomUUID() + "");
                rolePermissionBto.setFkRoleId(roleBto.getRoleId());
                rolePermissionBto.setFkPermissionId(bto1.getPermissionId());
                rolePermissionBto.setDefaultChecked((short) 1);
                rolePermissionBto.setIsdelete((short) 1);
                rolePermissionBto.setCreateat(new Date());
                rolePermissionBto.setCreateby(bto.getRealName());
                rolePermissionBtoList1.add(rolePermissionBto);
            }
            permissionExtendMapper.insertPermission(permissionBtos);
            rolePermissionExtendMapper.insertRolePermission(rolePermissionBtoList1);
        }
        if (roleBtoMapper.updateByPrimaryKey(roleBto) != 1) {
            throw new CustomException("修改角色失败！");
        }
        return new ResponseBean(1, "修改角色成功", null);
    }

    @Override
    public ResponseBean deleteRole(List<DeleteRoleRequet> request) {
        if (request == null || request.size() == 0) {
            throw new CustomException("请输入需要删除的角色ID！");
        }
        List<RolePermissionBto> rolePermissionBtos = new ArrayList<>();
        for (DeleteRoleRequet roleRequet : request) {
            List<RolePermissionBto> rolePermissionBtoList = rolePermissionImpl.getRolePermissionListByRoleId(roleRequet.getRoleId());
            if (rolePermissionBtoList != null && rolePermissionBtoList.size() != 0) {
                for (RolePermissionBto rolePermissionBto : rolePermissionBtoList) {
                    rolePermissionBtos.add(rolePermissionBto);
                }
            }
        }
        if (rolePermissionBtos.size() != 0) {
            rolePermissionExtendMapper.deleteRolePermission(rolePermissionBtos);
            rolePermissionExtendMapper.deletePermission(rolePermissionBtos);
        }
        rolePermissionExtendMapper.deleteListByRoleId(rolePermissionBtos);
        return new ResponseBean(1, "删除角色成功", null);
    }

    @Override
    @TableDataAnnotation(tableId = "1f87c62b-308f-4336-a21f-90ffe33deba2")
    public PagerDataBaseVO getRoleTmpInfo(SystemPage model) {
        List<RoleListDateExtend> roleListDateExtends = roleExtendMapper.getRoleListDate();
        List<RoleListDateExtend> roleTypes = roleListDateExtends.stream().filter(distinctByKey(RoleListDateExtend::getRoleId)).collect(Collectors.toList());
        PagerDataBaseVO role = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<RoleDetailListResponse> responseList = new ArrayList<>();
        PageInfo<RoleListDateExtend> pageInfo = new PageInfo<>(roleTypes);
        int index = pageInfo.getStartRow();
        for (RoleListDateExtend type : roleTypes) {
            List<MenuExtend> menuExtends = userService.getRolePermissionList();
            List<RoleListDateExtend> roleListDateExtendList = new ArrayList<>();
            for (RoleListDateExtend roleListDateExtend : roleListDateExtends) {
                if (type.getRoleId().equals(roleListDateExtend.getRoleId())) {
                    roleListDateExtendList.add(roleListDateExtend);
                }
            }
            for (MenuExtend menuExtend1 : menuExtends) {
                for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                    if (menuExtend1.getKey().equals(roleListDateExtend.getResourceId())) {
                        menuExtend1.setChecked(true);
                    }
                }
                for (MenuExtend menuExtend2 : menuExtend1.getChildren()) {
                    for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                        if (menuExtend2.getKey().equals(roleListDateExtend.getResourceId())) {
                            menuExtend2.setChecked(true);
                        }
                    }
                    for (MenuExtend menuExtend3 : menuExtend2.getChildren()) {
                        for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                            if (menuExtend3.getKey().equals(roleListDateExtend.getResourceId())) {
                                menuExtend3.setChecked(true);
                            }
                        }
                        for (MenuExtend menuExtend4 : menuExtend3.getChildren()) {
                            for (RoleListDateExtend roleListDateExtend : roleListDateExtendList) {
                                if (menuExtend4.getKey().equals(roleListDateExtend.getResourceId())) {
                                    menuExtend4.setChecked(true);
                                }
                            }
                        }
                    }
                }
            }
            RoleDetailListResponse response = new RoleDetailListResponse(index += 1, type.getRoleId(), type.getRoleName(), type.getRoleType(), type.getRemark(), type.getCreateAt(), type.getCreateBy(), type.getUpdateAt(), type.getUpdateBy(), menuExtends);
            responseList.add(response);
        }


        role.setTotal(pageInfo.getTotal());
        role.setData(responseList);
        return role;
    }

    @Override
    public ResponseBean selectLoginName(String roleName, String id) {
        if (!StringUtils.isNotEmptyStr(roleName)) {
            throw new CustomException("角色名称不能为空");
        }
        if (StringUtils.isNotEmptyStr(id)) {
            RoleBto roleBto = roleBtoMapper.selectByPrimaryKey(id);
            if (roleBto.getRoleName().equals(roleName)) {
                return new ResponseBean(1, "角色名称未注册", new DateResponse(0));
            }
        }
        RoleBtoExample example = new RoleBtoExample();
        RoleBtoExample.Criteria criteria = example.createCriteria();
        criteria.andRoleNameEqualTo(roleName);
        List<RoleBto> roleBtos = roleBtoMapper.selectByExample(example);
        if (roleBtos == null || roleBtos.size() == 0) {
            return new ResponseBean(1, "该角色名称未注册", new DateResponse(0));
        } else {
            return new ResponseBean(1, "该角色名称已注册，请重新输入", new DateResponse(1));
        }
    }

    @Override
    public List<RoleListResponse> getRoleList() {
        List<RoleBto> roleBtos = roleBtoMapper.selectByExample(null);
        List<RoleListResponse> responseList = new ArrayList<>();
        for (RoleBto bto : roleBtos) {
            RoleListResponse response = new RoleListResponse();
            response.setRoleName(bto.getRoleName());
            response.setRoleId(bto.getRoleId());
            responseList.add(response);
        }
        return responseList;
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentHashMap<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
