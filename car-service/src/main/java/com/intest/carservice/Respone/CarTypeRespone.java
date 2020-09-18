package com.intest.carservice.Respone;

public class CarTypeRespone {

    private int index;
    private String carTypeName;
    private String terminalId;
    private String terminal;
    private String remark;
    private String createAt;
    private String createBy;
    private String updateAt;
    private String updateBy;
    private String carTypeId;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCartypeName() {
        return carTypeName;
    }

    public void setCartypeName(String cartypeName) {
        this.carTypeName = cartypeName;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getCartypeId() {
        return carTypeId;
    }

    public void setCartypeId(String cartypeId) {
        this.carTypeId = cartypeId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public CarTypeRespone(){

    }

    public CarTypeRespone(int total, int index, String carTypeName, String terminal, String remark, String createAt, String createBy, String updateAt,
                          String updateBy, String carTypeId) {
        this.index = index;
        this.carTypeName = carTypeName;
        this.terminal = terminal;
        this.remark = remark;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.carTypeId = carTypeId;

    }

    public CarTypeRespone(String carTypeName, String terminal, String remark, String createAt, String createBy, String updateAt,
                          String updateBy, String carTypeId) {
        this.carTypeName = carTypeName;
        this.terminal = terminal;
        this.remark = remark;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.carTypeId = carTypeId;
    }

}
