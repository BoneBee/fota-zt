package com.intest.dao.entity;

import java.util.Date;

public class OptionBto {
    /**
     * 主键ID OPTION_ID
     */
    private String optionId;

    /**
     * 参数类型（1-输入框；2-下拉框；3-区间选择框；） KIND
     */
    private Short kind;

    /**
     * 数据类型（1-字符；2-数字；3-字母；4-日期时间；5-VIN；） DATE_TYPE
     */
    private Short dateType;

    /**
     * 最大长度 MAX_LENGTH
     */
    private Integer maxLength;

    /**
     * 最小长度 MIN_LENGTH
     */
    private Integer minLength;

    /**
     * 最大值 MAX_NUM
     */
    private Integer maxNum;

    /**
     * 最小值 MIN_NUM
     */
    private Integer minNum;

    /**
     * 正则 REGULAR_TEXT
     */
    private String regularText;

    /**
     * 时间格式 DATE_FORMAT
     */
    private String dateFormat;

    /**
     * 查询字段 QUERY_FIELDS
     */
    private String queryFields;

    /**
     * 下拉值（json数组格式存储，建议10个一下参数时可用） LISTOFFILTER
     */
    private String listoffilter;

    /**
     * 数据来源 DATE_SOURCE_KIND
     */
    private Short dateSourceKind;

    /**
     * 值范围 VALUE_RANGE
     */
    private String valueRange;

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
     * 文字描述 FIELD_TEXT
     */
    private String fieldText;

    /**
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return OPTION_ID 主键ID
     */
    public String getOptionId() {
        return optionId;
    }

    /**
     * 主键ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param optionId 主键ID
     */
    public void setOptionId(String optionId) {
        this.optionId = optionId == null ? null : optionId.trim();
    }

    /**
     * 参数类型（1-输入框；2-下拉框；3-区间选择框；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return KIND 参数类型（1-输入框；2-下拉框；3-区间选择框；）
     */
    public Short getKind() {
        return kind;
    }

    /**
     * 参数类型（1-输入框；2-下拉框；3-区间选择框；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param kind 参数类型（1-输入框；2-下拉框；3-区间选择框；）
     */
    public void setKind(Short kind) {
        this.kind = kind;
    }

    /**
     * 数据类型（1-字符；2-数字；3-字母；4-日期时间；5-VIN；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return DATE_TYPE 数据类型（1-字符；2-数字；3-字母；4-日期时间；5-VIN；）
     */
    public Short getDateType() {
        return dateType;
    }

    /**
     * 数据类型（1-字符；2-数字；3-字母；4-日期时间；5-VIN；）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param dateType 数据类型（1-字符；2-数字；3-字母；4-日期时间；5-VIN；）
     */
    public void setDateType(Short dateType) {
        this.dateType = dateType;
    }

    /**
     * 最大长度
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return MAX_LENGTH 最大长度
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * 最大长度
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param maxLength 最大长度
     */
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * 最小长度
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return MIN_LENGTH 最小长度
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * 最小长度
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param minLength 最小长度
     */
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    /**
     * 最大值
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return MAX_NUM 最大值
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    /**
     * 最大值
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param maxNum 最大值
     */
    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * 最小值
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return MIN_NUM 最小值
     */
    public Integer getMinNum() {
        return minNum;
    }

    /**
     * 最小值
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param minNum 最小值
     */
    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    /**
     * 正则
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return REGULAR_TEXT 正则
     */
    public String getRegularText() {
        return regularText;
    }

    /**
     * 正则
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param regularText 正则
     */
    public void setRegularText(String regularText) {
        this.regularText = regularText == null ? null : regularText.trim();
    }

    /**
     * 时间格式
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return DATE_FORMAT 时间格式
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * 时间格式
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param dateFormat 时间格式
     */
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat == null ? null : dateFormat.trim();
    }

    /**
     * 查询字段
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return QUERY_FIELDS 查询字段
     */
    public String getQueryFields() {
        return queryFields;
    }

    /**
     * 查询字段
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param queryFields 查询字段
     */
    public void setQueryFields(String queryFields) {
        this.queryFields = queryFields == null ? null : queryFields.trim();
    }

    /**
     * 下拉值（json数组格式存储，建议10个一下参数时可用）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return LISTOFFILTER 下拉值（json数组格式存储，建议10个一下参数时可用）
     */
    public String getListoffilter() {
        return listoffilter;
    }

    /**
     * 下拉值（json数组格式存储，建议10个一下参数时可用）
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param listoffilter 下拉值（json数组格式存储，建议10个一下参数时可用）
     */
    public void setListoffilter(String listoffilter) {
        this.listoffilter = listoffilter == null ? null : listoffilter.trim();
    }

    /**
     * 数据来源
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return DATE_SOURCE_KIND 数据来源
     */
    public Short getDateSourceKind() {
        return dateSourceKind;
    }

    /**
     * 数据来源
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param dateSourceKind 数据来源
     */
    public void setDateSourceKind(Short dateSourceKind) {
        this.dateSourceKind = dateSourceKind;
    }

    /**
     * 值范围
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return VALUE_RANGE 值范围
     */
    public String getValueRange() {
        return valueRange;
    }

    /**
     * 值范围
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param valueRange 值范围
     */
    public void setValueRange(String valueRange) {
        this.valueRange = valueRange == null ? null : valueRange.trim();
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
     * 文字描述
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FIELD_TEXT 文字描述
     */
    public String getFieldText() {
        return fieldText;
    }

    /**
     * 文字描述
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fieldText 文字描述
     */
    public void setFieldText(String fieldText) {
        this.fieldText = fieldText == null ? null : fieldText.trim();
    }
}