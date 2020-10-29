package com.intest.dao.entity.task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @作者:dl
 * @描述:任务审核
 * @创建时间: 2020/9/8 15:17
 * @修改人：
 * @修改内容：
 * @修改时间：
 */

public class ReviewTaskLogsEntity {

    /**
     * 审核记录ID
     */
    public String taskReviewLogsId;
    /**
     * 任务ID
     */
    public String taskId;

    /**
     * 审核模板ID
     */
    public String taskReviewTmpId;

    /**
     * 审核次数
     */
    public int taskNum;

    /**
     * 审核人ID
     */
    public String userId;
    /**
     * 审核人名称
     */
    public String userName;

    /**
     * 审核等级
     */
    public int reviewLevel;

    /**
     * 是否通过 0-通过，1-未通过
     */
    public int isAdopt;

    /**
     * 审核意见
     */
    public String remark;
    /**
     * 创建人
     */
    @JsonIgnore
    public String createBy;

    /**
     * 创建时间
     */
    @JsonIgnore
    public String createAt;


    public ReviewTaskLogsEntity(){
        createBy="任务管理模块";
    }

    public String getTaskReviewLogsId() {
        return taskReviewLogsId;
    }

    public void setTaskReviewLogsId(String taskReviewLogsId) {
        this.taskReviewLogsId = taskReviewLogsId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskReviewTmpId() {
        return taskReviewTmpId;
    }

    public void setTaskReviewTmpId(String taskReviewTmpId) {
        this.taskReviewTmpId = taskReviewTmpId;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getReviewLevel() {
        return reviewLevel;
    }

    public void setReviewLevel(int reviewLevel) {
        this.reviewLevel = reviewLevel;
    }

    public int getIsAdopt() {
        return isAdopt;
    }

    public void setIsAdopt(int isAdopt) {
        this.isAdopt = isAdopt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
