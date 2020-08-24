package com.intest.dao.entity;

import java.util.Date;

public class ItemBto {
    /**
     * 主键ID ITEM_ID
     */
    private String itemId;

    /**
     * 名称 NAME
     */
    private String name;

    /**
     * 父菜单ID FK_ITEM_ID
     */
    private String fkItemId;

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
     * 图标 ICON
     */
    private String icon;

    /**
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ITEM_ID 主键ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param itemId 主键ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return NAME 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 父菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_ITEM_ID 父菜单ID
     */
    public String getFkItemId() {
        return fkItemId;
    }

    /**
     * 父菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkItemId 父菜单ID
     */
    public void setFkItemId(String fkItemId) {
        this.fkItemId = fkItemId == null ? null : fkItemId.trim();
    }

    /**
     * 备注
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISDELETE 是否删除（1-未删除，0-已删除；）
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isdelete 是否删除（1-未删除，0-已删除；）
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * 图标
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ICON 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}