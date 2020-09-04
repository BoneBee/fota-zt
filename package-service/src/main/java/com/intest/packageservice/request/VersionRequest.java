package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：版本信息列表请求实体
 * @date ：2020/9/4 16:10
 */
public class VersionRequest {
    /**
     * 零件ID
     */
    private String partsId;
    /**
     * 零件号
     */
    private String partsCode;

    public String getPartsId() {
        return partsId;
    }

    public void setPartsId(String partsId) {
        this.partsId = partsId;
    }

    public String getPartsCode() {
        return partsCode;
    }

    public void setPartsCode(String partsCode) {
        this.partsCode = partsCode;
    }
}
