package com.intest.dao.entity;

import lombok.Data;

/**
 * @author intest
 * 文件信息实体
 */
@Data
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
}
