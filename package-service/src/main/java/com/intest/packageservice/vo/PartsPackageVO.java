package com.intest.packageservice.vo;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/31 9:59
 */
public class PartsPackageVO {
    /**
     * 零件包名称
     */
    private String partsPackageName;
    /**
     * 零件包大小
     */
    private Long partsPackageSize;
    /**
     * 零件简称
     */
    private String partsName;
    /**
     * 零件类型
     */
    private String partsTypeName;
    /**
     * 零件号
     */
    private String partsCode;
    /**
     * 零部版本
     */
    private String version;
    /**
     * 文件信息ID
     */
    private String fileId;
    /**
     * 序号
     */
    private int id;

    public String getPartsPackageName() {
        return partsPackageName;
    }

    public void setPartsPackageName(String partsPackageName) {
        this.partsPackageName = partsPackageName;
    }

    public Long getPartsPackageSize() {
        return partsPackageSize;
    }

    public void setPartsPackageSize(Long partsPackageSize) {
        this.partsPackageSize = partsPackageSize;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public String getPartsTypeName() {
        return partsTypeName;
    }

    public void setPartsTypeName(String partsTypeName) {
        this.partsTypeName = partsTypeName;
    }

    public String getPartsCode() {
        return partsCode;
    }

    public void setPartsCode(String partsCode) {
        this.partsCode = partsCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
