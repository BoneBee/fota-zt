package com.intest.basicservice.user.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserResponse {
    private int index;
    private String userId;
    private String loginName;
    private String realName;
    private String jobNumber;
    private String mobile;
    private String companyEmail;
    private String sex;
    private String note;
    private String accountKind;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastLoginat;
    private String accountStatus;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createat;
    private String createby;

    public UserResponse() {
    }

    public UserResponse(int index, String userId, String loginName, String realName, String jobNumber, String mobile, String companyEmail, String sex, String note, String accountKind, Date lastLoginat, String accountStatus, Date createat, String createby) {
        this.index = index;
        this.userId = userId;
        this.loginName = loginName;
        this.realName = realName;
        this.jobNumber = jobNumber;
        this.mobile = mobile;
        this.companyEmail = companyEmail;
        this.sex = sex;
        this.note = note;
        this.accountKind = accountKind;
        this.lastLoginat = lastLoginat;
        this.accountStatus = accountStatus;
        this.createat = createat;
        this.createby = createby;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAccountKind() {
        return accountKind;
    }

    public void setAccountKind(String accountKind) {
        this.accountKind = accountKind;
    }

    public Date getLastLoginat() {
        return lastLoginat;
    }

    public void setLastLoginat(Date lastLoginat) {
        this.lastLoginat = lastLoginat;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }
}
