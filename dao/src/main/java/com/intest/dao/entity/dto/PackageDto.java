package com.intest.dao.entity.dto;

import java.util.List;

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

    public float getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(float packageSize) {
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

    public List<PartsPackageDto> getPartsPackage() {
        return partsPackage;
    }

    public void setPartsPackage(List<PartsPackageDto> partsPackage) {
        this.partsPackage = partsPackage;
    }
}
