package com.intest.systemservice.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class TaskReviewTmpResponse {
    private int index;
    private String taskreviewtmpId;
    private List<DetailBean> detaileIDs;
    private String taskReviewtmpName;
    private int tmpType;
    private int state;
    private Short tasknum;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createat;
    private String createby;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateat;
    private String updateby;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTaskreviewtmpId() {
        return taskreviewtmpId;
    }

    public void setTaskreviewtmpId(String taskreviewtmpId) {
        this.taskreviewtmpId = taskreviewtmpId;
    }

    public List<DetailBean> getDetaileIDs() {
        return detaileIDs;
    }

    public void setDetaileIDs(List<DetailBean> detaileIDs) {
        this.detaileIDs = detaileIDs;
    }

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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Short getTasknum() {
        return tasknum;
    }

    public void setTasknum(Short tasknum) {
        this.tasknum = tasknum;
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public static class DetailBean {
        private String ids;
        private int level;

        public String getIds() {
            return ids;
        }

        public void setIds(String ids) {
            this.ids = ids;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
}
