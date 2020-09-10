package com.intest.packageparser.file;

import java.util.List;

public class ZipResult {
    /**
     * 文件信息ID
     */
    private String fileId;
    /**
     * 控制器包编号
     */
    private String zipId;
    /**
     * 控制器包名称
     */
    private String zipName;
    /**
     * 控制器包后缀
     */
    private String suffix;
    /**
     * 控制器包大小
     */
    private Long zipSize;
    /**
     * 控制器编号
     */
    private String partId;
    /**
     * 控制器类型
     */
    private String partType;
    /**
     * 控制器号
     */
    private String partCode;
    /**
     * 车型
     */
    private String carType;
    /**
     * 软件版本
     */
    private String version;
    /**
     * 目标软件版本
     */
    private String targetVersion;
    /**
     * 是否标定
     * 1：标定
     * 0：非标定
     */
    private int calibration;
    /**
     * 刷写方式
     * 1：CAN
     * 0：CAN FD
     */
    private int brushWriteModel;
    /**
     * 波特率
     */
    private String baudRate;
    /**
     * 物理ID
     */
    private String physicalId;
    /**
     * 功能ID
     */
    private String functionalId;
    /**
     * 响应ID
     */
    private String responseId;
    /**
     * ID类型
     */
    private String idType;
    /**
     * 网段名称
     */
    private String segmentName;
    /**
     * 控制器包中的文件集合
     */
    private List<FileResult> files;
    /**
     * 文件MD5值
     */
    private String md5;

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getZipName() {
        return zipName;
    }

    public void setZipName(String zipName) {
        this.zipName = zipName;
    }

    public List<FileResult> getFiles() {
        return files;
    }

    public void setFiles(List<FileResult> files) {
        this.files = files;
    }

    public String getZipId() {
        return zipId;
    }

    public void setZipId(String zipId) {
        this.zipId = zipId;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Long getZipSize() {
        return zipSize;
    }

    public void setZipSize(Long zipSize) {
        this.zipSize = zipSize;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public int getCalibration() {
        return calibration;
    }

    public void setCalibration(int calibration) {
        this.calibration = calibration;
    }

    public int getBrushWriteModel() {
        return brushWriteModel;
    }

    public void setBrushWriteModel(int brushWriteModel) {
        this.brushWriteModel = brushWriteModel;
    }

    public String getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(String baudRate) {
        this.baudRate = baudRate;
    }

    public String getPhysicalId() {
        return physicalId;
    }

    public void setPhysicalId(String physicalId) {
        this.physicalId = physicalId;
    }

    public String getFunctionalId() {
        return functionalId;
    }

    public void setFunctionalId(String functionalId) {
        this.functionalId = functionalId;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}

