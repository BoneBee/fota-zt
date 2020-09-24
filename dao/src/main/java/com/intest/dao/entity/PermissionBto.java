package com.intest.dao.entity;

import java.util.Date;

public class PermissionBto {
    /**
     * 权限ID PERMISSION_ID
     */
    private String permissionId;

    /**
     * 权限资源ID （F_Menu、F_Funtion） FK_RESOURCE_ID
     */
    private String fkResourceId;

    /**
     * 权限资源类型（1-页面菜单权限 2-功能权限） RESOURCE_TYPE
     */
    private Short resourceType;

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
     * 权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return PERMISSION_ID 权限ID
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 权限ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param permissionId 权限ID
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    /**
     * 权限资源ID （F_Menu、F_Funtion）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return FK_RESOURCE_ID 权限资源ID （F_Menu、F_Funtion）
     */
    public String getFkResourceId() {
        return fkResourceId;
    }

    /**
     * 权限资源ID （F_Menu、F_Funtion）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param fkResourceId 权限资源ID （F_Menu、F_Funtion）
     */
    public void setFkResourceId(String fkResourceId) {
        this.fkResourceId = fkResourceId == null ? null : fkResourceId.trim();
    }

    /**
     * 权限资源类型（1-页面菜单权限 2-功能权限）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return RESOURCE_TYPE 权限资源类型（1-页面菜单权限 2-功能权限）
     */
    public Short getResourceType() {
        return resourceType;
    }

    /**
     * 权限资源类型（1-页面菜单权限 2-功能权限）
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param resourceType 权限资源类型（1-页面菜单权限 2-功能权限）
     */
    public void setResourceType(Short resourceType) {
        this.resourceType = resourceType;
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