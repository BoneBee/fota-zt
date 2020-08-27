package com.intest.packageparser.file;

public class FileResult {
    public FileResult(String key, String requiredSuffix, boolean isRequired, String remark){
        this.key = key;
        this.requiredSuffix = requiredSuffix;
        this.isRequired = isRequired;
        this.remark = remark;
    }

    /**
     * 文件信息ID
     */
    private String fileId;
    /**
     * 文件的唯一标识
     * 比如：1，2，3
     */
    private String key;
    /**
     * 文件后缀
     */
    private String suffix;
    /**
     * 文件指定的后缀
     */
    private String requiredSuffix;
    /**
     * 文件是否必须
     * true:必须
     * false:非必须
     */
    private boolean isRequired;
    /**
     * 文件是否存在
     * true:存在
     * false:不存在
     */
    private boolean isFileExist;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 文件大小
     */
    private Long fileSize;
    /**
     * 备注
     */
    private String remark;
    /**
     * 软件序号
     * 多个2-，7- 文件存在软件序号(Axx, Cxx)
     */
    private String softwareOrderNum;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getRequiredSuffix() {
        return requiredSuffix;
    }

    public void setRequiredSuffix(String requiredSuffix) {
        this.requiredSuffix = requiredSuffix;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public boolean isFileExist() {
        return isFileExist;
    }

    public void setFileExist(boolean fileExist) {
        isFileExist = fileExist;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSoftwareOrderNum() {
        return softwareOrderNum;
    }

    public void setSoftwareOrderNum(String softwareOrderNum) {
        this.softwareOrderNum = softwareOrderNum;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}


