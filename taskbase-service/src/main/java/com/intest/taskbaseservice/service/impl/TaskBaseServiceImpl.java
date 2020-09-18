package com.intest.taskbaseservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.task.TaskBaseEntity;
import com.intest.dao.entity.task.TaskCarInfoNumsEntity;
import com.intest.dao.mapper.TaskMapper;
import com.intest.taskbaseservice.service.TaskBaseService;
import com.intest.taskbaseservice.service.entity.TaskReqParaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


/**
 * @作者:dl
 * @描述:任务管理模块
 * @创建时间: 2020/9/8 15:39
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Service
@TableDataAnnotation
public class TaskBaseServiceImpl implements TaskBaseService {

    @Autowired
    TaskMapper taskMapper;

    /**
     * 任务列表
     */
    @Override
    @TableDataAnnotation(tableId = "46a780be-ac16-4634-80ae-a40d9b101575")
    public PagerDataBaseVO getTaskLst(TaskReqParaEntity taskParaEntity) {

        PagerDataBaseVO type = new PagerDataBaseVO();

        PageHelper.startPage(taskParaEntity.getPi(), taskParaEntity.getPs());

        List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();

        for (TaskBaseEntity item:taskLst){
            //获取任务车辆数量
            TaskCarInfoNumsEntity taskCarInfoNumsEntity=taskMapper.selectTaskCarNum(item.getTaskId());

            item.setCarCountNum(taskCarInfoNumsEntity.getCarTotalNum());
        }

        PageInfo<TaskBaseEntity> pageInfo = new PageInfo<>(taskLst);
        int index = pageInfo.getStartRow() - 1;

        for (TaskBaseEntity item : taskLst) {
            item.setIndex(index+=1);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(taskLst);
        return type;

    }
}
