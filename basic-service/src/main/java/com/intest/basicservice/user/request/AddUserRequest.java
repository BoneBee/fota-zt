package com.intest.basicservice.user.request;

public class AddUserRequest {
    private String loginName;
    private String loginPassword;
    private String realName;
    private String jobNumber;
    private String mobile;
    private String companyEmail;
    private int sex;
    private int accountKind;
    private int accountStatus;
    private String note;

    public AddUserRequest() {
    }

    public AddUserRequest(String loginName, String loginPassword, String realName, String jobNumber, String mobile, String companyEmail, int sex, int accountKind, int accountStatus, String note) {
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.realName = realName;
        this.jobNumber = jobNumber;
        this.mobile = mobile;
        this.companyEmail = companyEmail;
        this.sex = sex;
        this.accountKind = accountKind;
        this.accountStatus = accountStatus;
        this.note = note;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAccountKind() {
        return accountKind;
    }

    public void setAccountKind(int accountKind) {
        this.accountKind = accountKind;
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
