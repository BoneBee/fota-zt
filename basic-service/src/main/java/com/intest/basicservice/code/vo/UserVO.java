package com.intest.basicservice.code.vo;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/9/25 9:28
 */
public class UserVO {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 登录名
     */
    private String loginName;

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
}
