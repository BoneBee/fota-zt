package com.intest.dao.entity;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/9/3 15:32
 */
public class CarTypeExtendBto {
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
