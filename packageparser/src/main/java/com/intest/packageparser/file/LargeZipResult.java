package com.intest.packageparser.file;

import lombok.Data;

import java.util.List;

public class LargeZipResult {
    /**
     * 原始包编号
     */
    private String largeZipId;
    /**
     * 对应的文件信息ID
     */
    private String fileId;
    /**
     * 原始包名称
     */
    private String largeZipName;
    /**
     * 是否解析成功
     * true:成功
     * false:失败
     */
    private boolean success = true;
    /**
     * 错误提示信息集合
     */
    private List<String> errors;
    /**
     * 控制器包集合
     */
    private List<ZipResult> zipResults;
    /**
     * 车型编号
     */
    private String carTypeId;

    public String getLargeZipId() {
        return largeZipId;
    }

    public void setLargeZipId(String largeZipId) {
        this.largeZipId = largeZipId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getLargeZipName() {
        return largeZipName;
    }

    public void setLargeZipName(String largeZipName) {
        this.largeZipName = largeZipName;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public List<ZipResult> getZipResults() {
        return zipResults;
    }

    public void setZipResults(List<ZipResult> zipResults) {
        this.zipResults = zipResults;
    }

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }
}
