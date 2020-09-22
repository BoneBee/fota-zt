package com.intest.systemservice.impl.service.impl;

import com.intest.dao.entity.TaskReviewTmpDetileBto;
import com.intest.dao.entity.TaskReviewTmpDetileBtoExample;
import com.intest.dao.mapper.TaskReviewTmpDetileBtoMapper;
import com.intest.systemservice.impl.service.TaskReviewTmpDetileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskReviewTmpDetileImpl implements TaskReviewTmpDetileService {

    @Autowired
    TaskReviewTmpDetileBtoMapper mapper;

    @Override
    public TaskReviewTmpDetileBto getTaskReviewTmpDetileById(String taskreviewtmpdetaileId) {
        return mapper.selectByPrimaryKey(taskreviewtmpdetaileId);
    }

    @Override
    public int addTaskReviewTmpDetile(TaskReviewTmpDetileBto taskReviewTmpDetileBto) {
        return mapper.insert(taskReviewTmpDetileBto);
    }

    @Override
    public int updateTaskReviewTmpDetile(TaskReviewTmpDetileBto taskReviewTmpDetileBto) {
        return mapper.updateByPrimaryKey(taskReviewTmpDetileBto);
    }

    @Override
    public int deleteTaskReviewTmpDetile(String taskreviewtmpdetaileId) {
        return mapper.deleteByPrimaryKey(taskreviewtmpdetaileId);
    }

    @Override
    public int deleteTaskReviewTmpDetileById(String taskreviewtmpId) {
        TaskReviewTmpDetileBtoExample taskReviewTmpDetileBtoExample = new TaskReviewTmpDetileBtoExample();
        TaskReviewTmpDetileBtoExample.Criteria criteria = taskReviewTmpDetileBtoExample.createCriteria();
        criteria.andFkTaskreviewtmpIdEqualTo(taskreviewtmpId);
        return mapper.deleteByExample(taskReviewTmpDetileBtoExample);
    }
}
