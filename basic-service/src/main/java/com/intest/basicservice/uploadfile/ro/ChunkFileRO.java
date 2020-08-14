package com.intest.basicservice.uploadfile.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhanghui
 * @create 2020-08-10 15:32
 */
public class ChunkFileRO {
    public ChunkFileRO(){

    }

    private String FileId;

    private int ChunkIndex;

    public String getFileId() {
        return this.FileId;
    }

    public int getChunkIndex() {
        return this.ChunkIndex;
    }

    @JsonProperty("fileId")
    public void setFileId(String value) {
        this.FileId = value;
    }

    @JsonProperty("chunkIndex")
    public void setChunkIndex(int value) {
        this.ChunkIndex = value;
    }
}
