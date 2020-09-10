package com.intest.dao.entity;

import java.util.Date;

public class PartsTypeBto {
    /**
     * 主键 PARTSTYPE_ID
     */
    private String partstypeId;

    /**
     * 零件名称 ，大写字母三位 PARTSTYPENAME
     */
    private String partstypename;

    /**
     * 是否标定，1-包含标定文件；0-不包含标定文件； CALIBRATION
     */
    private Short calibration;

    /**
     * 刷写方式，0-Can，1-Can FD，2-DoIP； BRUSHWRITEMODE
     */
    private Short brushwritemode;

    /**
     * 备注 REMARK
     */
    private String remark;

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
     * 是否删除，1-未删除，0-已删除； ISDELETE
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
     * 主键
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return PARTSTYPE_ID 主键
     */
    public String getPartstypeId() {
        return partstypeId;
    }

    /**
     * 主键
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param partstypeId 主键
     */
    public void setPartstypeId(String partstypeId) {
        this.partstypeId = partstypeId == null ? null : partstypeId.trim();
    }

    /**
     * 零件名称 ，大写字母三位
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return PARTSTYPENAME 零件名称 ，大写字母三位
     */
    public String getPartstypename() {
        return partstypename;
    }

    /**
     * 零件名称 ，大写字母三位
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param partstypename 零件名称 ，大写字母三位
     */
    public void setPartstypename(String partstypename) {
        this.partstypename = partstypename == null ? null : partstypename.trim();
    }

    /**
     * 是否标定，1-包含标定文件；0-不包含标定文件；
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return CALIBRATION 是否标定，1-包含标定文件；0-不包含标定文件；
     */
    public Short getCalibration() {
        return calibration;
    }

    /**
     * 是否标定，1-包含标定文件；0-不包含标定文件；
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param calibration 是否标定，1-包含标定文件；0-不包含标定文件；
     */
    public void setCalibration(Short calibration) {
        this.calibration = calibration;
    }

    /**
     * 刷写方式，0-Can，1-Can FD，2-DoIP；
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return BRUSHWRITEMODE 刷写方式，0-Can，1-Can FD，2-DoIP；
     */
    public Short getBrushwritemode() {
        return brushwritemode;
    }

    /**
     * 刷写方式，0-Can，1-Can FD，2-DoIP；
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param brushwritemode 刷写方式，0-Can，1-Can FD，2-DoIP；
     */
    public void setBrushwritemode(Short brushwritemode) {
        this.brushwritemode = brushwritemode;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 波特率(kbps)
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return BAUDRATE 波特率(kbps)
     */
    public Short getBaudrate() {
        return baudrate;
    }

    /**
     * 波特率(kbps)
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param baudrate 波特率(kbps)
     */
    public void setBaudrate(Short baudrate) {
        this.baudrate = baudrate;
    }

    /**
     * 物理寻址ID
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return PHYICALID 物理寻址ID
     */
    public String getPhyicalid() {
        return phyicalid;
    }

    /**
     * 物理寻址ID
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param phyicalid 物理寻址ID
     */
    public void setPhyicalid(String phyicalid) {
        this.phyicalid = phyicalid == null ? null : phyicalid.trim();
    }

    /**
     * 功能寻址ID
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return FUNCTIONID 功能寻址ID
     */
    public String getFunctionid() {
        return functionid;
    }

    /**
     * 功能寻址ID
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param functionid 功能寻址ID
     */
    public void setFunctionid(String functionid) {
        this.functionid = functionid == null ? null : functionid.trim();
    }

    /**
     * 响应ID
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return RESPONSEID 响应ID
     */
    public String getResponseid() {
        return responseid;
    }

    /**
     * 响应ID
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param responseid 响应ID
     */
    public void setResponseid(String responseid) {
        this.responseid = responseid == null ? null : responseid.trim();
    }

    /**
     * ID类型
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return IDTYPE ID类型
     */
    public String getIdtype() {
        return idtype;
    }

    /**
     * ID类型
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param idtype ID类型
     */
    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    /**
     * 网段名称
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return NETWORKSEGMENTNAME 网段名称
     */
    public String getNetworksegmentname() {
        return networksegmentname;
    }

    /**
     * 网段名称
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param networksegmentname 网段名称
     */
    public void setNetworksegmentname(String networksegmentname) {
        this.networksegmentname = networksegmentname == null ? null : networksegmentname.trim();
    }

    /**
     * 是否删除，1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return ISDELETE 是否删除，1-未删除，0-已删除；
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除，1-未删除，0-已删除；
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param isdelete 是否删除，1-未删除，0-已删除；
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-09-10 16:26:37
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}