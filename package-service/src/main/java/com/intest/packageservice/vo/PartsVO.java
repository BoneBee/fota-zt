package com.intest.packageservice.vo;

/**
 * @author ：intest
 * @description：零件信息实体
 * @date ：2020/9/9 10:59
 */
public class PartsVO {
    /**
     * 序号
     */
    private int id;
    /**
     * 零件名称
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
     * 原始版本
     */
    private String baseVersion;
    /**
     * 目标版本
     */
    private String targetVersion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBaseVersion() {
        return baseVersion;
    }

    public void setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }
}
