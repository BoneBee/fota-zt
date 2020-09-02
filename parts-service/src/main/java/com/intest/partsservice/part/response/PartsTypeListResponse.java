package com.intest.partsservice.part.response;

import java.util.Date;

public class PartsTypeListResponse {
    private int index;
    private String partsTypeId;
    private String fullName;
    private String remark;
    private Date creatAt;
    private String creatBy;
    private Date updateAt;
    private String updateBy;

    public PartsTypeListResponse() {
    }

    public PartsTypeListResponse(int index, String partsTypeId, String fullName, String remark, Date creatAt, String creatBy, Date updateAt, String updateBy) {
        this.index = index;
        this.partsTypeId = partsTypeId;
        this.fullName = fullName;
        this.remark = remark;
        this.creatAt = creatAt;
        this.creatBy = creatBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
