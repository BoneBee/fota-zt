package com.intest.response;

public class ErroMessageResponse {
    private int index;
    private String carTypeName;
    private String erroMessage;
    private int erroNum;
    private String proportion;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getErroMessage() {
        return erroMessage;
    }

    public void setErroMessage(String erroMessage) {
        this.erroMessage = erroMessage;
    }

    public int getErroNum() {
        return erroNum;
    }

    public void setErroNum(int erroNum) {
        this.erroNum = erroNum;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }
}
