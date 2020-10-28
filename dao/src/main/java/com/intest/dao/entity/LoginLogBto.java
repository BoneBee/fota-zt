package com.intest.dao.entity;

import java.util.Date;

public class LoginLogBto {
    /**
     * 登陆日志ID LOGINLOG_ID
     */
    private String loginlogId;

    /**
     * 登陆账户ID FK_USER_ID
     */
    private String fkUserId;

    /**
     * 登陆结果（0-失败 1-成功） LOGIN_RESULT
     */
    private Short loginResult;

    /**
     * 登陆IP LOGIN_IP
     */
    private String loginIp;

    /**
     * 浏览器 BROWSER
     */
    private String browser;

    /**
     * 备注 NOTE
     */
    private String note;

    /**
     * 是否删除（1-未删除，0-已删除；） ISDELETE
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
     * 登陆日志ID
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return LOGINLOG_ID 登陆日志ID
     */
    public String getLoginlogId() {
        return loginlogId;
    }

    /**
     * 登陆日志ID
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param loginlogId 登陆日志ID
     */
    public void setLoginlogId(String loginlogId) {
        this.loginlogId = loginlogId == null ? null : loginlogId.trim();
    }

    /**
     * 登陆账户ID
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return FK_USER_ID 登陆账户ID
     */
    public String getFkUserId() {
        return fkUserId;
    }

    /**
     * 登陆账户ID
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param fkUserId 登陆账户ID
     */
    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
    }

    /**
     * 登陆结果（0-失败 1-成功）
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return LOGIN_RESULT 登陆结果（0-失败 1-成功）
     */
    public Short getLoginResult() {
        return loginResult;
    }

    /**
     * 登陆结果（0-失败 1-成功）
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param loginResult 登陆结果（0-失败 1-成功）
     */
    public void setLoginResult(Short loginResult) {
        this.loginResult = loginResult;
    }

    /**
     * 登陆IP
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return LOGIN_IP 登陆IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 登陆IP
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param loginIp 登陆IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 浏览器
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return BROWSER 浏览器
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * 浏览器
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param browser 浏览器
     */
    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return NOTE 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return ISDELETE 是否删除（1-未删除，0-已删除；）
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param isdelete 是否删除（1-未删除，0-已删除；）
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-10-26 11:36:33
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}