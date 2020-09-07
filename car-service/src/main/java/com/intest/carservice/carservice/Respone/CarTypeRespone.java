package com.intest.carservice.carservice.Respone;

public class CarTypeRespone {

    private int index;
    private String cartypeName;
    private String terminal;
    private String remark;
    private String createAt;
    private String createBy;
    private String updateAt;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCartypeName() {
        return cartypeName;
    }

    public void setCartypeName(String cartypeName) {
        this.cartypeName = cartypeName;
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
        return cartypeId;
    }

    public void setCartypeId(String cartypeId) {
        this.cartypeId = cartypeId;
    }

    private String updateBy;
    private String cartypeId;

    public CarTypeRespone(){

    }
    public CarTypeRespone(int total, int index, String cartypeName, String terminal, String remark, String createAt, String createBy, String updateAt,
                          String updateBy, String cartypeId) {
        this.index = index;
        this.cartypeName = cartypeName;
        this.terminal = terminal;
        this.remark = remark;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.cartypeId = cartypeId;

    }

    public CarTypeRespone(String cartypeName, String terminal, String remark, String createAt, String createBy, String updateAt,
                          String updateBy, String cartypeId) {
        this.cartypeName = cartypeName;
        this.terminal = terminal;
        this.remark = remark;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.cartypeId = cartypeId;

    }

}
