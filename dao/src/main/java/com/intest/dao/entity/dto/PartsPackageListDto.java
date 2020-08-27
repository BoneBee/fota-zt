package com.intest.dao.entity.dto;

import lombok.Data;

@Data
public class PartsPackageListDto {
    /**
     * 零件包ID
     */
    private String partsPackageId;
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
     * 文件信息ID
     */
    private String fileId;
    /**
     * 序号
     */
    private int id;
}
