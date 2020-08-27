package com.intest.dao.entity;

import lombok.Data;

@Data
public class LargePackage {
    /**
     * 序号
     */
    private int id;
    /**
     * 原始包编号
     */
    private String packageId;
    /**
     * 对应的文件信息编号
     */
    private String fileId;
    /**
     * 原始包名称
     */
    private String packageName;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 原始包大小
     */
    private float packageSize;
    /**
     * 上传时间
     */
    private String uploadTime;
    /**
     * 上传人
     */
    private String uploadUser;
    /**
     * 车型编号
     */
    private String carTypeId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建人
     */
    private String createBy;
}
