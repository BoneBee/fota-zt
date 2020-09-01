package com.intest.dao.entity;

/**
 * @author intest
 * 文件信息实体
 */
public class FileInfo {
    /**
     * 文件信息编号
     */
    private String fileId;
    /**
     * 原始文件名称
     */
    private String originalName;
    /**
     * 文件后缀
     */
    private String suffix;
    /**
     * 文件大小
     */
    private Long fileSize;
    /**
     * MD5值
     */
    private String md5;
    /**
     * 文件存储对应的目录KEY
     */
    private String valueListKey;
    /**
     * 相对存储目录的子目录
     */
    private String serverSidePath;
    /**
     * 上传人员
     */
    private String uploadingUser;
    /**
     * 备注
     */
    private String note;
    /**
     * 创建人
     */
    private String createBy;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getValueListKey() {
        return valueListKey;
    }

    public void setValueListKey(String valueListKey) {
        this.valueListKey = valueListKey;
    }

    public String getServerSidePath() {
        return serverSidePath;
    }

    public void setServerSidePath(String serverSidePath) {
        this.serverSidePath = serverSidePath;
    }

    public String getUploadingUser() {
        return uploadingUser;
    }

    public void setUploadingUser(String uploadingUser) {
        this.uploadingUser = uploadingUser;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
