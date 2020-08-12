package com.intest.basicservice.uploadfile.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhanghui
 * @create 2020-08-10 15:21
 */
public class PreUploadFileRO {

    /*
     * 原始文件名称
     */
    @JsonProperty("OriginalName")
    private String OriginalName;

    /*
     * 文件大小
     */
    @JsonProperty("Size")
    private BigDecimal Size;

    /*
     * 文件修改时间
     */
    @JsonProperty("LastModifiedDate")
    private Date LastModifiedDate;

    /*
     * 上传类型
     */
    @JsonProperty("UploadType")
    private int UploadType;

    public void setOriginalName(String value) {
        this.OriginalName = value;
    }

    public void setSize(BigDecimal value) {
        this.Size = value;
    }

    public void setLastModifiedDate(Date value) {
        this.LastModifiedDate = value;
    }

    public void setUploadType(int value) {
        this.UploadType = value;
    }

    public String getOriginalName() {
        return this.OriginalName;
    }

    public BigDecimal getSize() {
        return this.Size;
    }

    public Date getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    public int getUploadType() {
        return this.UploadType;
    }
}
