package com.intest.dao.entity;

import lombok.Data;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/28 17:03
 */
@Data
public class PackageBto {
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
    private List<PartsPackageExtendBto> partsPackage;
}
