package com.intest.response;

public class HomeStatisticalResponse {
    private int carNum;
    private int updateCarNum;
    private int taskNum;
    private String success;

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public int getUpdateCarNum() {
        return updateCarNum;
    }

    public void setUpdateCarNum(int updateCarNum) {
        this.updateCarNum = updateCarNum;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
