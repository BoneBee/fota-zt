package com.intest.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OperateLogResponse {
    private int index;//序号
    private String loginName;//操作账户
    private String realName;//姓名
    private String roleName;//用户角色
    private String actionModel;//操作模块
    private String actioning;//操作动作
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date actionTime;//操作时间
    private String actionIp;//IP地址
    private String browser;//浏览器

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getActionModel() {
        return actionModel;
    }

    public void setActionModel(String actionModel) {
        this.actionModel = actionModel;
    }

    public String getActioning() {
        return actioning;
    }

    public void setActioning(String actioning) {
        this.actioning = actioning;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public String getActionIp() {
        return actionIp;
    }

    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
}
