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
     * 车型名称
     */
    private String carTypeName;
    /**
     * 升级包类型
     */
    private Integer packageType;
    /**
     * 升级包大小
     */
    private Float packageSize;
    /**
     * 制作状态
     */
    private Integer packageStatus;
    /**
     * 发布状态
     */
    private Integer publishStatus;
    /**
     * 开始制作时间
     */
    private String createAt;
    /**
     * 制作人
     */
    private String createBy;
    /**
     * 文件ID
     */
    private String fileId;

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

    public Float getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(Float packageSize) {
        this.packageSize = packageSize;
    }

    public Integer getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(Integer packageStatus) {
        this.packageStatus = packageStatus;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
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

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
