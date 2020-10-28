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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStrategy() {
        return taskStrategy;
    }

    public void setTaskStrategy(String taskStrategy) {
        this.taskStrategy = taskStrategy;
    }

    public String getTaskStrategyName() {
        return taskStrategyName;
    }

    public void setTaskStrategyName(String taskStrategyName) {
        this.taskStrategyName = taskStrategyName;
    }

    public String getTaskStatusValueCode() {
        return taskStatusValueCode;
    }

    public void setTaskStatusValueCode(String taskStatusValueCode) {
        this.taskStatusValueCode = taskStatusValueCode;
    }

    public String getTaskStatusValueName() {
        return taskStatusValueName;
    }

    public void setTaskStatusValueName(String taskStatusValueName) {
        this.taskStatusValueName = taskStatusValueName;
    }

    public String getTaskCarId() {
        return taskCarId;
    }

    public void setTaskCarId(String taskCarId) {
        this.taskCarId = taskCarId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    public String getTaskCarStatusValueCode() {
        return taskCarStatusValueCode;
    }

    public void setTaskCarStatusValueCode(String taskCarStatusValueCode) {
        this.taskCarStatusValueCode = taskCarStatusValueCode;
    }

    public String getTaskCarStatusValueName() {
        return taskCarStatusValueName;
    }

    public void setTaskCarStatusValueName(String taskCarStatusValueName) {
        this.taskCarStatusValueName = taskCarStatusValueName;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public Date getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(Date planEndTime) {
        this.planEndTime = planEndTime;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
