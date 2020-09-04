package com.intest.dao.entity;

import lombok.Data;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/28 17:04
 */
@Data
public class PartsPackageExtendBto {
    /**
     * 零件包名称
     */
    private String partsPackageName;
    /**
     * 零件包大小
     */
    private Long partsPackageSize;
    /**
     * 零件简称
     */
    private String partsName;
    /**
     * 零件类型
     */
    private String partsTypeName;
    /**
     * 零件号
     */
    private String partCode;
    /**
     * 零部版本
     */
    private String version;
    /**
     * 原始包名称
     */
    private String packageName;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 文件信息ID
     */
    private String fileId;
    /**
     * 序号
     */
    private int id;
    /**
     * 网段名称
     */
    private String networkSegmentName;
    /**
     * 功能寻址ID
     */
    private String functionID;
    /**
     * 物理寻址ID
     */
    private String physicalID;
    /**
     * 响应ID
     */
    private String responseID;
}
