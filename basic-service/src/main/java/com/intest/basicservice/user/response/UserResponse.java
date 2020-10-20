package com.intest.basicservice.user.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserResponse {
    private int index;
    private String userId;
    private String loginName;
    private String realName;
    private String roleName;
    private String roleId;
    private String department;
    private String mobile;
    private String companyEmail;
    private String sex;
    private String note;
    private String accountKind;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastLoginat;
    private int accountStatus;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createat;
    private String createby;

    public UserResponse() {
    }

    public UserResponse(int index, String userId, String loginName, String realName, String roleName, String roleId, String department, String mobile, String companyEmail, String sex, String note, String accountKind, Date lastLoginat, int accountStatus, Date createat, String createby) {
        this.index = index;
        this.userId = userId;
        this.loginName = loginName;
        this.realName = realName;
        this.roleName = roleName;
        this.roleId = roleId;
        this.department = department;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
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
