package com.intest.basicservice.uploadfile.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhanghui
 * @create 2020-08-10 15:32
 */
public class ChunkFileRO {
    public ChunkFileRO(){

    }

    @JsonProperty("fileId")
    public String FileId = "";

    @JsonProperty("chunkIndex")
    public int ChunkIndex;

    public String getFileId() {
        return this.FileId;
    }

    public int getChunkIndex() {
        return this.ChunkIndex;
    }

    public void setFileId(String value) {
        this.FileId = value;
    }

    public void setChunkIndex(int value) {
        this.ChunkIndex = value;
    }
}
