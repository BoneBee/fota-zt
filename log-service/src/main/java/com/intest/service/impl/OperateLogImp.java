package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.OperateLogBtoMapper;
import com.intest.dao.mapper.RoleBtoMapper;
import com.intest.dao.mapper.UserBtoMapper;
import com.intest.dao.mapper.UserRoleBtoMapper;
import com.intest.response.OperateLogResponse;
import com.intest.service.LogPage;
import com.intest.service.OperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@TableDataAnnotation
public class OperateLogImp implements OperateLogService {

    @Autowired
    OperateLogBtoMapper mapper;

    @Autowired
    UserBtoMapper userBtoMapper;

    @Autowired
    UserRoleBtoMapper userRoleBtoMapper;

    @Autowired
    RoleBtoMapper roleBtoMapper;

    @Override
    public OperateLogBto getOperateLogById(String operateLogId) {
        return mapper.selectByPrimaryKey(operateLogId);
    }

    @Override
    public int addOperateLog(OperateLogBto operateLogBto) {
        return mapper.insert(operateLogBto);
    }

    @Override
    public int updateOperateLog(OperateLogBto operateLogBto) {
        return mapper.updateByPrimaryKey(operateLogBto);
    }

    @Override
    public int deleteOperateLog(String operateLogId) {
        return mapper.deleteByPrimaryKey(operateLogId);
    }

    @Override
    @TableDataAnnotation(tableId = "dc288acb-9250-47c3-a8f9-542f9bb6dfa8")
    public PagerDataBaseVO getOperateLogTmpInfo(LogPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<OperateLogBto> operateLogBtos = mapper.selectByExample(null);
        List<OperateLogResponse> operateLogResponses = new ArrayList<>();
        PageInfo<OperateLogBto> pageInfo = new PageInfo<OperateLogBto>(operateLogBtos);
        int index = pageInfo.getStartRow() - 1;
        for (OperateLogBto operateLogBto : operateLogBtos) {
            UserBto userBto = userBtoMapper.selectByPrimaryKey(operateLogBto.getFkUserId());
            UserRoleBtoExample example = new UserRoleBtoExample();
            UserRoleBtoExample.Criteria criteria = example.createCriteria();
            criteria.andFkUserIdEqualTo(userBto.getUserId());
            List<UserRoleBto> userRoleBtos = userRoleBtoMapper.selectByExample(example);
            RoleBto roleBto = roleBtoMapper.selectByPrimaryKey(userRoleBtos.get(0).getFkRoleId());
            OperateLogResponse operateLogResponse = new OperateLogResponse();
            operateLogResponse.setIndex(index += 1);
            operateLogResponse.setLoginName(userBto.getLoginName());
            operateLogResponse.setRealName(userBto.getRealName());
            operateLogResponse.setRoleName(roleBto.getRoleName());
            operateLogResponse.setActionModel(operateLogBto.getOperateMode());
            operateLogResponse.setActioning(operateLogBto.getOperateAction());
            operateLogResponse.setActionTime(operateLogBto.getCreateat());
            operateLogResponse.setBrowser(operateLogBto.getBrowser());
            operateLogResponses.add(operateLogResponse);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(operateLogResponses);
        return type;
    }
}
