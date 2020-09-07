package com.intest.packageservice.vo;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/31 9:54
 */
public class PackageVO {
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
     * 零件包集合
     */
    private List<PartsPackageVO> partsPackage;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public Long getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(Long packageSize) {
        this.packageSize = packageSize;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser;
    }

    public List<PartsPackageVO> getPartsPackage() {
        return partsPackage;
    }

    public void setPartsPackage(List<PartsPackageVO> partsPackage) {
        this.partsPackage = partsPackage;
    }
}
