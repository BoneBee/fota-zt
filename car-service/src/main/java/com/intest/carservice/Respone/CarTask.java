package com.intest.carservice.Respone;

public class CarTask {

    private String taskName;
    private String checkStatus;
    private String executeStatus;
    private int exTask;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
    }

    public int getExTask() {
        return exTask;
    }

    public void setExTask(int exTask) {
        this.exTask = exTask;
    }
}
