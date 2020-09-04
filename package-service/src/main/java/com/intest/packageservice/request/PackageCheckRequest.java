package com.intest.packageservice.vo;

/**
 * @author ：intest
 * @description：原始包检查请求实体
 * @date ：2020/9/2 15:25
 */
public class PackageCheckRequest {
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 车型ID
     */
    private String carTypeId;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }
}
