package com.intest.systemservice.request;

import java.util.List;

public class UpdateRoleRequet {
    private String roleId;
    private String roleName;
    private int roleType;
    private String remark;
    private List<AddRoleRequet.PermissionBean> list;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<AddRoleRequet.PermissionBean> getList() {
        return list;
    }

    public void setList(List<AddRoleRequet.PermissionBean> list) {
        this.list = list;
    }

}
