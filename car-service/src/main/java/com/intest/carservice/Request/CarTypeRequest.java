package com.intest.carservice.Request;

import com.intest.common.ro.PagerBaseRO;

public class CarTypeRequest extends PagerBaseRO {

    private int pi;
    private int ps;
    private String sort;


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

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public CarTypeRequest(){

    }

}
