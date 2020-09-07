package com.intest.dao.entity;

import java.util.Date;

public class CarTypeBto {
    /**
     * 主键，车型编号 CARTYPE_ID
     */
    private String cartypeId;

    /**
     * 车型名称 CARTYPENAME
     */
    private String cartypename;

    /**
     * 备注 REMARK
     */
    private String remark;

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
     * TERMINALType FK_TERMINAL_ID
     */
    private String fkTerminalId;

    /**
     * 主键，车型编号
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return CARTYPE_ID 主键，车型编号
     */
    public String getCartypeId() {
        return cartypeId;
    }

    /**
     * 主键，车型编号
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param cartypeId 主键，车型编号
     */
    public void setCartypeId(String cartypeId) {
        this.cartypeId = cartypeId == null ? null : cartypeId.trim();
    }

    /**
     * 车型名称
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return CARTYPENAME 车型名称
     */
    public String getCartypename() {
        return cartypename;
    }

    /**
     * 车型名称
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param cartypename 车型名称
     */
    public void setCartypename(String cartypename) {
        this.cartypename = cartypename == null ? null : cartypename.trim();
    }

    /**
     * 备注
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否删除
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return ISDELETE 是否删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param isdelete 是否删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * TERMINALType
     * @author intest
     * @date 2020-08-28 16:59:59
     * @return FK_TERMINAL_ID TERMINALType
     */
    public String getFkTerminalId() {
        return fkTerminalId;
    }

    /**
     * TERMINALType
     * @author intest
     * @date 2020-08-28 16:59:59
     * @param fkTerminalId TERMINALType
     */
    public void setFkTerminalId(String fkTerminalId) {
        this.fkTerminalId = fkTerminalId == null ? null : fkTerminalId.trim();
    }
}