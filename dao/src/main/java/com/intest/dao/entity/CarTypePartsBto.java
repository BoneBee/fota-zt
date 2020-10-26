package com.intest.dao.entity;

import java.util.Date;

public class CarTypePartsBto {
    /**
     * 主键 CARTYPEPARTS_ID
     */
    private String cartypepartsId;

    /**
     * 零件外键 FK_PARTS_ID
     */
    private String fkPartsId;

    /**
     * 车型外键 FK_CARTYPE_ID
     */
    private String fkCartypeId;

    /**
     * 是否删除 1-未删除；0-删除 ISDELETE
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
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return CARTYPEPARTS_ID 主键
     */
    public String getCartypepartsId() {
        return cartypepartsId;
    }

    /**
     * 主键
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param cartypepartsId 主键
     */
    public void setCartypepartsId(String cartypepartsId) {
        this.cartypepartsId = cartypepartsId == null ? null : cartypepartsId.trim();
    }

    /**
     * 零件外键
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return FK_PARTS_ID 零件外键
     */
    public String getFkPartsId() {
        return fkPartsId;
    }

    /**
     * 零件外键
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param fkPartsId 零件外键
     */
    public void setFkPartsId(String fkPartsId) {
        this.fkPartsId = fkPartsId == null ? null : fkPartsId.trim();
    }

    /**
     * 车型外键
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return FK_CARTYPE_ID 车型外键
     */
    public String getFkCartypeId() {
        return fkCartypeId;
    }

    /**
     * 车型外键
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param fkCartypeId 车型外键
     */
    public void setFkCartypeId(String fkCartypeId) {
        this.fkCartypeId = fkCartypeId == null ? null : fkCartypeId.trim();
    }

    /**
     * 是否删除 1-未删除；0-删除
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return ISDELETE 是否删除 1-未删除；0-删除
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除 1-未删除；0-删除
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param isdelete 是否删除 1-未删除；0-删除
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-10-26 10:45:17
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author intest
     * @date 2020-10-26 10:45:17
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}