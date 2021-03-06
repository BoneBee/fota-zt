package com.intest.partsservice.part.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PartsTypeListResponse {
    private int index;
    private String partsTypeId;
    private String partsTypeName;
    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatAt;
    private String creatBy;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateAt;
    private String updateBy;

    public PartsTypeListResponse() {
    }

    public PartsTypeListResponse(int index, String partsTypeId, String partsTypeName, String remark, Date creatAt, String creatBy, Date updateAt, String updateBy) {
        this.index = index;
        this.partsTypeId = partsTypeId;
        this.partsTypeName = partsTypeName;
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
