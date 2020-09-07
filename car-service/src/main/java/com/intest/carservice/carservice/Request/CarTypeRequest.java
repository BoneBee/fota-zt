package com.intest.carservice.Request;

import com.intest.common.ro.PagerBaseRO;

public class CarTypeRequest extends PagerBaseRO {

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }

    private String carTypeId;

    public int pi;
    public int ps;
    public String condition;

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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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

    public String sort;
    public String sortOrder;
    public String dataName;



    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String typeId;

    public CarTypeRequest(){

    }

}
