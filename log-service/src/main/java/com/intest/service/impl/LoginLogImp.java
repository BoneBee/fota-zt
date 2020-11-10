package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.log.LoginLogListExtend;
import com.intest.dao.mapper.*;
import com.intest.service.LogPage;
import com.intest.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@TableDataAnnotation
public class LoginLogImp implements LoginLogService {

    @Autowired
    LoginExtendMapper loginExtendMapper;

    @Override
    @TableDataAnnotation(tableId = "cb8eece0-12ca-4091-8065-e7464bebec60")
    public PagerDataBaseVO getLoginLogTmpInfo(LogPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<LoginLogListExtend> logListExtends = loginExtendMapper.getLoginLogList();
        PageInfo<LoginLogListExtend> pageInfo = new PageInfo<>(logListExtends);
        int index = pageInfo.getStartRow() - 1;
        for (LoginLogListExtend loginLogListExtend : logListExtends) {
            loginLogListExtend.setIndex(index += 1);
        }

        type.setTotal(pageInfo.getTotal());
        type.setData(logListExtends);
        return type;
    }


}
