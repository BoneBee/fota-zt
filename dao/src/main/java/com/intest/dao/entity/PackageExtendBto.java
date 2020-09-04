package com.intest.dao.entity;

import lombok.Data;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/31 10:35
 */
@Data
public class PackageExtendBto {
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
    private Long packageSize;
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
