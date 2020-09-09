package com.intest.carservice.carservice.Request;

import java.util.List;

public class addCarType {

    public String carTypeName;
    public String terminalId;

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

    public List<String> partTypes;
    public String remark;
}
