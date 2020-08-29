package com.intest.common.result;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 公共返回类型
 * @author zhanghui
 * @create 2020-08-26 14:08
 */
@JsonPropertyOrder({"success", "msg"})
public class Result {

    public Result() {
        this.Success = 1;
    }

    public Result(int success, String msg)
    {
        this.Success = success;
        this.Msg = msg;
    }

    private int Success;

    private String Msg;

    public int getSuccess() {
        return this.Success;
    }

    public void setSuccess(int value) {
        this.Success = value;
    }

    /*
     * 返回失败
     */
    public void setFail() {
        this.Success = -1;
    }

    public String getMsg(){
        return this.Msg;
    }

    public void setMsg(String value) {
        this.Msg = value;
    }
}
