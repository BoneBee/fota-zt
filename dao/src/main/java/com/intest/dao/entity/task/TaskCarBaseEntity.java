package com.intest.dao.entity.task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @作者:dl
 * @描述:车辆任务基类
 * @创建时间: 2020/9/9 15:25
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class TaskCarBaseEntity {

    public int index;
    /**
     * 任务Id
     */
    public String taskId;

    /**
     * 任务名称
     */
    public String taskName;

    /**
     * 任务策略值 0-标准升级；1-静默升级；2-强制升级；
     */
    public String taskStrategy;

    /**
     * 任务策略描述 0-标准升级；1-静默升级；2-强制升级；
     */
    public String taskStrategyName;


    /**
     * 任务状态cede
     */
    public String taskStatusValueCode;
    /**
     * 任务状态描述
     */
    public String taskStatusValueName;

    /**
     * 车辆任务Id
     */
    public String taskCarId;


    /**
     * vin
     */
    public String vin;

    /**
     * 升级时间
     */
    public String upgradeTime;


    /**
     * 车辆任务状态cede
     */
    public String taskCarStatusValueCode;
    /**
     * 车辆任务状态描述
     */
    public String taskCarStatusValueName;

    /**
     * 进度
     */
    public String progress;

    /**
     * 计划开始时间
     */
    public Date planStartTime;

    /**
     * 计划结束时间
     */
    public Date planEndTime;
    /**
     * 车型名称
     */
    public String carTypeName;
    /**
     * 描述
     */
    public String description;

    /**
     * 创建人
     */
    @JsonIgnore
    public String createBy;

    public TaskCarBaseEntity(){
        createBy="任务管理模块";
    }
}
