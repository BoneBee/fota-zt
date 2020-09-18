package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/9/7 11:05
 */
public class PartsRequest {
    /**
     * 零件ID
     */
    private String partsId;
    /**
     * 原始零件包ID
     */
    private String basePartsPackageId;
    /**
     * 目标零件包ID
     */
    private String targetPartsPackageId;
    /**
     * 包类型
     * 0-全量包，1-差分包
     */
    private int type;

    public String getPartsId() {
        return partsId;
    }

    public void setPartsId(String partsId) {
        this.partsId = partsId;
    }

    public String getBasePartsPackageId() {
        return basePartsPackageId;
    }

    public void setBasePartsPackageId(String basePartsPackageId) {
        this.basePartsPackageId = basePartsPackageId;
    }

    public String getTargetPartsPackageId() {
        return targetPartsPackageId;
    }

    public void setTargetPartsPackageId(String targetPartsPackageId) {
        this.targetPartsPackageId = targetPartsPackageId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
