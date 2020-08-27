package com.intest.dao.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PartsPackageDto {
    /**
     * 零件包名称
     */
    private String partsPackageName;
    /**
     * 零件包大小
     */
    private float partsPackageSize;
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
     * 文件信息ID
     */
    private String fileId;
    /**
     * 序号
     */
    private int id;
}
