package com.intest.basicservice.user.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-21 9:30
 */
public class LoginVO {

    private int IsCanLogin;

    private String Token;

    private int FreeNum;

    private List<MenuVO> Menus;

    @JsonProperty("isCanLogin")
    public int getIsCanLogin() {
        return this.IsCanLogin;
    }

    @JsonProperty("token")
    public String getToken() {
        return this.Token;
    }

    @JsonProperty("freeNum")
    public int getFreeNum() {
        return this.FreeNum;
    }

    @JsonProperty("menus")
    public List<MenuVO> getMenus() {
        if (this.Menus == null) {
            this.Menus = new ArrayList<>();
        }
        return this.Menus;
    }

    /**
     * 1-登录成功；
     * 2-用户名或密码错误；
     * 3-账户被冻结；
     * @param value
     */
    public void setIsCanLogin(int value) {
        this.IsCanLogin = value;
    }

    public void setToken(String value) {
        this.Token = value;
    }

    public void setFreeNum(int value) {
        this.FreeNum = value;
    }

    public void setMenus(List<MenuVO> value) {
        this.Menus = value;
    }
}
