package com.intest.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PartsPackageBto {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.PARTSPACKAGE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String partspackageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.FK_PARTSBIGPACKAGE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String fkPartsbigpackageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.FK_PARTS_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String fkPartsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.FK_FILE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String fkFileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.SOFTWAREVERSION
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String softwareversion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.HARDWAREVERSION
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String hardwareversion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.PARTNUMBER
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String partnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.SENDID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String sendid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.RECEIVEID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String receiveid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.PARTSASSEMBLYNUMBER
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String partsassemblynumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.MD5
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String md5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.PROJECTCODE
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String projectcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.ISDELETE
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private BigDecimal isdelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.CREATEAT
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private Date createat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.CREATEBY
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.UPDATEAT
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private Date updateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column F_PARTSPACKAGE.UPDATEBY
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    private String updateby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.PARTSPACKAGE_ID
     *
     * @return the value of F_PARTSPACKAGE.PARTSPACKAGE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getPartspackageId() {
        return partspackageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.PARTSPACKAGE_ID
     *
     * @param partspackageId the value for F_PARTSPACKAGE.PARTSPACKAGE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setPartspackageId(String partspackageId) {
        this.partspackageId = partspackageId == null ? null : partspackageId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.FK_PARTSBIGPACKAGE_ID
     *
     * @return the value of F_PARTSPACKAGE.FK_PARTSBIGPACKAGE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getFkPartsbigpackageId() {
        return fkPartsbigpackageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.FK_PARTSBIGPACKAGE_ID
     *
     * @param fkPartsbigpackageId the value for F_PARTSPACKAGE.FK_PARTSBIGPACKAGE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setFkPartsbigpackageId(String fkPartsbigpackageId) {
        this.fkPartsbigpackageId = fkPartsbigpackageId == null ? null : fkPartsbigpackageId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.FK_PARTS_ID
     *
     * @return the value of F_PARTSPACKAGE.FK_PARTS_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getFkPartsId() {
        return fkPartsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.FK_PARTS_ID
     *
     * @param fkPartsId the value for F_PARTSPACKAGE.FK_PARTS_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setFkPartsId(String fkPartsId) {
        this.fkPartsId = fkPartsId == null ? null : fkPartsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.FK_FILE_ID
     *
     * @return the value of F_PARTSPACKAGE.FK_FILE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getFkFileId() {
        return fkFileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.FK_FILE_ID
     *
     * @param fkFileId the value for F_PARTSPACKAGE.FK_FILE_ID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setFkFileId(String fkFileId) {
        this.fkFileId = fkFileId == null ? null : fkFileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.SOFTWAREVERSION
     *
     * @return the value of F_PARTSPACKAGE.SOFTWAREVERSION
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getSoftwareversion() {
        return softwareversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.SOFTWAREVERSION
     *
     * @param softwareversion the value for F_PARTSPACKAGE.SOFTWAREVERSION
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion == null ? null : softwareversion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.HARDWAREVERSION
     *
     * @return the value of F_PARTSPACKAGE.HARDWAREVERSION
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getHardwareversion() {
        return hardwareversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.HARDWAREVERSION
     *
     * @param hardwareversion the value for F_PARTSPACKAGE.HARDWAREVERSION
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setHardwareversion(String hardwareversion) {
        this.hardwareversion = hardwareversion == null ? null : hardwareversion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.PARTNUMBER
     *
     * @return the value of F_PARTSPACKAGE.PARTNUMBER
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.PARTNUMBER
     *
     * @param partnumber the value for F_PARTSPACKAGE.PARTNUMBER
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber == null ? null : partnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.SENDID
     *
     * @return the value of F_PARTSPACKAGE.SENDID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getSendid() {
        return sendid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.SENDID
     *
     * @param sendid the value for F_PARTSPACKAGE.SENDID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setSendid(String sendid) {
        this.sendid = sendid == null ? null : sendid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.RECEIVEID
     *
     * @return the value of F_PARTSPACKAGE.RECEIVEID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getReceiveid() {
        return receiveid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.RECEIVEID
     *
     * @param receiveid the value for F_PARTSPACKAGE.RECEIVEID
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setReceiveid(String receiveid) {
        this.receiveid = receiveid == null ? null : receiveid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.PARTSASSEMBLYNUMBER
     *
     * @return the value of F_PARTSPACKAGE.PARTSASSEMBLYNUMBER
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getPartsassemblynumber() {
        return partsassemblynumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.PARTSASSEMBLYNUMBER
     *
     * @param partsassemblynumber the value for F_PARTSPACKAGE.PARTSASSEMBLYNUMBER
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setPartsassemblynumber(String partsassemblynumber) {
        this.partsassemblynumber = partsassemblynumber == null ? null : partsassemblynumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.MD5
     *
     * @return the value of F_PARTSPACKAGE.MD5
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getMd5() {
        return md5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.MD5
     *
     * @param md5 the value for F_PARTSPACKAGE.MD5
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.PROJECTCODE
     *
     * @return the value of F_PARTSPACKAGE.PROJECTCODE
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getProjectcode() {
        return projectcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.PROJECTCODE
     *
     * @param projectcode the value for F_PARTSPACKAGE.PROJECTCODE
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode == null ? null : projectcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.ISDELETE
     *
     * @return the value of F_PARTSPACKAGE.ISDELETE
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public BigDecimal getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.ISDELETE
     *
     * @param isdelete the value for F_PARTSPACKAGE.ISDELETE
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setIsdelete(BigDecimal isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.CREATEAT
     *
     * @return the value of F_PARTSPACKAGE.CREATEAT
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.CREATEAT
     *
     * @param createat the value for F_PARTSPACKAGE.CREATEAT
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.CREATEBY
     *
     * @return the value of F_PARTSPACKAGE.CREATEBY
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.CREATEBY
     *
     * @param createby the value for F_PARTSPACKAGE.CREATEBY
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.UPDATEAT
     *
     * @return the value of F_PARTSPACKAGE.UPDATEAT
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.UPDATEAT
     *
     * @param updateat the value for F_PARTSPACKAGE.UPDATEAT
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column F_PARTSPACKAGE.UPDATEBY
     *
     * @return the value of F_PARTSPACKAGE.UPDATEBY
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column F_PARTSPACKAGE.UPDATEBY
     *
     * @param updateby the value for F_PARTSPACKAGE.UPDATEBY
     *
     * @mbg.generated Thu Aug 27 17:00:49 CST 2020
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}