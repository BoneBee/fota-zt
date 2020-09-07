package com.intest.carservice.carservice.Respone;

import java.util.List;

public class CarTypeInfoRespone {

    public String carTypeId;
    public String carTypeName;

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String terminalId;
    public String terminal;
    public String createAt;

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

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<CarTypeEcus> getEcus() {
        return ecus;
    }

    public void setEcus(List<CarTypeEcus> ecus) {
        this.ecus = ecus;
    }

    public String createBy;
    public String remark;
    public List<CarTypeEcus> ecus;


}
