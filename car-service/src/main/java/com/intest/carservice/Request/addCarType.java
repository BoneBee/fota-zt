package com.intest.carservice.Request;

import java.util.List;

public class addCarType {

    private String carTypeId;
    private String carTypeName;
    private String terminalId;
    private List<String> partTypes;
    private String remark;

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }
    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public List<String> getPartTypes() {
        return partTypes;
    }

    public void setPartTypes(List<String> partTypes) {
        this.partTypes = partTypes;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
