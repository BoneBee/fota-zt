package com.intest.systemservice.request;

import java.util.List;

public class AddTaskReviewTmpRequest {
    private String taskReviewtmpName;
    private int tmpType;
    private int taskNum;
    private int state;
    private List<TaskUserBean> taskUserIds;

    public String getTaskReviewtmpName() {
        return taskReviewtmpName;
    }

    public void setTaskReviewtmpName(String taskReviewtmpName) {
        this.taskReviewtmpName = taskReviewtmpName;
    }

    public int getTmpType() {
        return tmpType;
    }

    public void setTmpType(int tmpType) {
        this.tmpType = tmpType;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<TaskUserBean> getTaskUserIds() {
        return taskUserIds;
    }

    public void setTaskUserIds(List<TaskUserBean> taskUserIds) {
        this.taskUserIds = taskUserIds;
    }

    public static class TaskUserBean {
        private String userId;
        private int level;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }

}


