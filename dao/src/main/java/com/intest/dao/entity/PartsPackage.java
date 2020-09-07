package com.intest.dao.entity;

public class PartsPackage {

    /**
     * 零部件包编号
     */
    private String partsPackageId;
    /**
     * 原始包编号
      */
    private String packageId;
    /**
     * 零部件编号
      */
    private String partsId;
    /**
     * 文件信息ID
     */
    private String fileId;
    /**
     * 软件版本
     */
    private String softwareVersion;
    /**
     * 硬件版本
     */
    private String hardwareVersion;
    /**
     * 零部件号
     */
    private String partNumber;
    /**
     * 发送ID
     */
    private String sendId;
    /**
     * 接收ID
     */
    private String receiveId;
    /**
     * 零部件总成号
     */
    private String partsAssemblyNumber;
    /**
     * MD5值
      */
    private String md5;
    /**
     * 项目代号
     */
    private String projectCode;
    /**
     * 创建人
     */
    private String createBy;

    public String getPartsPackageId() {
        return partsPackageId;
    }

    public void setPartsPackageId(String partsPackageId) {
        this.partsPackageId = partsPackageId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getPartsId() {
        return partsId;
    }

    public void setPartsId(String partsId) {
        this.partsId = partsId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getPartsAssemblyNumber() {
        return partsAssemblyNumber;
    }

    public void setPartsAssemblyNumber(String partsAssemblyNumber) {
        this.partsAssemblyNumber = partsAssemblyNumber;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
