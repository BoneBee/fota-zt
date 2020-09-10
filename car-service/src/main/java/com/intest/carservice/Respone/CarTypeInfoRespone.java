package com.intest.carservice.Respone;

import com.intest.carservice.Respone.CarTypeEcus;

import java.util.List;

public class CarTypeInfoRespone {

    private String carTypeId;
    private String carTypeName;
    private String terminalId;
    private String terminal;
    private String createAt;
    private String createBy;
    private String remark;
    private String updateBy;
    private CarTypeEcuType partType;

    public CarTypeEcuType getPartType() {
        return partType;
    }

    public void setPartType(CarTypeEcuType partType) {
        this.partType = partType;
    }

    public List<CarTypeEcus> ecus;

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
