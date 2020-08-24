package com.intest.dao.entity;

import java.util.Date;

public class UploadFileBto {
    /**
     * 主键 UPLOADFILE_ID
     */
    private String uploadfileId;

    /**
     * 原始文件名称 ORIGINALNAME
     */
    private String originalname;

    /**
     * 大小 FILESIZE
     */
    private Long filesize;

    /**
     * 上次修改时间 LASTMODIFIEDDATE
     */
    private Date lastmodifieddate;

    /**
     * 上传方式 1-支持断点续 2-不支持断点续传 UPLOADTYPE
     */
    private Short uploadtype;

    /**
     * 文件存储对应的目录key FK_VALUELIST_KEY
     */
    private String fkValuelistKey;

    /**
     * 相对存储目录的子目录 SERVERSIDEPATH
     */
    private String serversidepath;

    /**
     * 是否上传成功 1-成功，0-未完成 2-失败 UPLOADEDSUCCESS
     */
    private Short uploadedsuccess;

    /**
     * 开始上传时间 BEGINUPLOADINGTIME
     */
    private Date beginuploadingtime;

    /**
     * 完成上传时间 ENDUPLOADINGTIME
     */
    private Date enduploadingtime;

    /**
     * 1-未删除，0-已删除； ISDELETE
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
     * 主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPLOADFILE_ID 主键
     */
    public String getUploadfileId() {
        return uploadfileId;
    }

    /**
     * 主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param uploadfileId 主键
     */
    public void setUploadfileId(String uploadfileId) {
        this.uploadfileId = uploadfileId == null ? null : uploadfileId.trim();
    }

    /**
     * 原始文件名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ORIGINALNAME 原始文件名称
     */
    public String getOriginalname() {
        return originalname;
    }

    /**
     * 原始文件名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param originalname 原始文件名称
     */
    public void setOriginalname(String originalname) {
        this.originalname = originalname == null ? null : originalname.trim();
    }

    /**
     * 大小
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FILESIZE 大小
     */
    public Long getFilesize() {
        return filesize;
    }

    /**
     * 大小
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param filesize 大小
     */
    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    /**
     * 上次修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return LASTMODIFIEDDATE 上次修改时间
     */
    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    /**
     * 上次修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param lastmodifieddate 上次修改时间
     */
    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    /**
     * 上传方式 1-支持断点续 2-不支持断点续传
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPLOADTYPE 上传方式 1-支持断点续 2-不支持断点续传
     */
    public Short getUploadtype() {
        return uploadtype;
    }

    /**
     * 上传方式 1-支持断点续 2-不支持断点续传
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param uploadtype 上传方式 1-支持断点续 2-不支持断点续传
     */
    public void setUploadtype(Short uploadtype) {
        this.uploadtype = uploadtype;
    }

    /**
     * 文件存储对应的目录key
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_VALUELIST_KEY 文件存储对应的目录key
     */
    public String getFkValuelistKey() {
        return fkValuelistKey;
    }

    /**
     * 文件存储对应的目录key
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkValuelistKey 文件存储对应的目录key
     */
    public void setFkValuelistKey(String fkValuelistKey) {
        this.fkValuelistKey = fkValuelistKey == null ? null : fkValuelistKey.trim();
    }

    /**
     * 相对存储目录的子目录
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return SERVERSIDEPATH 相对存储目录的子目录
     */
    public String getServersidepath() {
        return serversidepath;
    }

    /**
     * 相对存储目录的子目录
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param serversidepath 相对存储目录的子目录
     */
    public void setServersidepath(String serversidepath) {
        this.serversidepath = serversidepath == null ? null : serversidepath.trim();
    }

    /**
     * 是否上传成功 1-成功，0-未完成 2-失败
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPLOADEDSUCCESS 是否上传成功 1-成功，0-未完成 2-失败
     */
    public Short getUploadedsuccess() {
        return uploadedsuccess;
    }

    /**
     * 是否上传成功 1-成功，0-未完成 2-失败
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param uploadedsuccess 是否上传成功 1-成功，0-未完成 2-失败
     */
    public void setUploadedsuccess(Short uploadedsuccess) {
        this.uploadedsuccess = uploadedsuccess;
    }

    /**
     * 开始上传时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return BEGINUPLOADINGTIME 开始上传时间
     */
    public Date getBeginuploadingtime() {
        return beginuploadingtime;
    }

    /**
     * 开始上传时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param beginuploadingtime 开始上传时间
     */
    public void setBeginuploadingtime(Date beginuploadingtime) {
        this.beginuploadingtime = beginuploadingtime;
    }

    /**
     * 完成上传时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ENDUPLOADINGTIME 完成上传时间
     */
    public Date getEnduploadingtime() {
        return enduploadingtime;
    }

    /**
     * 完成上传时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param enduploadingtime 完成上传时间
     */
    public void setEnduploadingtime(Date enduploadingtime) {
        this.enduploadingtime = enduploadingtime;
    }

    /**
     * 1-未删除，0-已删除；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISDELETE 1-未删除，0-已删除；
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 1-未删除，0-已删除；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isdelete 1-未删除，0-已删除；
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