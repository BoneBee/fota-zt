package com.intest.dao.entity.dto;

import lombok.Data;

@Data
public class PartsPackageDetailsDto {
    /**
     * 零件包名称
     */
    private String partsPackageName;
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
    private String partsCode;
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
