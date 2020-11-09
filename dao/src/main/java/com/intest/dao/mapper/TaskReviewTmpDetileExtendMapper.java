package com.intest.dao.mapper;

import com.intest.dao.entity.TaskReviewTmpDetileBto;
import com.intest.dao.entity.TaskReviewTmpDetileBtoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskReviewTmpDetileExtendMapper {

    void insertTaskReviewTmpDetile(List<TaskReviewTmpDetileBto> taskReviewTmpDetileBtos);

    void deleteTaskReviewTmpDetile(List<String> ids);

}