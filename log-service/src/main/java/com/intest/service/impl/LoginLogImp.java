package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.LoginLogBtoMapper;
import com.intest.dao.mapper.RoleBtoMapper;
import com.intest.dao.mapper.UserBtoMapper;
import com.intest.dao.mapper.UserRoleBtoMapper;
import com.intest.response.LoginLogResponse;
import com.intest.service.LogPage;
import com.intest.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@TableDataAnnotation
public class LoginLogImp implements LoginLogService {

    @Autowired
    LoginLogBtoMapper mapper;

    @Autowired
    UserBtoMapper userBtoMapper;

    @Autowired
    UserRoleBtoMapper userRoleBtoMapper;

    @Autowired
    RoleBtoMapper roleBtoMapper;

    @Override
    public LoginLogBto getLoginLogById(String loginLogId) {
        return mapper.selectByPrimaryKey(loginLogId);
    }

    @Override
    public int addLoginLog(LoginLogBto loginLogBto) {
        return mapper.insert(loginLogBto);
    }

    @Override
    public int updateLoginLog(LoginLogBto loginLogBto) {
        return mapper.updateByPrimaryKey(loginLogBto);
    }

    @Override
    public int deleteLoginLog(String loginLogId) {
        return mapper.deleteByPrimaryKey(loginLogId);
    }

    @Override
    @TableDataAnnotation(tableId = "cb8eece0-12ca-4091-8065-e7464bebec60")
    public PagerDataBaseVO getLoginLogTmpInfo(LogPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<LoginLogBto> loginLogBtos = mapper.selectByExample(null);
        List<LoginLogResponse> loginLogResponses = new ArrayList<>();
        PageInfo<LoginLogBto> pageInfo = new PageInfo<LoginLogBto>(loginLogBtos);
        int index = pageInfo.getStartRow() - 1;
        for (LoginLogBto loginLogBto : loginLogBtos) {
            UserBto userBto = userBtoMapper.selectByPrimaryKey(loginLogBto.getFkUserId());
            UserRoleBtoExample example = new UserRoleBtoExample();
            UserRoleBtoExample.Criteria criteria = example.createCriteria();
            criteria.andFkUserIdEqualTo(userBto.getUserId());
            List<UserRoleBto> userRoleBtos = userRoleBtoMapper.selectByExample(example);
            RoleBto roleBto = roleBtoMapper.selectByPrimaryKey(userRoleBtos.get(0).getFkRoleId());
            LoginLogResponse loginLogResponse = new LoginLogResponse();
            loginLogResponse.setIndex(index += 1);
            loginLogResponse.setLoginName(userBto.getLoginName());
            loginLogResponse.setRealName(userBto.getRealName());
            loginLogResponse.setRoleName(roleBto.getRoleName());
            loginLogResponse.setLoginTime(loginLogBto.getCreateat());
            loginLogResponse.setLoginResult(loginLogBto.getLoginResult());
            loginLogResponse.setLoginIp(loginLogBto.getLoginIp());
            loginLogResponse.setBrowser(loginLogBto.getBrowser());
            loginLogResponse.setRemak(loginLogBto.getNote());
            loginLogResponses.add(loginLogResponse);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(loginLogResponses);
        return type;
    }


}
