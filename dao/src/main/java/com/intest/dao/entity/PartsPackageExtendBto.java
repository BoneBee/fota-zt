package com.intest.dao.entity;

import lombok.Data;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/28 17:04
 */
@Data
public class PartsPackageExtendBto {
    /**
     * 零件包名称
     */
    private String partsPackageName;
    /**
     * 零件包大小
     */
    private Long partsPackageSize;
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
    /**
     * 网段名称
     */
    private String networkSegmentName;
    /**
     * 功能寻址ID
     */
    private String functionID;
    /**
     * 物理寻址ID
     */
    private String physicalID;
    /**
     * 响应ID
     */
    private String responseID;

    public String getPartsPackageName() {
        return partsPackageName;
    }

    public void setPartsPackageName(String partsPackageName) {
        this.partsPackageName = partsPackageName;
    }

    public Long getPartsPackageSize() {
        return partsPackageSize;
    }

    public void setPartsPackageSize(Long partsPackageSize) {
        this.partsPackageSize = partsPackageSize;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public String getPartsTypeName() {
        return partsTypeName;
    }

    public void setPartsTypeName(String partsTypeName) {
        this.partsTypeName = partsTypeName;
    }

    public String getPartsCode() {
        return partsCode;
    }

    public void setPartsCode(String partsCode) {
        this.partsCode = partsCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public String getNetworkSegmentName() {
        return networkSegmentName;
    }

    public void setNetworkSegmentName(String networkSegmentName) {
        this.networkSegmentName = networkSegmentName;
    }

    public String getFunctionID() {
        return functionID;
    }

    public void setFunctionID(String functionID) {
        this.functionID = functionID;
    }

    public String getPhysicalID() {
        return physicalID;
    }

    public void setPhysicalID(String physicalID) {
        this.physicalID = physicalID;
    }

    public String getResponseID() {
        return responseID;
    }

    public void setResponseID(String responseID) {
        this.responseID = responseID;
    }
}
