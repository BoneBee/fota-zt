package com.intest.systemservice.request;

import java.util.List;

public class UpdateTaskReviewTmpRequest {
    private String taskTmpId;
    private String taskTmpName;
    private int tmpType;
    private int taskNum;
    private int state;
    private List<TaskUserBean> taskUserIds;

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
        private String taskDetileId;
        private String userId;
        private int level;

        public String getTaskDetileId() {
            return taskDetileId;
        }

        public void setTaskDetileId(String taskDetileId) {
            this.taskDetileId = taskDetileId;
        }

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
