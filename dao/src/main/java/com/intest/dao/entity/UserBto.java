package com.intest.dao.entity;

import java.util.Date;

public class UserBto {
    /**
     * 主键，账户ID USER_ID
     */
    private String userId;

    /**
     * 登陆账号 LOGIN_NAME
     */
    private String loginName;

    /**
     * 登陆密码 LOGIN_PASSWORD
     */
    private String loginPassword;

    /**
     * 加密盐值 CSPRNG
     */
    private String csprng;

    /**
     * 姓名 REAL_NAME
     */
    private String realName;

    /**
     * 部门 DEPARTMENT
     */
    private String department;

    /**
     * 手机 MOBILE
     */
    private String mobile;

    /**
     * 公司邮箱地址 COMPANY_EMAIL
     */
    private String companyEmail;

    /**
     * 性别（0-女 ；1-男） SEX
     */
    private Short sex;

    /**
     * 备注 NOTE
     */
    private String note;

    /**
     * 账户类型（1-系统用户账户；2-服务账户） ACCOUNT_KIND
     */
    private Short accountKind;

    /**
     * 上次登陆时间 LAST_LOGINAT
     */
    private Date lastLoginat;

    /**
     * 密码重试次数 PASSWORD_RETRY_COUNT
     */
    private Integer passwordRetryCount;

    /**
     * 账户状态（1-启用，0-冻结；） ACCOUNT_STATUS
     */
    private Short accountStatus;

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
     * 主键，账户ID
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return USER_ID 主键，账户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 主键，账户ID
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param userId 主键，账户ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 登陆账号
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return LOGIN_NAME 登陆账号
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 登陆账号
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param loginName 登陆账号
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 登陆密码
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return LOGIN_PASSWORD 登陆密码
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 登陆密码
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param loginPassword 登陆密码
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * 加密盐值
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return CSPRNG 加密盐值
     */
    public String getCsprng() {
        return csprng;
    }

    /**
     * 加密盐值
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param csprng 加密盐值
     */
    public void setCsprng(String csprng) {
        this.csprng = csprng == null ? null : csprng.trim();
    }

    /**
     * 姓名
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return REAL_NAME 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 姓名
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 部门
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return DEPARTMENT 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 部门
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 手机
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return MOBILE 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 公司邮箱地址
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return COMPANY_EMAIL 公司邮箱地址
     */
    public String getCompanyEmail() {
        return companyEmail;
    }

    /**
     * 公司邮箱地址
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param companyEmail 公司邮箱地址
     */
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    /**
     * 性别（0-女 ；1-男）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return SEX 性别（0-女 ；1-男）
     */
    public Short getSex() {
        return sex;
    }

    /**
     * 性别（0-女 ；1-男）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param sex 性别（0-女 ；1-男）
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return NOTE 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 账户类型（1-系统用户账户；2-服务账户）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return ACCOUNT_KIND 账户类型（1-系统用户账户；2-服务账户）
     */
    public Short getAccountKind() {
        return accountKind;
    }

    /**
     * 账户类型（1-系统用户账户；2-服务账户）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param accountKind 账户类型（1-系统用户账户；2-服务账户）
     */
    public void setAccountKind(Short accountKind) {
        this.accountKind = accountKind;
    }

    /**
     * 上次登陆时间
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return LAST_LOGINAT 上次登陆时间
     */
    public Date getLastLoginat() {
        return lastLoginat;
    }

    /**
     * 上次登陆时间
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param lastLoginat 上次登陆时间
     */
    public void setLastLoginat(Date lastLoginat) {
        this.lastLoginat = lastLoginat;
    }

    /**
     * 密码重试次数
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return PASSWORD_RETRY_COUNT 密码重试次数
     */
    public Integer getPasswordRetryCount() {
        return passwordRetryCount;
    }

    /**
     * 密码重试次数
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param passwordRetryCount 密码重试次数
     */
    public void setPasswordRetryCount(Integer passwordRetryCount) {
        this.passwordRetryCount = passwordRetryCount;
    }

    /**
     * 账户状态（1-启用，0-冻结；）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return ACCOUNT_STATUS 账户状态（1-启用，0-冻结；）
     */
    public Short getAccountStatus() {
        return accountStatus;
    }

    /**
     * 账户状态（1-启用，0-冻结；）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param accountStatus 账户状态（1-启用，0-冻结；）
     */
    public void setAccountStatus(Short accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return ISDELETE 是否删除（1-未删除，0-已删除；）
     */
    public Short getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除（1-未删除，0-已删除；）
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param isdelete 是否删除（1-未删除，0-已删除；）
     */
    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return CREATEAT 创建时间
     */
    public Date getCreateat() {
        return createat;
    }

    /**
     * 创建时间
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param createat 创建时间
     */
    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return CREATEBY 创建人
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 创建人
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param createby 创建人
     */
    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return UPDATEAT 修改时间
     */
    public Date getUpdateat() {
        return updateat;
    }

    /**
     * 修改时间
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param updateat 修改时间
     */
    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @return UPDATEBY 修改人
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * 修改人
     * @author xialiang
     * @date 2020-10-20 15:22:54
     * @param updateby 修改人
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }
}