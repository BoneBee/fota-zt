package com.intest.systemservice.impl.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.TaskReviewTmpBto;

import java.util.List;

public interface TaskReviewTmpService {
    TaskReviewTmpBto getTaskReviewTmpById(String taskreviewtmpId);

    TaskReviewTmpBto getTaskReviewTmpByName(String taskTmpName);

    List<TaskReviewTmpBto> getTaskReviewTmpByTmpType(int tmpType);

    int addTaskReviewTmp(TaskReviewTmpBto taskReviewTmpBto);

    int updateTaskReviewTmp(TaskReviewTmpBto taskReviewTmpBto);

    int deleteTaskReviewTmp(String taskreviewtmpId);

    PagerDataBaseVO getTaskReviewTmpInfo(SystemPage model);
}
