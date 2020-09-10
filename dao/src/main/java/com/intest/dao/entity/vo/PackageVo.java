package com.intest.dao.entity.vo;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/14 10:32
 */
public class PackageVo extends PageBase {
    /**
     * 原始包名称
     */
    private String packageName;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 上传人
     */
    private String uploadUser;

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

    public String getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser;
    }
}
