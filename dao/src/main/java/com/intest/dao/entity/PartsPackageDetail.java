package com.intest.dao.entity;

import lombok.Data;

/**
 * @author ：intest
 * @description：零件包详细信息实体
 * @date ：2020/8/11 17:18
 */
@Data
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
}
