package com.intest.dao.entity.task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @作者:dl
 * @描述:任务基类
 * @创建时间: 2020/9/8 15:17
 * @修改人：
 * @修改内容：
 * @修改时间：
 */

public class TaskBaseEntity {
    /**
     * 序号
     */
    public int index;
    /**
     * 任务ID
     */
    public String taskId;

    /**
     * 任务名称
     */
    public String taskName;

    /**
     * 升级时间
     */
    public String upgradeTime;

    /**
     * 计划开始时间
     */
    public Date planStartTime;

    /**
     * 计划结束时间
     */
    public Date planEndTime;

    /**
     * 任务描述
     */
    public String taskNote;

    /**
     * 任务策略 0-标准升级；1-静默升级；2-强制升级；
     */
    public Short taskStrategy;

    /**
     * 任务策略描述 0-标准升级；1-静默升级；2-强制升级；
     */
    public String  taskStrategyName;

    /**
     * 任务状态cede
     */
    public String taskStatusValueCode;
    /**
     * 任务状态描述
     */
    public String taskStatusValueName;

    /**
     * 升级包ID
     */
    public String packageTaskId;

    /**
     * 车型ID
     */
    public String carTypeId;

    /**
     * 车型名称
     */
    public String carTypeName;

    /**
     * 创建时间
     */
    public Date createAt;

    /**
     * 创建人
     */
    public String createBy;

    /**
     * 任务审批状态 FK_TASKREVIEWSTATUSVALUE_CODE
     */
    public String taskReviewStatusValueCode;


    /**
     * 任务审批状态 FK_TASKREVIEWSTATUSVALUE_CODE
     */
    public String taskReviewStatusValueName;

    /**
     * 任务审批流程ID FK_TASKREVIEWTMP_ID
     */
    public String taskReviewTmpId;

    /**
     * 审核等级code
     */
    public String reviewLevelCode;
    /**
     * 审核等级
     */
    public String reviewLevel;
    /**
     * 任务发布时间
     */
    public Date taskUpTime;
    /**
     * 发布人
     */
    public String taskUpBy;
    /**
     * 任务关闭时间
     */
    public Date taskCloseTime;
    /**
     * 任务关闭人
     */
    public String taskCloseBy;
    /**
     * 任务车辆列表
     */
    public List<TaskCarBaseEntity> vinLst;
    /**
     * 终端型号
     */
    public String terminalName;

    /**
     * 任务车辆数量
     */
    public TaskCarInfoNumsEntity taskCars;
    /**
     * 审核人用户ID
     */
    public String reviewUserId;
    /**
     * 审核人账户
     */
    public String reviewLoginName;
    /**
     * 审核人姓名
     */
    public String reviewRealName;

    /**
     * 任务车辆总数（任务列表使用）
     */
    public int carCountNum;

    public TaskBaseEntity(){
        vinLst=new ArrayList<>();
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

    public String getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
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

    public String getTaskNote() {
        return taskNote;
    }

    public void setTaskNote(String taskNote) {
        this.taskNote = taskNote;
    }

    public Short getTaskStrategy() {
        return taskStrategy;
    }

    public void setTaskStrategy(Short taskStrategy) {
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

    public String getPackageTaskId() {
        return packageTaskId;
    }

    public void setPackageTaskId(String packageTaskId) {
        this.packageTaskId = packageTaskId;
    }

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getTaskReviewStatusValueCode() {
        return taskReviewStatusValueCode;
    }

    public void setTaskReviewStatusValueCode(String taskReviewStatusValueCode) {
        this.taskReviewStatusValueCode = taskReviewStatusValueCode;
    }

    public String getTaskReviewStatusValueName() {
        return taskReviewStatusValueName;
    }

    public void setTaskReviewStatusValueName(String taskReviewStatusValueName) {
        this.taskReviewStatusValueName = taskReviewStatusValueName;
    }

    public String getTaskReviewTmpId() {
        return taskReviewTmpId;
    }

    public void setTaskReviewTmpId(String taskReviewTmpId) {
        this.taskReviewTmpId = taskReviewTmpId;
    }

    public String getReviewLevelCode() {
        return reviewLevelCode;
    }

    public void setReviewLevelCode(String reviewLevelCode) {
        this.reviewLevelCode = reviewLevelCode;
    }

    public String getReviewLevel() {
        return reviewLevel;
    }

    public void setReviewLevel(String reviewLevel) {
        this.reviewLevel = reviewLevel;
    }

    public Date getTaskUpTime() {
        return taskUpTime;
    }

    public void setTaskUpTime(Date taskUpTime) {
        this.taskUpTime = taskUpTime;
    }

    public String getTaskUpBy() {
        return taskUpBy;
    }

    public void setTaskUpBy(String taskUpBy) {
        this.taskUpBy = taskUpBy;
    }

    public Date getTaskCloseTime() {
        return taskCloseTime;
    }

    public void setTaskCloseTime(Date taskCloseTime) {
        this.taskCloseTime = taskCloseTime;
    }

    public String getTaskCloseBy() {
        return taskCloseBy;
    }

    public void setTaskCloseBy(String taskCloseBy) {
        this.taskCloseBy = taskCloseBy;
    }

    public List<TaskCarBaseEntity> getVinLst() {
        return vinLst;
    }

    public void setVinLst(List<TaskCarBaseEntity> vinLst) {
        this.vinLst = vinLst;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public TaskCarInfoNumsEntity getTaskCars() {
        return taskCars;
    }

    public void setTaskCars(TaskCarInfoNumsEntity taskCars) {
        this.taskCars = taskCars;
    }

    public String getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(String reviewUserId) {
        this.reviewUserId = reviewUserId;
    }

    public String getReviewLoginName() {
        return reviewLoginName;
    }

    public void setReviewLoginName(String reviewLoginName) {
        this.reviewLoginName = reviewLoginName;
    }

    public String getReviewRealName() {
        return reviewRealName;
    }

    public void setReviewRealName(String reviewRealName) {
        this.reviewRealName = reviewRealName;
    }

    public int getCarCountNum() {
        return carCountNum;
    }

    public void setCarCountNum(int carCountNum) {
        this.carCountNum = carCountNum;
    }
}
