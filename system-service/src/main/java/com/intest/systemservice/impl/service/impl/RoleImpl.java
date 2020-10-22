package com.intest.systemservice.impl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.*;
import com.intest.systemservice.impl.service.RoleService;
import com.intest.systemservice.impl.service.SystemPage;
import com.intest.systemservice.request.AddRoleRequet;
import com.intest.systemservice.response.RoleDetailListResponse;
import com.intest.systemservice.response.SystemMenuResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@TableDataAnnotation
public class RoleImpl implements RoleService {
    @Autowired
    MenuBtoMapper meunBtoMapper;

    @Autowired
    TableBtoMapper tableBtoMapper;

    @Autowired
    ToolbarBtoMapper toolbarBtoMapper;

    @Autowired
    ToolbarItemBtoMapper toolbarItemBtoMapper;

    @Autowired
    ItemBtoMapper itemBtoMapper;

    @Autowired
    RoleBtoMapper roleBtoMapper;

    @Autowired
    PermissionBtoMapper permissionBtoMapper;

    @Autowired
    RolePermissionBtoMapper rolePermissionBtoMapper;


    @Override
    public List<RoleBto> getAllRole() {
        List<RoleBto> roleBtos = roleBtoMapper.selectByExample(null);
        return roleBtos;
    }

    @Override
    public RoleBto getRoleById(String roleId) {
        return roleBtoMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public RoleBto getRoleByName(String roleName) {
        RoleBtoExample roleBtoExample = new RoleBtoExample();
        RoleBtoExample.Criteria criteria = roleBtoExample.createCriteria();
        criteria.andRoleNameEqualTo(roleName);
        List<RoleBto> roleBtos = roleBtoMapper.selectByExample(roleBtoExample);
        System.out.println(roleBtos.size());
        if (roleBtos != null && roleBtos.size() != 0) {
            return roleBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int addRole(RoleBto roleBto) {
        return roleBtoMapper.insert(roleBto);
    }

    @Override
    public int updateRole(RoleBto roleBto) {
        return roleBtoMapper.updateByPrimaryKey(roleBto);
    }

    @Override
    public int deleteRole(String roleId) {
        return roleBtoMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    @TableDataAnnotation(tableId = "1f87c62b-308f-4336-a21f-90ffe33deba2")
    public PagerDataBaseVO getRoleTmpInfo(SystemPage model) {
        PagerDataBaseVO role = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<RoleBto> roleBtos = roleBtoMapper.selectByExample(null);
        List<SystemMenuResponse> list = getRolePermissionList();
        List<RoleDetailListResponse> responseList = new ArrayList<>();
        PageInfo<RoleBto> pageInfo = new PageInfo<RoleBto>(roleBtos);
        int index = pageInfo.getStartRow() - 1;
        for (RoleBto roleBto : roleBtos) {
            RoleDetailListResponse roleDetailListResponse = new RoleDetailListResponse();
            roleDetailListResponse.setIndex(index += 1);
            roleDetailListResponse.setRoleId(roleBto.getRoleId());
            roleDetailListResponse.setRoleName(roleBto.getRoleName());
            roleDetailListResponse.setRoleType(roleBto.getRoleType());
            roleDetailListResponse.setRemark(roleBto.getRemark());
            roleDetailListResponse.setCreateat(roleBto.getCreateat());
            roleDetailListResponse.setCreateby(roleBto.getCreateby());
            roleDetailListResponse.setUpdateat(roleBto.getUpdateat());
            roleDetailListResponse.setUpdateby(roleBto.getUpdateby());
            RolePermissionBtoExample example = new RolePermissionBtoExample();
            RolePermissionBtoExample.Criteria criteria = example.createCriteria();
            criteria.andFkRoleIdEqualTo(roleBto.getRoleId());
            List<RolePermissionBto> rolePermissionBtoList = rolePermissionBtoMapper.selectByExample(example);
            List<PermissionBto> permissionBtoList = new ArrayList<>();
            for (RolePermissionBto rolePermissionBto : rolePermissionBtoList) {
                PermissionBto permissionBto = permissionBtoMapper.selectByPrimaryKey(rolePermissionBto.getFkPermissionId());
                permissionBtoList.add(permissionBto);
            }
            List<SystemMenuResponse> one = new ArrayList<>();
            for (SystemMenuResponse bto1 : list) {
                SystemMenuResponse response1 = new SystemMenuResponse();
                response1.setTitle(bto1.getTitle());
                response1.setType(bto1.getType());
                response1.setKey(bto1.getKey());
                for (PermissionBto permissionBto : permissionBtoList) {
                    if (bto1.getKey().equals(permissionBto.getFkResourceId())) {
                        response1.setChecked(true);
                    }
                }
                List<SystemMenuResponse> two = new ArrayList<>();
                if (bto1.getChildren() != null && bto1.getChildren().size() != 0) {
                    for (SystemMenuResponse bto2 : bto1.getChildren()) {
                        SystemMenuResponse response2 = new SystemMenuResponse();
                        response2.setTitle(bto2.getTitle());
                        response2.setType(bto2.getType());
                        response2.setKey(bto2.getKey());
                        for (PermissionBto permissionBto : permissionBtoList) {
                            if (bto2.getKey().equals(permissionBto.getFkResourceId())) {
                                response2.setChecked(true);
                            }
                        }
                        List<SystemMenuResponse> three = new ArrayList<>();
                        if (bto2.getChildren() != null && bto2.getChildren().size() != 0) {
                            for (SystemMenuResponse bto3 : bto2.getChildren()) {
                                SystemMenuResponse response3 = new SystemMenuResponse();
                                response3.setTitle(bto3.getTitle());
                                response3.setType(bto3.getType());
                                response3.setKey(bto3.getKey());
                                for (PermissionBto permissionBto : permissionBtoList) {
                                    if (bto3.getKey().equals(permissionBto.getFkResourceId())) {
                                        response3.setChecked(true);
                                    }
                                }
                                List<SystemMenuResponse> four = new ArrayList<>();
                                if (bto3.getChildren() != null && bto3.getChildren().size() != 0) {
                                    for (SystemMenuResponse bto4 : bto3.getChildren()) {
                                        SystemMenuResponse response4 = new SystemMenuResponse();
                                        response4.setTitle(bto4.getTitle());
                                        response4.setType(bto4.getType());
                                        response4.setKey(bto4.getKey());
                                        for (PermissionBto permissionBto : permissionBtoList) {
                                            if (bto4.getKey().equals(permissionBto.getFkResourceId())) {
                                                response4.setChecked(true);
                                            }
                                        }
                                        response4.setChildren(new ArrayList<>());
                                        four.add(response4);
                                    }
                                }
                                response3.setChildren(four);
                                three.add(response3);
                            }
                        }
                        response2.setChildren(three);
                        two.add(response2);
                    }
                }
                response1.setChildren(two);
                one.add(response1);
            }

            roleDetailListResponse.setList(one);
            responseList.add(roleDetailListResponse);
        }
        role.setTotal(pageInfo.getTotal());
        role.setData(responseList);
        return role;
    }


    public void addAll(String id, List<AddRoleRequet.PermissionBean> bean) {
        if (bean != null || bean.size() != 0) {
            for (AddRoleRequet.PermissionBean bean2 : bean) {
                PermissionBto permissionBto2 = new PermissionBto();
                permissionBto2.setPermissionId(UUID.randomUUID() + "");
                permissionBto2.setFkResourceId(bean2.getKey());
                permissionBto2.setResourceType((short) bean2.getType());
                permissionBto2.setIsdelete((short) 1);
                permissionBto2.setCreateat(new Date());
                permissionBto2.setCreateby("admin");
                permissionBtoMapper.insert(permissionBto2);

                RolePermissionBto rolePermissionBto2 = new RolePermissionBto();
                rolePermissionBto2.setRolepermissionId(UUID.randomUUID() + "");
                rolePermissionBto2.setFkRoleId(id);
                rolePermissionBto2.setFkPermissionId(permissionBto2.getPermissionId());
                rolePermissionBto2.setDefaultChecked((short) 1);
                rolePermissionBto2.setIsdelete((short) 1);
                rolePermissionBto2.setCreateat(new Date());
                rolePermissionBto2.setCreateby("admin");
                rolePermissionBtoMapper.insert(rolePermissionBto2);

                addAll(id, bean2.getChildren());
            }
        }
    }

    public List<SystemMenuResponse> getRolePermissionList() {
        MenuBtoExample example2 = new MenuBtoExample();
        MenuBtoExample.Criteria criteria2=example2.createCriteria();
        criteria2.andMenuIdNotEqualTo("B967FEB6-4643-40DF-9156-152FE51777C0");
        criteria2.andMenuIdNotEqualTo("F76E44A8-7062-466C-8C61-AD905B68186D");
        criteria2.andMenuIdNotEqualTo("792CDE0C-2F7F-49A7-8188-FA979C3A9FF9");
        criteria2.andMenuIdNotEqualTo("2C263342-34C4-416E-82F7-975AB1870332");
        List<MenuBto> menuBtos = meunBtoMapper.selectByExample(example2);
        List<SystemMenuResponse> fatherList = new ArrayList<>();
        for (MenuBto bto : menuBtos) {
            if (!StringUtils.isNotEmptyStr(bto.getFkMenuId())) {
                SystemMenuResponse list = new SystemMenuResponse();
                list.setKey(bto.getMenuId());
                list.setType(1);
                list.setTitle(bto.getMenudisplayname());
                list.setChildren(new ArrayList<>());
                fatherList.add(list);
            }
        }
        for (int i = 0; i < fatherList.size(); i++) {
            List<SystemMenuResponse> sonList = new ArrayList<>();
            for (MenuBto bto : menuBtos) {
                if (fatherList.get(i).getKey().equals(bto.getFkMenuId())) {
                    SystemMenuResponse list = new SystemMenuResponse();
                    list.setKey(bto.getMenuId());
                    list.setType(1);
                    list.setTitle(bto.getMenudisplayname());
                    TableBtoExample example = new TableBtoExample();
                    TableBtoExample.Criteria criteria = example.createCriteria();
                    criteria.andFkMenuIdEqualTo(bto.getMenuId());
                    List<TableBto> tableBtoList = tableBtoMapper.selectByExample(example);
                    if (tableBtoList == null) {
                        list.setChildren(new ArrayList<>());
                    } else {
                        List<SystemMenuResponse> socendList = new ArrayList<>();
                        for (int j = 0; j < tableBtoList.size(); j++) {
                            SystemMenuResponse socendBean = new SystemMenuResponse();
                            socendBean.setKey(tableBtoList.get(j).getTableId());
                            socendBean.setType(2);
                            socendBean.setTitle("表格" + (j + 1));

                            ToolbarBtoExample toolbarBtoExample = new ToolbarBtoExample();
                            ToolbarBtoExample.Criteria toolbarBtoExampleCriteria = toolbarBtoExample.createCriteria();
                            toolbarBtoExampleCriteria.andFkTableIdEqualTo(tableBtoList.get(j).getTableId());
                            List<ToolbarBto> toolbarBtos = toolbarBtoMapper.selectByExample(toolbarBtoExample);
                            ToolbarBto toolbarBto = toolbarBtos.get(0);

                            ToolbarItemBtoExample toolbarItemBtoExample = new ToolbarItemBtoExample();
                            ToolbarItemBtoExample.Criteria toolbarItemBtocriteria = toolbarItemBtoExample.createCriteria();
                            toolbarItemBtocriteria.andFkToolbarIdEqualTo(toolbarBto.getToolbarId());
                            List<ToolbarItemBto> toolbarItemBtoList = toolbarItemBtoMapper.selectByExample(toolbarItemBtoExample);

                            List<SystemMenuResponse> endList = new ArrayList<>();
                            for (ToolbarItemBto toolbarItemBto : toolbarItemBtoList) {
                                SystemMenuResponse endBean = new SystemMenuResponse();
                                ItemBto itemBto = itemBtoMapper.selectByPrimaryKey(toolbarItemBto.getFkItemId());
                                endBean.setTitle(itemBto.getName());
                                endBean.setKey(toolbarItemBto.getToolbaritemId());
                                endBean.setType(2);
                                endBean.setChildren(null);
                                endList.add(endBean);
                            }
                            socendBean.setChildren(endList);
                            socendList.add(socendBean);
                        }
                        list.setChildren(socendList);
                        sonList.add(list);
                    }
                }
            }
            fatherList.get(i).setChildren(sonList);
        }
        return fatherList;
    }

}
