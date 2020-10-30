package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.TaskBto;
import com.intest.dao.entity.TaskCarBto;
import com.intest.dao.entity.TaskCarStatusLogBto;
import com.intest.dao.mapper.TaskBtoMapper;
import com.intest.dao.mapper.TaskCarBtoMapper;
import com.intest.dao.mapper.TaskCarStatusLogBtoMapper;
import com.intest.response.TaskCarStatusLogResponse;
import com.intest.service.LogPage;
import com.intest.service.TaskCarStatusLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@TableDataAnnotation
public class TaskCarStatusLogImp implements TaskCarStatusLogService {
    @Autowired
    TaskCarStatusLogBtoMapper mapper;

    @Autowired
    TaskCarBtoMapper taskCarBtoMapper;

    @Autowired
    TaskBtoMapper taskBtoMapper;

    @Override
    @TableDataAnnotation(tableId = "66cee6d0-3813-4212-8ff7-6b22343de379")
    public PagerDataBaseVO getTaskCarStatusLogTmpInfo(LogPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<TaskCarStatusLogBto> taskCarStatusLogBtos = mapper.selectByExample(null);
        List<TaskCarStatusLogResponse> responses = new ArrayList<>();
        PageInfo<TaskCarStatusLogBto> pageInfo = new PageInfo<>(taskCarStatusLogBtos);
        int index = pageInfo.getStartRow() - 1;
        for (TaskCarStatusLogBto taskCarStatusLogBto : taskCarStatusLogBtos) {
            TaskCarBto taskCarBto = taskCarBtoMapper.selectByPrimaryKey(taskCarStatusLogBto.getFkTaskcarId());
            TaskBto taskBto = taskBtoMapper.selectByPrimaryKey(taskCarBto.getFkTaskId());
            TaskCarStatusLogResponse taskCarStatusLogResponse = new TaskCarStatusLogResponse();
            taskCarStatusLogResponse.setIndex(index += 1);
            taskCarStatusLogResponse.setUpdateLog(taskCarStatusLogBto.getNote());
            taskCarStatusLogResponse.setVin(taskCarBto.getVin());
            taskCarStatusLogResponse.setCreatTime(taskCarStatusLogBto.getCreateat());
            taskCarStatusLogResponse.setTaskName(taskBto.getTaskname());
            responses.add(taskCarStatusLogResponse);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(responses);
        return type;
    }
}
