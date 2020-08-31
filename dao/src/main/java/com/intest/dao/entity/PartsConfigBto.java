package com.intest.dao.entity;

import java.util.Date;

public class PartsConfigBto {
    /**
     * 零部件策略配置信息ID PARTSCONFIG_ID
     */
    private String partsconfigId;

    /**
     * 零部件信息ID FK_PARTS_ID
     */
    private String fkPartsId;

    /**
     * 电压模式 0-高压，1-低压，2-其他； VOLTAGEMODEL
     */
    private Short voltagemodel;

    /**
     * 升级方式 0-Can，1-Can FD，2-DoIP； CANTYPE
     */
    private Short cantype;

    /**
     * 车辆行驶状态 0-停止，1-行驶，2-其他； TRAVELSTATE
     */
    private Short travelstate;

    /**
     * 车辆档位 0-N档，1-P档，2-其他； GEAR
     */
    private Short gear;

    /**
     * 零件升级顺序 ORDERNUM
     */
    private Short ordernum;

    /**
     * 预编程异常处理 0-执行后编程，1-结束 PREPROGRAMME
     */
    private Short preprogramme;

    /**
     * 编程中异常处理 0-执行后编程，1-结束 INPROGRAMME
     */
    private Short inprogramme;

    /**
     * 27服务 安全等级 SAFETYLEVEL
     */
    private Short safetylevel;

    /**
     * 27服务 算法掩码 ALGORITHMMASK
     */
    private String algorithmmask;

    /**
     * 27服务 NRC RTDNE延时 单位ms DELAY
     */
    private Short delay;

    /**
     * 36服务是否对齐 0-是，1-否 ISALIGNMENT
     */
    private Short isalignment;

    /**
     * 36服务对齐单位 ALIGNMENTCOMPANY
     */
    private Short alignmentcompany;

    /**
     * 重启等待复位时间 单位ms ECUWAITRESETTIME
     */
    private Short ecuwaitresettime;

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
     * 零部件策略配置信息ID
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return PARTSCONFIG_ID 零部件策略配置信息ID
     */
    public String getPartsconfigId() {
        return partsconfigId;
    }

    /**
     * 零部件策略配置信息ID
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param partsconfigId 零部件策略配置信息ID
     */
    public void setPartsconfigId(String partsconfigId) {
        this.partsconfigId = partsconfigId == null ? null : partsconfigId.trim();
    }

    /**
     * 零部件信息ID
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return FK_PARTS_ID 零部件信息ID
     */
    public String getFkPartsId() {
        return fkPartsId;
    }

    /**
     * 零部件信息ID
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param fkPartsId 零部件信息ID
     */
    public void setFkPartsId(String fkPartsId) {
        this.fkPartsId = fkPartsId == null ? null : fkPartsId.trim();
    }

    /**
     * 电压模式 0-高压，1-低压，2-其他；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return VOLTAGEMODEL 电压模式 0-高压，1-低压，2-其他；
     */
    public Short getVoltagemodel() {
        return voltagemodel;
    }

    /**
     * 电压模式 0-高压，1-低压，2-其他；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param voltagemodel 电压模式 0-高压，1-低压，2-其他；
     */
    public void setVoltagemodel(Short voltagemodel) {
        this.voltagemodel = voltagemodel;
    }

    /**
     * 升级方式 0-Can，1-Can FD，2-DoIP；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return CANTYPE 升级方式 0-Can，1-Can FD，2-DoIP；
     */
    public Short getCantype() {
        return cantype;
    }

    /**
     * 升级方式 0-Can，1-Can FD，2-DoIP；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param cantype 升级方式 0-Can，1-Can FD，2-DoIP；
     */
    public void setCantype(Short cantype) {
        this.cantype = cantype;
    }

    /**
     * 车辆行驶状态 0-停止，1-行驶，2-其他；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return TRAVELSTATE 车辆行驶状态 0-停止，1-行驶，2-其他；
     */
    public Short getTravelstate() {
        return travelstate;
    }

    /**
     * 车辆行驶状态 0-停止，1-行驶，2-其他；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param travelstate 车辆行驶状态 0-停止，1-行驶，2-其他；
     */
    public void setTravelstate(Short travelstate) {
        this.travelstate = travelstate;
    }

    /**
     * 车辆档位 0-N档，1-P档，2-其他；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return GEAR 车辆档位 0-N档，1-P档，2-其他；
     */
    public Short getGear() {
        return gear;
    }

    /**
     * 车辆档位 0-N档，1-P档，2-其他；
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param gear 车辆档位 0-N档，1-P档，2-其他；
     */
    public void setGear(Short gear) {
        this.gear = gear;
    }

    /**
     * 零件升级顺序
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return ORDERNUM 零件升级顺序
     */
    public Short getOrdernum() {
        return ordernum;
    }

    /**
     * 零件升级顺序
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param ordernum 零件升级顺序
     */
    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * 预编程异常处理 0-执行后编程，1-结束
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return PREPROGRAMME 预编程异常处理 0-执行后编程，1-结束
     */
    public Short getPreprogramme() {
        return preprogramme;
    }

    /**
     * 预编程异常处理 0-执行后编程，1-结束
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param preprogramme 预编程异常处理 0-执行后编程，1-结束
     */
    public void setPreprogramme(Short preprogramme) {
        this.preprogramme = preprogramme;
    }

    /**
     * 编程中异常处理 0-执行后编程，1-结束
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return INPROGRAMME 编程中异常处理 0-执行后编程，1-结束
     */
    public Short getInprogramme() {
        return inprogramme;
    }

    /**
     * 编程中异常处理 0-执行后编程，1-结束
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param inprogramme 编程中异常处理 0-执行后编程，1-结束
     */
    public void setInprogramme(Short inprogramme) {
        this.inprogramme = inprogramme;
    }

    /**
     * 27服务 安全等级
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return SAFETYLEVEL 27服务 安全等级
     */
    public Short getSafetylevel() {
        return safetylevel;
    }

    /**
     * 27服务 安全等级
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param safetylevel 27服务 安全等级
     */
    public void setSafetylevel(Short safetylevel) {
        this.safetylevel = safetylevel;
    }

    /**
     * 27服务 算法掩码
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return ALGORITHMMASK 27服务 算法掩码
     */
    public String getAlgorithmmask() {
        return algorithmmask;
    }

    /**
     * 27服务 算法掩码
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param algorithmmask 27服务 算法掩码
     */
    public void setAlgorithmmask(String algorithmmask) {
        this.algorithmmask = algorithmmask == null ? null : algorithmmask.trim();
    }

    /**
     * 27服务 NRC RTDNE延时 单位ms
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return DELAY 27服务 NRC RTDNE延时 单位ms
     */
    public Short getDelay() {
        return delay;
    }

    /**
     * 27服务 NRC RTDNE延时 单位ms
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param delay 27服务 NRC RTDNE延时 单位ms
     */
    public void setDelay(Short delay) {
        this.delay = delay;
    }

    /**
     * 36服务是否对齐 0-是，1-否
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return ISALIGNMENT 36服务是否对齐 0-是，1-否
     */
    public Short getIsalignment() {
        return isalignment;
    }

    /**
     * 36服务是否对齐 0-是，1-否
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param isalignment 36服务是否对齐 0-是，1-否
     */
    public void setIsalignment(Short isalignment) {
        this.isalignment = isalignment;
    }

    /**
     * 36服务对齐单位
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return ALIGNMENTCOMPANY 36服务对齐单位
     */
    public Short getAlignmentcompany() {
        return alignmentcompany;
    }

    /**
     * 36服务对齐单位
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param alignmentcompany 36服务对齐单位
     */
    public void setAlignmentcompany(Short alignmentcompany) {
        this.alignmentcompany = alignmentcompany;
    }

    /**
     * 重启等待复位时间 单位ms
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return ECUWAITRESETTIME 重启等待复位时间 单位ms
     */
    public Short getEcuwaitresettime() {
        return ecuwaitresettime;
    }

    /**
     * 重启等待复位时间 单位ms
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param ecuwaitresettime 重启等待复位时间 单位ms
     */
    public void setEcuwaitresettime(Short ecuwaitresettime) {
        this.ecuwaitresettime = ecuwaitresettime;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-08-25 15:15:44
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}