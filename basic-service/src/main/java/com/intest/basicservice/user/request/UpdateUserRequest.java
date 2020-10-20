package com.intest.basicservice.user.request;

public class UpdateUserRequest {
    private String userId;
    private String realName;
    private String roleId;
    private String department;
    private String mobile;
    private String companyEmail;
    private int accountStatus;
    private String note;

    public UpdateUserRequest() {
    }

    public UpdateUserRequest(String userId, String realName, String roleId, String department, String mobile, String companyEmail, int accountStatus, String note) {
        this.userId = userId;
        this.realName = realName;
        this.roleId = roleId;
        this.department = department;
        this.mobile = mobile;
        this.companyEmail = companyEmail;
        this.accountStatus = accountStatus;
        this.note = note;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
