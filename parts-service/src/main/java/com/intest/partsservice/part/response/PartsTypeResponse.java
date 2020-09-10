package com.intest.partsservice.part.response;

import java.util.Date;

public class PartsTypeResponse {
    private String partsTypeId;
    private String partsTypeName;

    public PartsTypeResponse() {
    }

    public PartsTypeResponse(String partsTypeId, String partsTypeName) {
        this.partsTypeId = partsTypeId;
        this.partsTypeName = partsTypeName;
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
}
