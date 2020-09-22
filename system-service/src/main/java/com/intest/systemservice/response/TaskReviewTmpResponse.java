package com.intest.systemservice.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class TaskReviewTmpResponse {
    private int index;
    private String taskTmpId;
    private List<DetailBean> detaileIDs;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTaskTmpId() {
        return taskTmpId;
    }

    public void setTaskTmpId(String taskTmpId) {
        this.taskTmpId = taskTmpId;
    }

    public List<DetailBean> getDetaileIDs() {
        return detaileIDs;
    }

    public void setDetaileIDs(List<DetailBean> detaileIDs) {
        this.detaileIDs = detaileIDs;
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

    public static class DetailBean {
        private String id;
        private String userId;
        private String name;
        private String realName;
        private int level;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
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
