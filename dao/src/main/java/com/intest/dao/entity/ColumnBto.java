package com.intest.dao.entity;

import java.util.Date;

public class ColumnBto {
    /**
     * 主键 COLUMN_ID
     */
    private String columnId;

    /**
     * 列名称 COLUMN_NAME
     */
    private String columnName;

    /**
     * 列顺序 ORDER_NUM
     */
    private Short orderNum;

    /**
     * 表格列宽度 WIDTH
     */
    private Integer width;

    /**
     * 是否选中（1：显示；0：隐藏；） ISSHOW
     */
    private Short isshow;

    /**
     * 列排序（ascend/descend/null） SORT
     */
    private String sort;

    /**
     * 是否能排序（1：能排序；0：不能排序；） ISCANSORT
     */
    private Short iscansort;

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
     * 修改人  UPDATEBY
     */
    private String updateby;

    /**
     * 属性字段名称 DATAPROPERTYNAME
     */
    private String datapropertyname;

    /**
     * 主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return COLUMN_ID 主键
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * 主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param columnId 主键
     */
    public void setColumnId(String columnId) {
        this.columnId = columnId == null ? null : columnId.trim();
    }

    /**
     * 列名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return COLUMN_NAME 列名称
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 列名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param columnName 列名称
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * 列顺序
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ORDER_NUM 列顺序
     */
    public Short getOrderNum() {
        return orderNum;
    }

    /**
     * 列顺序
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param orderNum 列顺序
     */
    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 表格列宽度
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return WIDTH 表格列宽度
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 表格列宽度
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param width 表格列宽度
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 是否选中（1：显示；0：隐藏；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISSHOW 是否选中（1：显示；0：隐藏；）
     */
    public Short getIsshow() {
        return isshow;
    }

    /**
     * 是否选中（1：显示；0：隐藏；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isshow 是否选中（1：显示；0：隐藏；）
     */
    public void setIsshow(Short isshow) {
        this.isshow = isshow;
    }

    /**
     * 列排序（ascend/descend/null）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return SORT 列排序（ascend/descend/null）
     */
    public String getSort() {
        return sort;
    }

    /**
     * 列排序（ascend/descend/null）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param sort 列排序（ascend/descend/null）
     */
    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    /**
     * 是否能排序（1：能排序；0：不能排序；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISCANSORT 是否能排序（1：能排序；0：不能排序；）
     */
    public Short getIscansort() {
        return iscansort;
    }

    /**
     * 是否能排序（1：能排序；0：不能排序；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param iscansort 是否能排序（1：能排序；0：不能排序；）
     */
    public void setIscansort(Short iscansort) {
        this.iscansort = iscansort;
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

    /**
     * 属性字段名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return DATAPROPERTYNAME 属性字段名称
     */
    public String getDatapropertyname() {
        return datapropertyname;
    }

    /**
     * 属性字段名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param datapropertyname 属性字段名称
     */
    public void setDatapropertyname(String datapropertyname) {
        this.datapropertyname = datapropertyname == null ? null : datapropertyname.trim();
    }
}