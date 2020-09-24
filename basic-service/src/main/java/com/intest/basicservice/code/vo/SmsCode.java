package com.intest.basicservice.code.vo;

import java.time.LocalDateTime;

/**
 * @author ：intest
 * @description：验证码信息实体
 * @date ：2020/9/18 16:41
 */
public class SmsCode {
    /**
     * 验证码
     */
    private String code;
    /**
     * 过期时间
     */
    private LocalDateTime expireTime;

    public SmsCode(String code, int expireIn){
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public SmsCode(String code, LocalDateTime expireTime){
        this.code = code;
        this.expireTime = expireTime;
    }

    boolean isExpire(){
        return LocalDateTime.now().isAfter(expireTime);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }
}
