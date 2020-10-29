package com.intest.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LoginLogResponse {
    private int index;//序号
    private String loginName;//登陆账户
    private String realName;//姓名
    private String roleName;//用户角色
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date loginTime;//登陆时间
    private int loginResult;//登陆结果
    private String loginIp;//IP地址
    private String browser;//浏览器
    private String remak;//描述

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

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public int getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(int loginResult) {
        this.loginResult = loginResult;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getRemak() {
        return remak;
    }

    public void setRemak(String remak) {
        this.remak = remak;
    }
}
