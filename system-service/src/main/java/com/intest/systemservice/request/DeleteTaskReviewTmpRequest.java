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
        private String taskReviewtmpId;
        private List<DeleteTaskIdBean> deleteDate;

        public String getTaskReviewtmpId() {
            return taskReviewtmpId;
        }

        public void setTaskReviewtmpId(String taskReviewtmpId) {
            this.taskReviewtmpId = taskReviewtmpId;
        }

        public List<DeleteTaskIdBean> getDeleteDate() {
            return deleteDate;
        }

        public void setDeleteDate(List<DeleteTaskIdBean> deleteDate) {
            this.deleteDate = deleteDate;
        }
    }

    public static class DeleteTaskIdBean {
        private String taskReviewTmpDetileId;

        public String getTaskReviewTmpDetileId() {
            return taskReviewTmpDetileId;
        }

        public void setTaskReviewTmpDetileId(String taskReviewTmpDetileId) {
            this.taskReviewTmpDetileId = taskReviewTmpDetileId;
        }
    }
}
