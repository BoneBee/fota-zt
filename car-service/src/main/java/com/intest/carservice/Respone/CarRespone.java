package com.intest.carservice.Respone;

import java.util.List;

public class CarRespone {

    private int index;

    private String carTypeName;
    private String terminal;
    //public String pCompany;
    private String carTypeId;
    private String terminalId;
    private String terminalPro;
    private String terminalCode;

    private String vin;
    private String createAt;
    private String createBy;
    private String addType;
    private CarTask taskMsg;
    private String carId;
    private String operator;
    private List<CarEcu> ecus;
    private String ICCID;
    private String simNumber;

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalPro() {
        return terminalPro;
    }

    public void setTerminalPro(String terminalPro) {
        this.terminalPro = terminalPro;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public CarTask getTaskMsg() {
        return taskMsg;
    }

    public void setTaskMsg(CarTask taskMsg) {
        this.taskMsg = taskMsg;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public List<CarEcu> getEcus() {
        return ecus;
    }

    public void setEcus(List<CarEcu> ecus) {
        this.ecus = ecus;
    }

    public String getICCID() {
        return ICCID;
    }

    public void setICCID(String ICCID) {
        this.ICCID = ICCID;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
