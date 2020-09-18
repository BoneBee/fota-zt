package com.intest.basicservice.user.request;

public class UpdateUserRequest {
    private String userId;
    private String realName;
    private String jobNumber;
    private String mobile;
    private String companyEmail;
    private int accountStatus;
    private String note;

    public UpdateUserRequest() {
    }

    public UpdateUserRequest(String userId, String realName, String jobNumber, String mobile, String companyEmail, int accountStatus, String note) {
        this.userId = userId;
        this.realName = realName;
        this.jobNumber = jobNumber;
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
