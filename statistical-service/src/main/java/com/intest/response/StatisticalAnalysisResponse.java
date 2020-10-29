package com.intest.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class StatisticalAnalysisResponse {
    private int index;//序号
    private String taskName;//任务名称
    private String carTypeName;//车型名称
    private int taskStrategy;//升级模式
    private String taskStatusValueName;//执行状态
    private int carNum;//车辆数量
    private int updateNum;//升级中数量
    private int successNum;//已完成数量
    private int erroNum;//升级失败数量
    private int cancleNum;//取消升级数量
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatAy;//任务创建时间

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public int getTaskStrategy() {
        return taskStrategy;
    }

    public void setTaskStrategy(int taskStrategy) {
        this.taskStrategy = taskStrategy;
    }

    public String getTaskStatusValueName() {
        return taskStatusValueName;
    }

    public void setTaskStatusValueName(String taskStatusValueName) {
        this.taskStatusValueName = taskStatusValueName;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public int getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(int updateNum) {
        this.updateNum = updateNum;
    }

    public int getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(int successNum) {
        this.successNum = successNum;
    }

    public int getErroNum() {
        return erroNum;
    }

    public void setErroNum(int erroNum) {
        this.erroNum = erroNum;
    }

    public int getCancleNum() {
        return cancleNum;
    }

    public void setCancleNum(int cancleNum) {
        this.cancleNum = cancleNum;
    }

    public Date getCreatAy() {
        return creatAy;
    }

    public void setCreatAy(Date creatAy) {
        this.creatAy = creatAy;
    }
}
