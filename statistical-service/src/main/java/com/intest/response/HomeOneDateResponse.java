package com.intest.response;

public class HomeOneDateResponse {
    private StatisticalBean statisticalDate;

    private TaskBean taskDate;

    private UpdatePackageBean updatePackageDate;

    public StatisticalBean getStatisticalDate() {
        return statisticalDate;
    }

    public void setStatisticalDate(StatisticalBean statisticalDate) {
        this.statisticalDate = statisticalDate;
    }

    public TaskBean getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(TaskBean taskDate) {
        this.taskDate = taskDate;
    }

    public UpdatePackageBean getUpdatePackageDate() {
        return updatePackageDate;
    }

    public void setUpdatePackageDate(UpdatePackageBean updatePackageDate) {
        this.updatePackageDate = updatePackageDate;
    }

    public static class UpdatePackageBean {
        private int updatePackageNum;
        private int diffPackageNum;
        private int fullPackageNUm;
        private int smartPackageNum;

        public int getUpdatePackageNum() {
            return updatePackageNum;
        }

        public void setUpdatePackageNum(int updatePackageNum) {
            this.updatePackageNum = updatePackageNum;
        }

        public int getDiffPackageNum() {
            return diffPackageNum;
        }

        public void setDiffPackageNum(int diffPackageNum) {
            this.diffPackageNum = diffPackageNum;
        }

        public int getFullPackageNUm() {
            return fullPackageNUm;
        }

        public void setFullPackageNUm(int fullPackageNUm) {
            this.fullPackageNUm = fullPackageNUm;
        }

        public int getSmartPackageNum() {
            return smartPackageNum;
        }

        public void setSmartPackageNum(int smartPackageNum) {
            this.smartPackageNum = smartPackageNum;
        }
    }

    public static class TaskBean {
        private int reviewNum;
        private int unPublishedNum;
        private int inNum;
        private int completedNum;
        private int taskClose;

        public int getReviewNum() {
            return reviewNum;
        }

        public void setReviewNum(int reviewNum) {
            this.reviewNum = reviewNum;
        }

        public int getUnPublishedNum() {
            return unPublishedNum;
        }

        public void setUnPublishedNum(int unPublishedNum) {
            this.unPublishedNum = unPublishedNum;
        }

        public int getInNum() {
            return inNum;
        }

        public void setInNum(int inNum) {
            this.inNum = inNum;
        }

        public int getCompletedNum() {
            return completedNum;
        }

        public void setCompletedNum(int completedNum) {
            this.completedNum = completedNum;
        }

        public int getTaskClose() {
            return taskClose;
        }

        public void setTaskClose(int taskClose) {
            this.taskClose = taskClose;
        }
    }


    public static class StatisticalBean {
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
}


