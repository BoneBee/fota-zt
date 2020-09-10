package com.intest.partsservice.part.request;

import io.swagger.annotations.ApiParam;

public class UpdatePartMessageRequest {
    private String partsTypeId;
    private String partsName;
    private String partsId;
    private String remark;

    public UpdatePartMessageRequest() {
    }

    public UpdatePartMessageRequest(String partsTypeId, String partsName, String partsId, String remark) {
        this.partsTypeId = partsTypeId;
        this.partsName = partsName;
        this.partsId = partsId;
        this.remark = remark;
    }

    public String getPartsTypeId() {
        return partsTypeId;
    }

    public void setPartsTypeId(String partsTypeId) {
        this.partsTypeId = partsTypeId;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }


    public String getPartsId() {
        return partsId;
    }

    public void setPartsId(String partsId) {
        this.partsId = partsId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
