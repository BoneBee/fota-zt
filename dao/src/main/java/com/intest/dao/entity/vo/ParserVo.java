package com.intest.dao.entity.vo;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/17 9:37
 */
public class ParserVo {
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
