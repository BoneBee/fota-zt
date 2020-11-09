package com.intest.systemservice.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.intest.dao.entity.table.MenuExtend;

import java.util.Date;
import java.util.List;

public class RoleDetailListResponse {
    private int index;
    private String roleId;
    private String roleName;
    private int roleType;
    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createat;
    private String createby;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateat;
    private String updateby;
    private List<MenuExtend> list;


    public RoleDetailListResponse() {
    }

    public RoleDetailListResponse(int index, String roleId, String roleName, int roleType, String remark, Date createat, String createby, Date updateat, String updateby, List<MenuExtend> list) {
        this.index = index;
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleType = roleType;
        this.remark = remark;
        this.createat = createat;
        this.createby = createby;
        this.updateat = updateat;
        this.updateby = updateby;
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

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

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public List<MenuExtend> getList() {
        return list;
    }

    public void setList(List<MenuExtend> list) {
        this.list = list;
    }
}
