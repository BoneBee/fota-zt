package com.intest.partsservice.part.response;

import java.util.Date;

public class PartsTypeResponse {
    private String partsTypeId;
    private String fullName;

    public PartsTypeResponse() {
    }

    public PartsTypeResponse(String partsTypeId, String fullName) {
        this.partsTypeId = partsTypeId;
        this.fullName = fullName;
    }

    public String getPartsTypeId() {
        return partsTypeId;
    }

    public void setPartsTypeId(String partsTypeId) {
        this.partsTypeId = partsTypeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
