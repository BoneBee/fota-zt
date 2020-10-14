package com.intest.systemservice.request;

import java.util.List;

public class AddRoleRequet {
    private String roleName;
    private int roleType;
    private String remark;
    private List<PermissionBean> children;

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

    public List<PermissionBean> getChildren() {
        return children;
    }

    public void setChildren(List<PermissionBean> children) {
        this.children = children;
    }

    public static class PermissionBean {
        private String id;
        private int resourceType;
        private int isCheck;
        private List<PermissionBean> children;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getResourceType() {
            return resourceType;
        }

        public void setResourceType(int resourceType) {
            this.resourceType = resourceType;
        }

        public int getIsCheck() {
            return isCheck;
        }

        public void setIsCheck(int isCheck) {
            this.isCheck = isCheck;
        }

        public List<PermissionBean> getChildren() {
            return children;
        }

        public void setChildren(List<PermissionBean> children) {
            this.children = children;
        }
    }
}
