package com.intest.dao.entity;

import java.util.Date;

public class TableBto {
    /**
     * 主键，表格组件ID TABLE_ID
     */
    private String tableId;

    /**
     * 菜单ID FK_MENU_ID
     */
    private String fkMenuId;

    /**
     * 备注 REMARK
     */
    private String remark;

    /**
     * 是否删除 ISDELETE
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
     * 主键，表格组件ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return TABLE_ID 主键，表格组件ID
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * 主键，表格组件ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param tableId 主键，表格组件ID
     */
    public void setTableId(String tableId) {
        this.tableId = tableId == null ? null : tableId.trim();
    }

    /**
     * 菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_MENU_ID 菜单ID
     */
    public String getFkMenuId() {
        return fkMenuId;
    }

    /**
     * 菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkMenuId 菜单ID
     */
    public void setFkMenuId(String fkMenuId) {
        this.fkMenuId = fkMenuId == null ? null : fkMenuId.trim();
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
     * 是否删除
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISDELETE 是否删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isdelete 是否删除
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