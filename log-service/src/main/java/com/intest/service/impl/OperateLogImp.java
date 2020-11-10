package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.log.OperateLogListExtend;
import com.intest.dao.mapper.*;
import com.intest.service.LogPage;
import com.intest.service.OperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@TableDataAnnotation
public class OperateLogImp implements OperateLogService {


    @Autowired
    OperateLogExtendMapper operateLogExtendMapper;


    @Override
    @TableDataAnnotation(tableId = "dc288acb-9250-47c3-a8f9-542f9bb6dfa8")
    public PagerDataBaseVO getOperateLogTmpInfo(LogPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<OperateLogListExtend> operateLogBtos = operateLogExtendMapper.getOperateLogList();
        PageInfo<OperateLogListExtend> pageInfo = new PageInfo<>(operateLogBtos);
        int index = pageInfo.getStartRow() - 1;
        for (OperateLogListExtend extend : operateLogBtos) {
            extend.setIndex(index += 1);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(operateLogBtos);
        return type;
    }
}
