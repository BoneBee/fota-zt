package com.intest.systemservice.request;

import java.util.List;

public class DeleteTaskReviewTmpRequest {
    private List<DeleteTaskReviewTmpIdBean> deleteDates;

    public List<DeleteTaskReviewTmpIdBean> getDeleteDates() {
        return deleteDates;
    }

    public void setDeleteDates(List<DeleteTaskReviewTmpIdBean> deleteDates) {
        this.deleteDates = deleteDates;
    }

    public static class DeleteTaskReviewTmpIdBean{
        private String taskTmpId;
        private List<DeleteTaskIdBean> deleteMessage;

        public String getTaskTmpId() {
            return taskTmpId;
        }

        public void setTaskTmpId(String taskTmpId) {
            this.taskTmpId = taskTmpId;
        }

        public List<DeleteTaskIdBean> getDeleteMessage() {
            return deleteMessage;
        }

        public void setDeleteMessage(List<DeleteTaskIdBean> deleteMessage) {
            this.deleteMessage = deleteMessage;
        }
    }

    public static class DeleteTaskIdBean {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
