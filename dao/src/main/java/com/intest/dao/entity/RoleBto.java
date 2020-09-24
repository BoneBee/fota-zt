package com.intest.dao.entity;

import java.util.Date;

public class RoleBto {
    /**
     * 角色ID ROLE_ID
     */
    private String roleId;

    /**
     * 角色名称 ROLE_NAME
     */
    private String roleName;

    /**
     * 角色类型 0-模式角色 1-管理员角色 ROLE_TYPE
     */
    private Short roleType;

    /**
     * 备注 REMARK
     */
    private String remark;

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
     * 角色ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return ROLE_ID 角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param roleId 角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 角色名称
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return ROLE_NAME 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色类型 0-模式角色 1-管理员角色
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return ROLE_TYPE 角色类型 0-模式角色 1-管理员角色
     */
    public Short getRoleType() {
        return roleType;
    }

    /**
     * 角色类型 0-模式角色 1-管理员角色
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param roleType 角色类型 0-模式角色 1-管理员角色
     */
    public void setRoleType(Short roleType) {
        this.roleType = roleType;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-09-21 12:17:15
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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