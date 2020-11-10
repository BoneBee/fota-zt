package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.TaskBto;
import com.intest.dao.entity.TaskCarBto;
import com.intest.dao.entity.TaskCarStatusLogBto;
import com.intest.dao.entity.log.TaskCarStatusLogListExtend;
import com.intest.dao.mapper.TaskBtoMapper;
import com.intest.dao.mapper.TaskCarBtoMapper;
import com.intest.dao.mapper.TaskCarStatusExtendBtoMapper;
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
    TaskCarStatusExtendBtoMapper taskCarStatusExtendBtoMapper;

    @Override
    @TableDataAnnotation(tableId = "66cee6d0-3813-4212-8ff7-6b22343de379")
    public PagerDataBaseVO getTaskCarStatusLogTmpInfo(LogPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<TaskCarStatusLogListExtend> taskCarStatusLogBtos = taskCarStatusExtendBtoMapper.getTaskCarStatusLogList();
        PageInfo<TaskCarStatusLogListExtend> pageInfo = new PageInfo<>(taskCarStatusLogBtos);
        int index = pageInfo.getStartRow() - 1;
        for (TaskCarStatusLogListExtend taskCarStatusLogBto : taskCarStatusLogBtos) {
            taskCarStatusLogBto.setIndex(index += 1);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(taskCarStatusLogBtos);
        return type;
    }
}
