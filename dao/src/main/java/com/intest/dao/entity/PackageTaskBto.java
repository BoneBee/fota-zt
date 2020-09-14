package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PackageTaskBto {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.PACKAGETASK_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String packagetaskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.FK_CARPACKAGEMAKETYPE_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String fkCarpackagemaketypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.FK_PACKAGETASKSTATUSVALUE_CODE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String fkPackagetaskstatusvalueCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.CREATEAT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private Date createat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.CREATEBY
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.UPDATEAT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private Date updateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.UPDATEBY
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String updateby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.FK_CARTYPE_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String fkCartypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.TITLE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.CONTENT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.PACKAGENAME
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private String packagename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PACKAGETASK.MAKETYPE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    private BigDecimal maketype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.PACKAGETASK_ID
     *
     * @return the value of F_PACKAGETASK.PACKAGETASK_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getPackagetaskId() {
        return packagetaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.PACKAGETASK_ID
     *
     * @param packagetaskId the value for F_PACKAGETASK.PACKAGETASK_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setPackagetaskId(String packagetaskId) {
        this.packagetaskId = packagetaskId == null ? null : packagetaskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.FK_CARPACKAGEMAKETYPE_ID
     *
     * @return the value of F_PACKAGETASK.FK_CARPACKAGEMAKETYPE_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getFkCarpackagemaketypeId() {
        return fkCarpackagemaketypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.FK_CARPACKAGEMAKETYPE_ID
     *
     * @param fkCarpackagemaketypeId the value for F_PACKAGETASK.FK_CARPACKAGEMAKETYPE_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setFkCarpackagemaketypeId(String fkCarpackagemaketypeId) {
        this.fkCarpackagemaketypeId = fkCarpackagemaketypeId == null ? null : fkCarpackagemaketypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.FK_PACKAGETASKSTATUSVALUE_CODE
     *
     * @return the value of F_PACKAGETASK.FK_PACKAGETASKSTATUSVALUE_CODE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getFkPackagetaskstatusvalueCode() {
        return fkPackagetaskstatusvalueCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.FK_PACKAGETASKSTATUSVALUE_CODE
     *
     * @param fkPackagetaskstatusvalueCode the value for F_PACKAGETASK.FK_PACKAGETASKSTATUSVALUE_CODE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setFkPackagetaskstatusvalueCode(String fkPackagetaskstatusvalueCode) {
        this.fkPackagetaskstatusvalueCode = fkPackagetaskstatusvalueCode == null ? null : fkPackagetaskstatusvalueCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.CREATEAT
     *
     * @return the value of F_PACKAGETASK.CREATEAT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.CREATEAT
     *
     * @param createat the value for F_PACKAGETASK.CREATEAT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.CREATEBY
     *
     * @return the value of F_PACKAGETASK.CREATEBY
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.CREATEBY
     *
     * @param createby the value for F_PACKAGETASK.CREATEBY
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.UPDATEAT
     *
     * @return the value of F_PACKAGETASK.UPDATEAT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.UPDATEAT
     *
     * @param updateat the value for F_PACKAGETASK.UPDATEAT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.UPDATEBY
     *
     * @return the value of F_PACKAGETASK.UPDATEBY
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.UPDATEBY
     *
     * @param updateby the value for F_PACKAGETASK.UPDATEBY
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.FK_CARTYPE_ID
     *
     * @return the value of F_PACKAGETASK.FK_CARTYPE_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getFkCartypeId() {
        return fkCartypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.FK_CARTYPE_ID
     *
     * @param fkCartypeId the value for F_PACKAGETASK.FK_CARTYPE_ID
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setFkCartypeId(String fkCartypeId) {
        this.fkCartypeId = fkCartypeId == null ? null : fkCartypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.TITLE
     *
     * @return the value of F_PACKAGETASK.TITLE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.TITLE
     *
     * @param title the value for F_PACKAGETASK.TITLE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.CONTENT
     *
     * @return the value of F_PACKAGETASK.CONTENT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.CONTENT
     *
     * @param content the value for F_PACKAGETASK.CONTENT
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.PACKAGENAME
     *
     * @return the value of F_PACKAGETASK.PACKAGENAME
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public String getPackagename() {
        return packagename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.PACKAGENAME
     *
     * @param packagename the value for F_PACKAGETASK.PACKAGENAME
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setPackagename(String packagename) {
        this.packagename = packagename == null ? null : packagename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PACKAGETASK.MAKETYPE
     *
     * @return the value of F_PACKAGETASK.MAKETYPE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public BigDecimal getMaketype() {
        return maketype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PACKAGETASK.MAKETYPE
     *
     * @param maketype the value for F_PACKAGETASK.MAKETYPE
     *
     * @mbg.generated Mon Sep 14 14:42:49 CST 2020
     */
    public void setMaketype(BigDecimal maketype) {
        this.maketype = maketype;
    }
}