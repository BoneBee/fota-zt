package com.intest.packageservice.vo;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/9/4 16:15
 */
public class VersionVO {
    /**
     * 零件包ID
     */
    private String partsPackageId;
    /**
     * 原始版本
     */
    private String version;
    /**
     * 目标版本
     */
    private String targetVersion;
    /**
     * 包类型
     */
    private int type;

    public String getPartsPackageId() {
        return partsPackageId;
    }

    public void setPartsPackageId(String partsPackageId) {
        this.partsPackageId = partsPackageId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
