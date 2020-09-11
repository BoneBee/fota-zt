package com.intest.packageservice.request;

import javax.validation.constraints.Size;

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
    @Size(min = 36, max = 36, message = "车型ID长度必须为36")
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
