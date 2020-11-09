package com.intest.systemservice.request;

import java.util.List;

public class AddRoleRequet {
    private String roleName;
    private int roleType;
    private String remark;
    private List<PermissionBean> list;

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

    public List<PermissionBean> getList() {
        return list;
    }

    public void setList(List<PermissionBean> list) {
        this.list = list;
    }

    public static class PermissionBean {
        private String key;
        private int type;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

    }
}
