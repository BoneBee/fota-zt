package com.intest.dao.entity.task;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @作者:dl
 * @描述:车辆升级日志实体
 * @创建时间: 2020/9/8 15:17
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class TaskCarLogsEntity {

    /**
     * 车辆升级日志ID
     */
    public String taskCarStatusLogId;
    /**
     * 车辆升级任务ID
     */
    public String taskCarId;

    /**
     * 状态Code
     */
    public String taskCarStatusValueCode;

    /**
     * 状态描述
     */
    public String taskCarStatusValueName;

    /**
     * 备注描述
     */
    public String note;
    /**
     * 终端上报时间
     */
    public Date tupLoadAt;

    /**
     * 平台API接口日志ID
     */
    public String platformApiLogId;

    /**
     * 时间
     */
    public Date createAt;
    /**
     * 车型名称
     */
    public String carTypeName;

    /**
     * 车辆VIN
     */
    public String vin;

    /**
     * 任务名称
     */
    public String  taskName;
}
