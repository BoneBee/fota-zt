package com.intest.dao.entity;

import lombok.Data;

/**
 * @author ：intest
 * @description：升级包信息实体
 * @date ：2020/8/12 9:33
 */
@Data
public class UpgradePackage {
    /**
     * 升级包制作任务ID
     */
    private String packageTaskId;
    /**
     * 升级包名称
     */
    private String packageName;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 升级包类型
     */
    private Integer packageType;
    /**
     * 升级包大小
     */
    private Float packageSize;
    /**
     * 制作状态
     */
    private Integer packageStatus;
    /**
     * 发布状态
     */
    private Integer publishStatus;
    /**
     * 开始制作时间
     */
    private String createAt;
    /**
     * 制作人
     */
    private String createBy;
    /**
     * 文件ID
     */
    private String fileId;
}
