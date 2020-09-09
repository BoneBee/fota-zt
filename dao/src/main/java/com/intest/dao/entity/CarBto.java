package com.intest.dao.entity;

import java.util.Date;

public class CarBto {
    /**
     * 主键 CAR_ID
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
     * 添加来源 1-手动添加 2-Excel导入 ADDTYPE
     */
    private Short addtype;

    /**
     * 车牌号码 LICENSE
     */
    private String license;

    /**
     * 终端编号 TERMINALCODE
     */
    private String terminalcode;

    /**
     * 1-未删除，0-已删除； ISDELETE
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
     * iccid ICCID
     */
    private String iccid;

    /**
     * 主键
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return CAR_ID 主键
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 主键
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param carId 主键
     */
    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    /**
     * 外键，车型表主键
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return FK_CARTYPE_ID 外键，车型表主键
     */
    public String getFkCartypeId() {
        return fkCartypeId;
    }

    /**
     * 外键，车型表主键
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param fkCartypeId 外键，车型表主键
     */
    public void setFkCartypeId(String fkCartypeId) {
        this.fkCartypeId = fkCartypeId == null ? null : fkCartypeId.trim();
    }

    /**
     * VIN码
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return VIN VIN码
     */
    public String getVin() {
        return vin;
    }

    /**
     * VIN码
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param vin VIN码
     */
    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    /**
     * 添加来源 1-手动添加 2-Excel导入
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return ADDTYPE 添加来源 1-手动添加 2-Excel导入
     */
    public Short getAddtype() {
        return addtype;
    }

    /**
     * 添加来源 1-手动添加 2-Excel导入
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param addtype 添加来源 1-手动添加 2-Excel导入
     */
    public void setAddtype(Short addtype) {
        this.addtype = addtype;
    }

    /**
     * 车牌号码
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return LICENSE 车牌号码
     */
    public String getLicense() {
        return license;
    }

    /**
     * 车牌号码
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param license 车牌号码
     */
    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    /**
     * 终端编号
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return TERMINALCODE 终端编号
     */
    public String getTerminalcode() {
        return terminalcode;
    }

    /**
     * 终端编号
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param terminalcode 终端编号
     */
    public void setTerminalcode(String terminalcode) {
        this.terminalcode = terminalcode == null ? null : terminalcode.trim();
    }

    /**
     * 1-未删除，0-已删除；
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return ISDELETE 1-未删除，0-已删除；
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 1-未删除，0-已删除；
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param isdelete 1-未删除，0-已删除；
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * iccid
     * @author intest
     * @date 2020-09-05 14:43:47
     * @return ICCID iccid
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * iccid
     * @author intest
     * @date 2020-09-05 14:43:47
     * @param iccid iccid
     */
    public void setIccid(String iccid) {
        this.iccid = iccid == null ? null : iccid.trim();
    }
}