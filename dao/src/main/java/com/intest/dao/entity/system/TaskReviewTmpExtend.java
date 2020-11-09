package com.intest.dao.entity.system;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TaskReviewTmpExtend {
    private String taskTmpId;
    private String taskTmpName;
    private int tmpType;
    private int state;
    private Short taskNum;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createAt;
    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateAt;
    private String updateBy;
    private String detailID;
    private String userId;
    private String named;
    private String realName;
    private int levels;

    public String getTaskTmpId() {
        return taskTmpId;
    }

    public void setTaskTmpId(String taskTmpId) {
        this.taskTmpId = taskTmpId;
    }

    public String getTaskTmpName() {
        return taskTmpName;
    }

    public void setTaskTmpName(String taskTmpName) {
        this.taskTmpName = taskTmpName;
    }

    public int getTmpType() {
        return tmpType;
    }

    public void setTmpType(int tmpType) {
        this.tmpType = tmpType;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Short getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Short taskNum) {
        this.taskNum = taskNum;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDetailID() {
        return detailID;
    }

    public void setDetailID(String detailID) {
        this.detailID = detailID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }
}
