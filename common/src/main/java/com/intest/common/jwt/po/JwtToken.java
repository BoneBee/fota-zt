package com.intest.common.jwt.po;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author zhanghui
 * @create 2020-08-26 21:49
 */
public class JwtToken implements AuthenticationToken {

    private static final long serialVersionUID = 1900286977895826147L;

    /**
     * Token
     */
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
