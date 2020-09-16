package com.intest.dao.entity;

import java.util.Date;

public class PartsBto {
    /**
     * 主键 PARTS_ID
     */
    private String partsId;

    /**
     * 零部件中文名称 PARTSNAME
     */
    private String partsname;

    /**
     * 零部件编码 PARTSCODE
     */
    private String partscode;

    /**
     * 外键，零部件类型ID FK_PARTSTYPE_ID
     */
    private String fkPartstypeId;

    /**
     * 外键，车型ID FK_CARTYPE_ID
     */
    private String fkCartypeId;

    /**
     * 升级顺内需 ORDERNUM
     */
    private Short ordernum;

    /**
     * 是否标定,1-包含标定文件；0-不包含标定文件； CALIBRATION
     */
    private Short calibration;

    /**
     * 刷写方式,0-Can，1-Can FD，2-DoIP； BRUSHWRITEMODE
     */
    private Short brushwritemode;

    /**
     * 波特率(kbps) BAUDRATE
     */
    private Short baudrate;

    /**
     * 物理寻址ID PHYICALID
     */
    private String phyicalid;

    /**
     * 功能寻址ID FUNCTIONID
     */
    private String functionid;

    /**
     * 响应ID RESPONSEID
     */
    private String responseid;

    /**
     * ID类型 IDTYPE
     */
    private String idtype;

    /**
     * 网段名称 NETWORKSEGMENTNAME
     */
    private String networksegmentname;

    /**
     * 硬件版本号 HARDWAREVERSION
     */
    private String hardwareversion;

    /**
     * 零部件号 PARTNUMBER
     */
    private String partnumber;

    /**
     * CAN端口 CANPORT
     */
    private Short canport;

    /**
     * 是否删除,1-未删除，0-已删除； ISDELETE
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
     * 备注 REMARK
     */
    private String remark;

    /**
     * 主键
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return PARTS_ID 主键
     */
    public String getPartsId() {
        return partsId;
    }

    /**
     * 主键
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param partsId 主键
     */
    public void setPartsId(String partsId) {
        this.partsId = partsId == null ? null : partsId.trim();
    }

    /**
     * 零部件中文名称
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return PARTSNAME 零部件中文名称
     */
    public String getPartsname() {
        return partsname;
    }

    /**
     * 零部件中文名称
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param partsname 零部件中文名称
     */
    public void setPartsname(String partsname) {
        this.partsname = partsname == null ? null : partsname.trim();
    }

    /**
     * 零部件编码
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return PARTSCODE 零部件编码
     */
    public String getPartscode() {
        return partscode;
    }

    /**
     * 零部件编码
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param partscode 零部件编码
     */
    public void setPartscode(String partscode) {
        this.partscode = partscode == null ? null : partscode.trim();
    }

    /**
     * 外键，零部件类型ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return FK_PARTSTYPE_ID 外键，零部件类型ID
     */
    public String getFkPartstypeId() {
        return fkPartstypeId;
    }

    /**
     * 外键，零部件类型ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param fkPartstypeId 外键，零部件类型ID
     */
    public void setFkPartstypeId(String fkPartstypeId) {
        this.fkPartstypeId = fkPartstypeId == null ? null : fkPartstypeId.trim();
    }

    /**
     * 外键，车型ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return FK_CARTYPE_ID 外键，车型ID
     */
    public String getFkCartypeId() {
        return fkCartypeId;
    }

    /**
     * 外键，车型ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param fkCartypeId 外键，车型ID
     */
    public void setFkCartypeId(String fkCartypeId) {
        this.fkCartypeId = fkCartypeId == null ? null : fkCartypeId.trim();
    }

    /**
     * 升级顺内需
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return ORDERNUM 升级顺内需
     */
    public Short getOrdernum() {
        return ordernum;
    }

    /**
     * 升级顺内需
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param ordernum 升级顺内需
     */
    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * 是否标定,1-包含标定文件；0-不包含标定文件；
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return CALIBRATION 是否标定,1-包含标定文件；0-不包含标定文件；
     */
    public Short getCalibration() {
        return calibration;
    }

    /**
     * 是否标定,1-包含标定文件；0-不包含标定文件；
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param calibration 是否标定,1-包含标定文件；0-不包含标定文件；
     */
    public void setCalibration(Short calibration) {
        this.calibration = calibration;
    }

    /**
     * 刷写方式,0-Can，1-Can FD，2-DoIP；
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return BRUSHWRITEMODE 刷写方式,0-Can，1-Can FD，2-DoIP；
     */
    public Short getBrushwritemode() {
        return brushwritemode;
    }

    /**
     * 刷写方式,0-Can，1-Can FD，2-DoIP；
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param brushwritemode 刷写方式,0-Can，1-Can FD，2-DoIP；
     */
    public void setBrushwritemode(Short brushwritemode) {
        this.brushwritemode = brushwritemode;
    }

    /**
     * 波特率(kbps)
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return BAUDRATE 波特率(kbps)
     */
    public Short getBaudrate() {
        return baudrate;
    }

    /**
     * 波特率(kbps)
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param baudrate 波特率(kbps)
     */
    public void setBaudrate(Short baudrate) {
        this.baudrate = baudrate;
    }

    /**
     * 物理寻址ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return PHYICALID 物理寻址ID
     */
    public String getPhyicalid() {
        return phyicalid;
    }

    /**
     * 物理寻址ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param phyicalid 物理寻址ID
     */
    public void setPhyicalid(String phyicalid) {
        this.phyicalid = phyicalid == null ? null : phyicalid.trim();
    }

    /**
     * 功能寻址ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return FUNCTIONID 功能寻址ID
     */
    public String getFunctionid() {
        return functionid;
    }

    /**
     * 功能寻址ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param functionid 功能寻址ID
     */
    public void setFunctionid(String functionid) {
        this.functionid = functionid == null ? null : functionid.trim();
    }

    /**
     * 响应ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return RESPONSEID 响应ID
     */
    public String getResponseid() {
        return responseid;
    }

    /**
     * 响应ID
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param responseid 响应ID
     */
    public void setResponseid(String responseid) {
        this.responseid = responseid == null ? null : responseid.trim();
    }

    /**
     * ID类型
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return IDTYPE ID类型
     */
    public String getIdtype() {
        return idtype;
    }

    /**
     * ID类型
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param idtype ID类型
     */
    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    /**
     * 网段名称
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return NETWORKSEGMENTNAME 网段名称
     */
    public String getNetworksegmentname() {
        return networksegmentname;
    }

    /**
     * 网段名称
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param networksegmentname 网段名称
     */
    public void setNetworksegmentname(String networksegmentname) {
        this.networksegmentname = networksegmentname == null ? null : networksegmentname.trim();
    }

    /**
     * 硬件版本号
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return HARDWAREVERSION 硬件版本号
     */
    public String getHardwareversion() {
        return hardwareversion;
    }

    /**
     * 硬件版本号
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param hardwareversion 硬件版本号
     */
    public void setHardwareversion(String hardwareversion) {
        this.hardwareversion = hardwareversion == null ? null : hardwareversion.trim();
    }

    /**
     * 零部件号
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return PARTNUMBER 零部件号
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * 零部件号
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param partnumber 零部件号
     */
    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber == null ? null : partnumber.trim();
    }

    /**
     * CAN端口
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return CANPORT CAN端口
     */
    public Short getCanport() {
        return canport;
    }

    /**
     * CAN端口
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param canport CAN端口
     */
    public void setCanport(Short canport) {
        this.canport = canport;
    }

    /**
     * 是否删除,1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return ISDELETE 是否删除,1-未删除，0-已删除；
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除,1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param isdelete 是否删除,1-未删除，0-已删除；
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-09-10 16:21:11
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}