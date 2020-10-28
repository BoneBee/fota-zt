package com.intest.dao.entity.task;

import lombok.Getter;
import lombok.Setter;


/**
 * @作者:dl
 * @描述:根据车型ID获取车辆信息
 * @创建时间: 2020/9/14 15:30
 * @修改人：
 * @修改内容：
 * @修改时间：
 */

public class VinListByCarTypeEntity {

    public int index;
    /**
     * 升级包任务Id
     */
    public String vin;

    /**
     * 车型
     */
    public String carTypeName;

    /**
     * 终端型号
     */
    public String terminalName;

    /**
     * 是否有任务 0:无任务 ，1:有任务
     */
    public int  isTasking;

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

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public int getIsTasking() {
        return isTasking;
    }

    public void setIsTasking(int isTasking) {
        this.isTasking = isTasking;
    }
}
