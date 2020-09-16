package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：升级包信息查询请求实体
 * @date ：2020/9/2 14:32
 */
public class UpgradePackageRequest extends BaseRequest {
    /**
     * 升级包名称
     */
    private String packageName;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 升级包类型
     */
    private int packageType;

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

    public int getPackageType() {
        return packageType;
    }

    public void setPackageType(int packageType) {
        this.packageType = packageType;
    }
}
