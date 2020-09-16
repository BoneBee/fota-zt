package com.intest.carservice.Request;

import com.intest.common.ro.PagerBaseRO;

public class CarRequest  extends PagerBaseRO {
    private int Pi;
    private int Ps;
    private String condition;
    private String Sort;

    @Override
    public int getPi() {
        return Pi;
    }

    public void setPi(int pi) {
        Pi = pi;
    }

    @Override
    public int getPs() {
        return Ps;
    }

    public void setPs(int ps) {
        Ps = ps;
    }

    @Override
    public String getSort() {
        return Sort;
    }

    public void setSort(String sort) {
        Sort = sort;
    }

    private String sortOrder;
    private String dataName;


    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

}
