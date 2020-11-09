package com.intest.dao.mapper;

import com.intest.dao.entity.system.TaskReviewTmpExtend;

import java.util.List;

public interface TaskReviewTmpExtendMapper {

    void deleteTaskReviewTmp(List<String> ids);

    List<TaskReviewTmpExtend> getTaskReviewTmpInfo();

}