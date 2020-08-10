package com.intest.common.result;

/**
 * @author zhanghui
 * @create 2020-08-10 9:41
 */
public class ResultT<E> {

    public ResultT() {
        this.Success = 1;
    }

    private int Success;

    private E Result;

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

    public E getResult() {
        return this.Result;
    }

    public void setResult(E value) {
        this.Result = value;
    }
}
