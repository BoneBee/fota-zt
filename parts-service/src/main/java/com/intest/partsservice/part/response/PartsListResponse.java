package com.intest.partsservice.part.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PartsListResponse {
    private int index;
    private String partsId;
    private String partsName;
    private String fullName;
    private String partsTypeId;
    private String partsTypeName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatAt;
    private String creatBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateBy;
    private String updateAt;
    private String remark;

    public PartsListResponse() {
    }

    public PartsListResponse(int index, String partsId, String partsName, String fullName, String partsTypeId, String partsTypeName, Date creatAt, String creatBy, Date updateBy, String updateAt, String remark) {
        this.index = index;
        this.partsId = partsId;
        this.partsName = partsName;
        this.fullName = fullName;
        this.partsTypeId = partsTypeId;
        this.partsTypeName = partsTypeName;
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
