package com.intest.dao.entity;

import java.util.Date;

public class ToolbarBto {
    /**
     * 主键ID TOOLBAR_ID
     */
    private String toolbarId;

    /**
     * 是否有checkbox列（1-有，0-无） CHARECKED
     */
    private Short charecked;

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
     * 表格主键 FK_TABLE_ID
     */
    private String fkTableId;

    /**
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return TOOLBAR_ID 主键ID
     */
    public String getToolbarId() {
        return toolbarId;
    }

    /**
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param toolbarId 主键ID
     */
    public void setToolbarId(String toolbarId) {
        this.toolbarId = toolbarId == null ? null : toolbarId.trim();
    }

    /**
     * 是否有checkbox列（1-有，0-无）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CHARECKED 是否有checkbox列（1-有，0-无）
     */
    public Short getCharecked() {
        return charecked;
    }

    /**
     * 是否有checkbox列（1-有，0-无）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param charecked 是否有checkbox列（1-有，0-无）
     */
    public void setCharecked(Short charecked) {
        this.charecked = charecked;
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
     * 表格主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_TABLE_ID 表格主键
     */
    public String getFkTableId() {
        return fkTableId;
    }

    /**
     * 表格主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkTableId 表格主键
     */
    public void setFkTableId(String fkTableId) {
        this.fkTableId = fkTableId == null ? null : fkTableId.trim();
    }
}