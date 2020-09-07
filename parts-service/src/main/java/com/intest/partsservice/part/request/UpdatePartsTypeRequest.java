package com.intest.partsservice.part.request;

public class UpdatePartsTypeRequest {
    private String partsTypeId;
    private String partsTypeName;
    private String remark;

    public UpdatePartsTypeRequest() {
    }

    public UpdatePartsTypeRequest(String partsTypeId, String partsTypeName, String remark) {
        this.partsTypeId = partsTypeId;
        this.partsTypeName = partsTypeName;
        this.remark = remark;
    }

    public String getPartsTypeId() {
        return partsTypeId;
    }

    public void setPartsTypeId(String partsTypeId) {
        this.partsTypeId = partsTypeId;
    }

    public String getPartsTypeName() {
        return partsTypeName;
    }

    public void setPartsTypeName(String partsTypeName) {
        this.partsTypeName = partsTypeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
