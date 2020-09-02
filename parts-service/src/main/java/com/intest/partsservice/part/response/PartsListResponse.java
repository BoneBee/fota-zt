package com.intest.partsservice.part.response;

import java.util.Date;

public class PartsListResponse {
    private int index;
    private String partsId;
    private String partsName;
    private String fullName;
    private String partsType;
    private Date creatAt;
    private String creatBy;
    private Date updateBy;
    private String updateAt;
    private String remark;

    public PartsListResponse() {
    }

    public PartsListResponse(int index, String partsId, String partsName, String fullName, String partsType, Date creatAt, String creatBy, Date updateBy, String updateAt, String remark) {
        this.index = index;
        this.partsId = partsId;
        this.partsName = partsName;
        this.fullName = fullName;
        this.partsType = partsType;
        this.creatAt = creatAt;
        this.creatBy = creatBy;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.remark = remark;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getPartsId() {
        return partsId;
    }

    public void setPartsId(String partsId) {
        this.partsId = partsId;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPartsType() {
        return partsType;
    }

    public void setPartsType(String partsType) {
        this.partsType = partsType;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy;
    }

    public Date getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Date updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
