package com.intest.dao.entity;

import java.util.Date;

public class PartsPackageBto {
    /**
     * 主键 PARTSPACKAGE_ID
     */
    private String partspackageId;

    /**
     * 零部件大包表ID FK_PARTSBIGPACKAGE_ID
     */
    private String fkPartsbigpackageId;

    /**
     * 零部件表ID FK_PARTS_ID
     */
    private String fkPartsId;

    /**
     * 文件信息ID FK_FILE_ID
     */
    private String fkFileId;

    /**
     * 软件版本 SOFTWAREVERSION
     */
    private String softwareversion;

    /**
     * 硬件版本 HARDWAREVERSION
     */
    private String hardwareversion;

    /**
     * 零部件号 PARTNUMBER
     */
    private String partnumber;

    /**
     * 发送ID SENDID
     */
    private String sendid;

    /**
     * 接受ID RECEIVEID
     */
    private String receiveid;

    /**
     * 零部件总成号 PARTSASSEMBLYNUMBER
     */
    private String partsassemblynumber;

    /**
     * MD5值 MD5
     */
    private String md5;

    /**
     * 项目代号 PROJECTCODE
     */
    private String projectcode;

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
     * 类型:0-全量包，1-差分包 PACKAGETYPE
     */
    private Short packagetype;

    /**
     * 目标软件版本,用于差分包，作为差分包的目标版本 TARGETSOFTWAREVERSION
     */
    private String targetsoftwareversion;

    /**
     * 主键
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return PARTSPACKAGE_ID 主键
     */
    public String getPartspackageId() {
        return partspackageId;
    }

    /**
     * 主键
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param partspackageId 主键
     */
    public void setPartspackageId(String partspackageId) {
        this.partspackageId = partspackageId == null ? null : partspackageId.trim();
    }

    /**
     * 零部件大包表ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return FK_PARTSBIGPACKAGE_ID 零部件大包表ID
     */
    public String getFkPartsbigpackageId() {
        return fkPartsbigpackageId;
    }

    /**
     * 零部件大包表ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param fkPartsbigpackageId 零部件大包表ID
     */
    public void setFkPartsbigpackageId(String fkPartsbigpackageId) {
        this.fkPartsbigpackageId = fkPartsbigpackageId == null ? null : fkPartsbigpackageId.trim();
    }

    /**
     * 零部件表ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return FK_PARTS_ID 零部件表ID
     */
    public String getFkPartsId() {
        return fkPartsId;
    }

    /**
     * 零部件表ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param fkPartsId 零部件表ID
     */
    public void setFkPartsId(String fkPartsId) {
        this.fkPartsId = fkPartsId == null ? null : fkPartsId.trim();
    }

    /**
     * 文件信息ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return FK_FILE_ID 文件信息ID
     */
    public String getFkFileId() {
        return fkFileId;
    }

    /**
     * 文件信息ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param fkFileId 文件信息ID
     */
    public void setFkFileId(String fkFileId) {
        this.fkFileId = fkFileId == null ? null : fkFileId.trim();
    }

    /**
     * 软件版本
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return SOFTWAREVERSION 软件版本
     */
    public String getSoftwareversion() {
        return softwareversion;
    }

    /**
     * 软件版本
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param softwareversion 软件版本
     */
    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion == null ? null : softwareversion.trim();
    }

    /**
     * 硬件版本
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return HARDWAREVERSION 硬件版本
     */
    public String getHardwareversion() {
        return hardwareversion;
    }

    /**
     * 硬件版本
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param hardwareversion 硬件版本
     */
    public void setHardwareversion(String hardwareversion) {
        this.hardwareversion = hardwareversion == null ? null : hardwareversion.trim();
    }

    /**
     * 零部件号
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return PARTNUMBER 零部件号
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * 零部件号
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param partnumber 零部件号
     */
    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber == null ? null : partnumber.trim();
    }

    /**
     * 发送ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return SENDID 发送ID
     */
    public String getSendid() {
        return sendid;
    }

    /**
     * 发送ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param sendid 发送ID
     */
    public void setSendid(String sendid) {
        this.sendid = sendid == null ? null : sendid.trim();
    }

    /**
     * 接受ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return RECEIVEID 接受ID
     */
    public String getReceiveid() {
        return receiveid;
    }

    /**
     * 接受ID
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param receiveid 接受ID
     */
    public void setReceiveid(String receiveid) {
        this.receiveid = receiveid == null ? null : receiveid.trim();
    }

    /**
     * 零部件总成号
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return PARTSASSEMBLYNUMBER 零部件总成号
     */
    public String getPartsassemblynumber() {
        return partsassemblynumber;
    }

    /**
     * 零部件总成号
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param partsassemblynumber 零部件总成号
     */
    public void setPartsassemblynumber(String partsassemblynumber) {
        this.partsassemblynumber = partsassemblynumber == null ? null : partsassemblynumber.trim();
    }

    /**
     * MD5值
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return MD5 MD5值
     */
    public String getMd5() {
        return md5;
    }

    /**
     * MD5值
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param md5 MD5值
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    /**
     * 项目代号
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return PROJECTCODE 项目代号
     */
    public String getProjectcode() {
        return projectcode;
    }

    /**
     * 项目代号
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param projectcode 项目代号
     */
    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode == null ? null : projectcode.trim();
    }

    /**
     * 是否删除
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return ISDELETE 是否删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param isdelete 是否删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * 类型:0-全量包，1-差分包
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return PACKAGETYPE 类型:0-全量包，1-差分包
     */
    public Short getPackagetype() {
        return packagetype;
    }

    /**
     * 类型:0-全量包，1-差分包
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param packagetype 类型:0-全量包，1-差分包
     */
    public void setPackagetype(Short packagetype) {
        this.packagetype = packagetype;
    }

    /**
     * 目标软件版本,用于差分包，作为差分包的目标版本
     * @author intest
     * @date 2020-09-05 14:12:37
     * @return TARGETSOFTWAREVERSION 目标软件版本,用于差分包，作为差分包的目标版本
     */
    public String getTargetsoftwareversion() {
        return targetsoftwareversion;
    }

    /**
     * 目标软件版本,用于差分包，作为差分包的目标版本
     * @author intest
     * @date 2020-09-05 14:12:37
     * @param targetsoftwareversion 目标软件版本,用于差分包，作为差分包的目标版本
     */
    public void setTargetsoftwareversion(String targetsoftwareversion) {
        this.targetsoftwareversion = targetsoftwareversion == null ? null : targetsoftwareversion.trim();
    }
}