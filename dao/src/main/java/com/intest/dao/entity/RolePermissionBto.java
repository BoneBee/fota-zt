package com.intest.dao.entity;

import java.util.Date;

public class RolePermissionBto {
    /**
     * 角色权限ID ROLEPERMISSION_ID
     */
    private String rolepermissionId;

    /**
     * 角色ID FK_ROLE_ID
     */
    private String fkRoleId;

    /**
     * 权限ID FK_PERMISSION_ID
     */
    private String fkPermissionId;

    /**
     * 是否默认勾选（1-默认勾选，0-默认不勾选；） DEFAULT_CHECKED
     */
    private Short defaultChecked;

    /**
     * 是否删除（1-未删除，0-已删除；） ISDELETE
     */
    private Short isdelete;

    /**
     * 创建时间 CREATEAT
     */
    private Date createat;

    /**
     * 创建人 CREATEBY
     */
    private String createby;

    /**
     * 修改时间 UPDATEAT
     */
    private Date updateat;

    /**
     * 修改人 UPDATEBY
     */
    private String updateby;

    /**
     * 角色权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return ROLEPERMISSION_ID 角色权限ID
     */
    public String getRolepermissionId() {
        return rolepermissionId;
    }

    /**
     * 角色权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param rolepermissionId 角色权限ID
     */
    public void setRolepermissionId(String rolepermissionId) {
        this.rolepermissionId = rolepermissionId == null ? null : rolepermissionId.trim();
    }

    /**
     * 角色ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return FK_ROLE_ID 角色ID
     */
    public String getFkRoleId() {
        return fkRoleId;
    }

    /**
     * 角色ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param fkRoleId 角色ID
     */
    public void setFkRoleId(String fkRoleId) {
        this.fkRoleId = fkRoleId == null ? null : fkRoleId.trim();
    }

    /**
     * 权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return FK_PERMISSION_ID 权限ID
     */
    public String getFkPermissionId() {
        return fkPermissionId;
    }

    /**
     * 权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param fkPermissionId 权限ID
     */
    public void setFkPermissionId(String fkPermissionId) {
        this.fkPermissionId = fkPermissionId == null ? null : fkPermissionId.trim();
    }

    /**
     * 是否默认勾选（1-默认勾选，0-默认不勾选；）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return DEFAULT_CHECKED 是否默认勾选（1-默认勾选，0-默认不勾选；）
     */
    public Short getDefaultChecked() {
        return defaultChecked;
    }

    /**
     * 是否默认勾选（1-默认勾选，0-默认不勾选；）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param defaultChecked 是否默认勾选（1-默认勾选，0-默认不勾选；）
     */
    public void setDefaultChecked(Short defaultChecked) {
        this.defaultChecked = defaultChecked;
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return ISDELETE 是否删除（1-未删除，0-已删除；）
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param isdelete 是否删除（1-未删除，0-已删除；）
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}