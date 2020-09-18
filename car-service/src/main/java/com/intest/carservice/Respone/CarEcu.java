package com.intest.carservice.Respone;

public class CarEcu {

    //序号
    private int index;
    //零件ID
    private String ecuId;
    //零件简称
    private String ecuName;
    //零件类型
    private String partType;
    //零件编号
    private String partCode;
    //软件版本
    private String partVersion;
    //更新时间
    private String updateAt;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getEcuId() {
        return ecuId;
    }

    public void setEcuId(String ecuId) {
        this.ecuId = ecuId;
    }

    public String getEcuName() {
        return ecuName;
    }

    public void setEcuName(String ecuName) {
        this.ecuName = ecuName;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public String getPartVersion() {
        return partVersion;
    }

    public void setPartVersion(String partVersion) {
        this.partVersion = partVersion;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

}
