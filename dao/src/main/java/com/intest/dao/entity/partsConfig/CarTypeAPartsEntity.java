package com.intest.dao.entity.partsConfig;

import lombok.Getter;
import lombok.Setter;

/**
 * @作者:dl
 * @描述:车型与零部件信息集合
 * @创建时间: 2020/9/1 11:02
 * @修改人：
 * @修改内容：
 * @修改时间：
 */

public class CarTypeAPartsEntity {
    /*
    车型Id
   */
        public String carTypeId;
    /*
    车型名称
   */
    public String carTypeName;
    /*
    零部件ID
   */
    public String partsId;
    /*
    零部件名称
   */
    public String partsName;
    /*
    零件升级顺序
     */
    public int orderNum;

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

    public String getPartsId() {
        return partsId;
    }

    public void setPartsId(String partsId) {
        this.partsId = partsId;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
}
