package com.intest.basicservice.uploadfile.vo;

/**
 * @author zhanghui
 * @create 2020-08-11 20:20
 */
public class ChunkFileVO {
    private String Msg;

    private int ChunkIndex;

    public String getMsg() {
        return this.Msg;
    }

    public int getChunkIndex() {
        return this.ChunkIndex;
    }

    public void setMsg(String value) {
        this.Msg = value;
    }

    public void setChunkIndex(int value) {
        this.ChunkIndex = value;
    }
}
