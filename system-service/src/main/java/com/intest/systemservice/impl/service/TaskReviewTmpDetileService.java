package com.intest.systemservice.impl.service;


import com.intest.dao.entity.TaskReviewTmpDetileBto;

public interface TaskReviewTmpDetileService {
    TaskReviewTmpDetileBto getTaskReviewTmpDetileById(String taskreviewtmpdetaileId);

    int addTaskReviewTmpDetile(TaskReviewTmpDetileBto taskReviewTmpDetileBto);

    int updateTaskReviewTmpDetile(TaskReviewTmpDetileBto taskReviewTmpDetileBto);

    int deleteTaskReviewTmpDetile(String taskreviewtmpdetaileId);

    int deleteTaskReviewTmpDetileById(String taskreviewtmpId);
}
