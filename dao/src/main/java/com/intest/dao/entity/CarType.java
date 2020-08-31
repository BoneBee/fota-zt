package com.intest.dao.entity;

public class CarType {
    /**
     * 车型ID
     */
    private String carTypeId;
    /**
     * 车型名称
     */
    private String carTypeName;

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
}
