package com.intest.dao.entity;

import java.util.Date;

public class OperateLogBto {
    /**
     * 操作日志ID OPERATE_ID
     */
    private String operateId;

    /**
     * 登陆账户ID FK_USER_ID
     */
    private String fkUserId;

    /**
     * 操作模块 OPERATE_MODE
     */
    private String operateMode;

    /**
     * 操作动作 OPERATE_ACTION
     */
    private String operateAction;

    /**
     * 登陆IP LOGIN_IP
     */
    private String loginIp;

    /**
     * 浏览器 BROWSER
     */
    private String browser;

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
     * 操作描述 ACTION_REMARK
     */
    private String actionRemark;

    /**
     * 操作日志ID
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return OPERATE_ID 操作日志ID
     */
    public String getOperateId() {
        return operateId;
    }

    /**
     * 操作日志ID
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param operateId 操作日志ID
     */
    public void setOperateId(String operateId) {
        this.operateId = operateId == null ? null : operateId.trim();
    }

    /**
     * 登陆账户ID
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return FK_USER_ID 登陆账户ID
     */
    public String getFkUserId() {
        return fkUserId;
    }

    /**
     * 登陆账户ID
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param fkUserId 登陆账户ID
     */
    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
    }

    /**
     * 操作模块
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return OPERATE_MODE 操作模块
     */
    public String getOperateMode() {
        return operateMode;
    }

    /**
     * 操作模块
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param operateMode 操作模块
     */
    public void setOperateMode(String operateMode) {
        this.operateMode = operateMode == null ? null : operateMode.trim();
    }

    /**
     * 操作动作
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return OPERATE_ACTION 操作动作
     */
    public String getOperateAction() {
        return operateAction;
    }

    /**
     * 操作动作
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param operateAction 操作动作
     */
    public void setOperateAction(String operateAction) {
        this.operateAction = operateAction == null ? null : operateAction.trim();
    }

    /**
     * 登陆IP
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return LOGIN_IP 登陆IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 登陆IP
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param loginIp 登陆IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 浏览器
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return BROWSER 浏览器
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * 浏览器
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param browser 浏览器
     */
    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return ISDELETE 是否删除（1-未删除，0-已删除；）
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param isdelete 是否删除（1-未删除，0-已删除；）
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    /**
     * 操作描述
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @return ACTION_REMARK 操作描述
     */
    public String getActionRemark() {
        return actionRemark;
    }

    /**
     * 操作描述
     * @author xialiang
     * @date 2020-11-10 10:45:08
     * @param actionRemark 操作描述
     */
    public void setActionRemark(String actionRemark) {
        this.actionRemark = actionRemark == null ? null : actionRemark.trim();
    }
}