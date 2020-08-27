package com.intest.dao.entity;

import lombok.Data;

@Data
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
}
