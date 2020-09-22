package com.intest.dao.entity;

import java.util.Date;

public class UserRolePermissionBto {
    /**
     * 用户角色权限ID USER_ROLE_PERMISSION_ID
     */
    private String userRolePermissionId;

    /**
     * 用户ID FK_USER_ID
     */
    private String fkUserId;

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
     * 用户角色权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return USER_ROLE_PERMISSION_ID 用户角色权限ID
     */
    public String getUserRolePermissionId() {
        return userRolePermissionId;
    }

    /**
     * 用户角色权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param userRolePermissionId 用户角色权限ID
     */
    public void setUserRolePermissionId(String userRolePermissionId) {
        this.userRolePermissionId = userRolePermissionId == null ? null : userRolePermissionId.trim();
    }

    /**
     * 用户ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return FK_USER_ID 用户ID
     */
    public String getFkUserId() {
        return fkUserId;
    }

    /**
     * 用户ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param fkUserId 用户ID
     */
    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
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