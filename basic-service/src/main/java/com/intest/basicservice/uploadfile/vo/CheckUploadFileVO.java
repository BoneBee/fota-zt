package com.intest.basicservice.uploadfile.vo;

import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-11 20:19
 */
public class CheckUploadFileVO {
    private String FileId;

    private int UploadKind;

    private List<Integer> ChunkDone;

    public void setFileId(String value) {
        this.FileId = value;
    }

    public void setUploadKind(int value) {
        this.UploadKind = value;
    }

    public void setChunkDone(List<Integer> value) {
        this.ChunkDone = value;
    }

    public String getFileId() {
        return this.FileId;
    }

    public int getUploadKind() {
        return this.UploadKind;
    }

    public List<Integer> getChunkDone() {
        return this.ChunkDone;
    }
}
