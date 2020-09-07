package com.intest.dao.entity;

/**
 * @author ：intest
 * @description：零件包详细信息实体
 * @date ：2020/8/11 17:18
 */
public class PartsPackageDetail {
    /**
     * 零件包详细信息ID
     */
    private String partsPackageDetailId;
    /**
     * 零件包ID
     */
    private String partsPackageId;
    /**
     * 文件ID
     */
    private String fileId;
    /**
     * 文件类型
     * 1-文件，2-文件等等，以此类推
     */
    private Integer fileType;
    /**
     * 软件序号
     */
    private Integer softwareNumber;
    /**
     * 创建人
     */
    private String createBy;

    public String getPartsPackageDetailId() {
        return partsPackageDetailId;
    }

    public void setPartsPackageDetailId(String partsPackageDetailId) {
        this.partsPackageDetailId = partsPackageDetailId;
    }

    public String getPartsPackageId() {
        return partsPackageId;
    }

    public void setPartsPackageId(String partsPackageId) {
        this.partsPackageId = partsPackageId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Integer getSoftwareNumber() {
        return softwareNumber;
    }

    public void setSoftwareNumber(Integer softwareNumber) {
        this.softwareNumber = softwareNumber;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
