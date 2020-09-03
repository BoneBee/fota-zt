package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/28 15:42
 */
public class BaseRequest {
    /**
     * 当前页数
     */
    private int pi = 1;
    /**
     * 每页大小
     */
    private int ps = 10;

    public int getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
