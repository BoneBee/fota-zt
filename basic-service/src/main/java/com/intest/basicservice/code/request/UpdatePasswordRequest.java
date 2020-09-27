package com.intest.basicservice.code.request;

/**
 * @author ：intest
 * @description：用户登录密码修改请求实体
 * @date ：2020/9/25 9:19
 */
public class UpdatePasswordRequest {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 登录密码
     */
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
