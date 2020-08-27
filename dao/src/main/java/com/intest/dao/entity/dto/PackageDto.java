package com.intest.dao.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PackageDto {
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
     * 零件包集合
     */
    private List<PartsPackageDto> partsPackage;
}
