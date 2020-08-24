package com.intest.dao.entity;

import java.util.Date;

public class MenuBto {
    /**
     * 菜单ID MENU_ID
     */
    private String menuId;

    /**
     * 父菜单ID FK_MENU_ID
     */
    private String fkMenuId;

    /**
     * 菜单显示名称 MENUDISPLAYNAME
     */
    private String menudisplayname;

    /**
     * 菜单链接 MENULINK
     */
    private String menulink;

    /**
     * 菜单图标 ICON
     */
    private String icon;

    /**
     * 是否在导航菜单中显示 1-显示；0-不显示； ISSHOW
     */
    private Short isshow;

    /**
     * 是否是页面 1-是页面；0-不是页面； ISPAGE
     */
    private Short ispage;

    /**
     * 顺序号 ORDERNO
     */
    private Short orderno;

    /**
     * 备注 NOTE
     */
    private String note;

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
     * 菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return MENU_ID 菜单ID
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param menuId 菜单ID
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * 父菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return FK_MENU_ID 父菜单ID
     */
    public String getFkMenuId() {
        return fkMenuId;
    }

    /**
     * 父菜单ID
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param fkMenuId 父菜单ID
     */
    public void setFkMenuId(String fkMenuId) {
        this.fkMenuId = fkMenuId == null ? null : fkMenuId.trim();
    }

    /**
     * 菜单显示名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return MENUDISPLAYNAME 菜单显示名称
     */
    public String getMenudisplayname() {
        return menudisplayname;
    }

    /**
     * 菜单显示名称
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param menudisplayname 菜单显示名称
     */
    public void setMenudisplayname(String menudisplayname) {
        this.menudisplayname = menudisplayname == null ? null : menudisplayname.trim();
    }

    /**
     * 菜单链接
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return MENULINK 菜单链接
     */
    public String getMenulink() {
        return menulink;
    }

    /**
     * 菜单链接
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param menulink 菜单链接
     */
    public void setMenulink(String menulink) {
        this.menulink = menulink == null ? null : menulink.trim();
    }

    /**
     * 菜单图标
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ICON 菜单图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 菜单图标
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param icon 菜单图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 是否在导航菜单中显示 1-显示；0-不显示；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISSHOW 是否在导航菜单中显示 1-显示；0-不显示；
     */
    public Short getIsshow() {
        return isshow;
    }

    /**
     * 是否在导航菜单中显示 1-显示；0-不显示；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isshow 是否在导航菜单中显示 1-显示；0-不显示；
     */
    public void setIsshow(Short isshow) {
        this.isshow = isshow;
    }

    /**
     * 是否是页面 1-是页面；0-不是页面；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISPAGE 是否是页面 1-是页面；0-不是页面；
     */
    public Short getIspage() {
        return ispage;
    }

    /**
     * 是否是页面 1-是页面；0-不是页面；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param ispage 是否是页面 1-是页面；0-不是页面；
     */
    public void setIspage(Short ispage) {
        this.ispage = ispage;
    }

    /**
     * 顺序号
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ORDERNO 顺序号
     */
    public Short getOrderno() {
        return orderno;
    }

    /**
     * 顺序号
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param orderno 顺序号
     */
    public void setOrderno(Short orderno) {
        this.orderno = orderno;
    }

    /**
     * 备注
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return NOTE 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 1-未删除，0-已删除；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @return ISDELETE 1-未删除，0-已删除；
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 1-未删除，0-已删除；
     * @author 张辉
     * @date 2020-08-23 00:24:30
     * @param isdelete 1-未删除，0-已删除；
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