package com.intest.systemservice.impl.service;


import com.intest.common.exception.ResponseBean;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.UserBto;
import com.intest.systemservice.request.AddTaskReviewTmpRequest;
import com.intest.systemservice.request.DeleteTaskReviewTmpRequest;
import com.intest.systemservice.request.UpdateTaskReviewTmpRequest;
import com.intest.systemservice.response.TaskUserResopnse;

import java.util.List;

public interface TaskReviewTmpService {

    ResponseBean addTaskReviewTmp(AddTaskReviewTmpRequest request, UserBto userBto);

    ResponseBean updateTaskReviewTmp(UpdateTaskReviewTmpRequest request, UserBto userBto);

    ResponseBean deleteTaskReviewTmps(DeleteTaskReviewTmpRequest request);

    PagerDataBaseVO getTaskReviewTmpInfo(SystemPage model);

    ResponseBean updateTaskReviewTmpState(String id, int state);

    ResponseBean selectTaskTmpName(String taskTmpName, String taskTmpId);

    List<TaskUserResopnse> getTaskUserList();
}
