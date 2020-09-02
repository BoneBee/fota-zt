package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：原始包解析请求实体
 * @date ：2020/9/2 15:44
 */
public class PackageParseRequest {
    /**
     * 文件信息ID
     */
    private String fileId;
    /**
     * 车型ID
     */
    private String carTypeId;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }
}
