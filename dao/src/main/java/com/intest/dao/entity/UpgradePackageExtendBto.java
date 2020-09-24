package com.intest.dao.entity;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/9/2 9:51
 */
public class UpgradePackageExtendBto {
    /**
     * 序号
     */
    private int id;
    /**
     * 升级包制作任务ID
     */
    private String packageTaskId;
    /**
     * 升级包名称
     */
    private String packageName;
    /**
     * 车型ID
     */
    private String carTypeId;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 升级包类型
     */
    private Integer packageType;
    /**
     * 制作状态
     */
    private Integer packageStatus;
    /**
     * 开始制作时间
     */
    private String createAt;
    /**
     * 制作人
     */
    private String createBy;

    public String getPackageTaskId() {
        return packageTaskId;
    }

    public void setPackageTaskId(String packageTaskId) {
        this.packageTaskId = packageTaskId;
    }

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

    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public Integer getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(Integer packageStatus) {
        this.packageStatus = packageStatus;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }

}
