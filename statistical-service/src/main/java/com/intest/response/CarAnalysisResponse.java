package com.intest.response;

public class CarAnalysisResponse {
    private int index;//序号
    private String vin;//vin码
    private String carTypeName;//车型名称
    private String terminal;//终端型号
    private int checkNum;//检测次数
    private int downloadSuccessNum;//下载成功次数
    private int updateNum;//升级次数
    private int updateSuccessNum;//升级成功次数
    private int updateErroNum;//升级失败次数
    private String updateSuccessRate;//升级成功率

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public int getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(int checkNum) {
        this.checkNum = checkNum;
    }

    public int getDownloadSuccessNum() {
        return downloadSuccessNum;
    }

    public void setDownloadSuccessNum(int downloadSuccessNum) {
        this.downloadSuccessNum = downloadSuccessNum;
    }

    public int getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(int updateNum) {
        this.updateNum = updateNum;
    }

    public int getUpdateSuccessNum() {
        return updateSuccessNum;
    }

    public void setUpdateSuccessNum(int updateSuccessNum) {
        this.updateSuccessNum = updateSuccessNum;
    }

    public int getUpdateErroNum() {
        return updateErroNum;
    }

    public void setUpdateErroNum(int updateErroNum) {
        this.updateErroNum = updateErroNum;
    }

    public String getUpdateSuccessRate() {
        return updateSuccessRate;
    }

    public void setUpdateSuccessRate(String updateSuccessRate) {
        this.updateSuccessRate = updateSuccessRate;
    }
}
