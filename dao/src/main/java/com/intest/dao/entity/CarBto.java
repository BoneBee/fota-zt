package com.intest.dao.entity;

import java.util.Date;

public class CarBto {
    /**
     * 主键，车辆编号 CAR_ID
     */
    private String carId;

    /**
     * 外键，车型表主键 FK_CARTYPE_ID
     */
    private String fkCartypeId;

    /**
     * VIN码 VIN
     */
    private String vin;

    /**
     * 车牌号码 LICENSE
     */
    private String license;

    /**
     * 终端编号 TERMINALCODE
     */
    private String terminalcode;

    /**
     * SIM卡主键 FK_SIMCARD_ID
     */
    private String fkSimcardId;

    /**
     * 是否删除 ISDELETE
     */
    private Short isdelete;

    /**
     * 创建时间 CREATEAT
     */
    private Date createat;

    /**
     * 创建人 CREATEBY
     */
    private String createby;

    /**
     * 修改时间 UPDATEAT
     */
    private Date updateat;

    /**
     * 修改人 UPDATEBY
     */
    private String updateby;

    /**
     * 主键，车辆编号
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CAR_ID 主键，车辆编号
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 主键，车辆编号
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param carId 主键，车辆编号
     */
    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    /**
     * 外键，车型表主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_CARTYPE_ID 外键，车型表主键
     */
    public String getFkCartypeId() {
        return fkCartypeId;
    }

    /**
     * 外键，车型表主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkCartypeId 外键，车型表主键
     */
    public void setFkCartypeId(String fkCartypeId) {
        this.fkCartypeId = fkCartypeId == null ? null : fkCartypeId.trim();
    }

    /**
     * VIN码
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return VIN VIN码
     */
    public String getVin() {
        return vin;
    }

    /**
     * VIN码
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param vin VIN码
     */
    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    /**
     * 车牌号码
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return LICENSE 车牌号码
     */
    public String getLicense() {
        return license;
    }

    /**
     * 车牌号码
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param license 车牌号码
     */
    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    /**
     * 终端编号
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return TERMINALCODE 终端编号
     */
    public String getTerminalcode() {
        return terminalcode;
    }

    /**
     * 终端编号
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param terminalcode 终端编号
     */
    public void setTerminalcode(String terminalcode) {
        this.terminalcode = terminalcode == null ? null : terminalcode.trim();
    }

    /**
     * SIM卡主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_SIMCARD_ID SIM卡主键
     */
    public String getFkSimcardId() {
        return fkSimcardId;
    }

    /**
     * SIM卡主键
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkSimcardId SIM卡主键
     */
    public void setFkSimcardId(String fkSimcardId) {
        this.fkSimcardId = fkSimcardId == null ? null : fkSimcardId.trim();
    }

    /**
     * 是否删除
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISDELETE 是否删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isdelete 是否删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}