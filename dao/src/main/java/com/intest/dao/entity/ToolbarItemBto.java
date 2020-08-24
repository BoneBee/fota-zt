package com.intest.dao.entity;

import java.util.Date;

public class ToolbarItemBto {
    /**
     * 主键ID TOOLBARITEM_ID
     */
    private String toolbaritemId;

    /**
     * 表格工具栏ID FK_TOOLBAR_ID
     */
    private String fkToolbarId;

    /**
     * 表格工具栏子项表ID FK_ITEM_ID
     */
    private String fkItemId;

    /**
     * 顺序 INTDEX
     */
    private Short intdex;

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
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return TOOLBARITEM_ID 主键ID
     */
    public String getToolbaritemId() {
        return toolbaritemId;
    }

    /**
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param toolbaritemId 主键ID
     */
    public void setToolbaritemId(String toolbaritemId) {
        this.toolbaritemId = toolbaritemId == null ? null : toolbaritemId.trim();
    }

    /**
     * 表格工具栏ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_TOOLBAR_ID 表格工具栏ID
     */
    public String getFkToolbarId() {
        return fkToolbarId;
    }

    /**
     * 表格工具栏ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkToolbarId 表格工具栏ID
     */
    public void setFkToolbarId(String fkToolbarId) {
        this.fkToolbarId = fkToolbarId == null ? null : fkToolbarId.trim();
    }

    /**
     * 表格工具栏子项表ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_ITEM_ID 表格工具栏子项表ID
     */
    public String getFkItemId() {
        return fkItemId;
    }

    /**
     * 表格工具栏子项表ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkItemId 表格工具栏子项表ID
     */
    public void setFkItemId(String fkItemId) {
        this.fkItemId = fkItemId == null ? null : fkItemId.trim();
    }

    /**
     * 顺序
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return INTDEX 顺序
     */
    public Short getIntdex() {
        return intdex;
    }

    /**
     * 顺序
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param intdex 顺序
     */
    public void setIntdex(Short intdex) {
        this.intdex = intdex;
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
}