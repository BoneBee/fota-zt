package com.intest.api.controller;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.service.LogPage;
import com.intest.service.impl.LoginLogImp;
import com.intest.service.impl.OperateLogImp;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhanghui
 * @create 2020-08-05 22:31
 */
@RestController
@Api(tags = "日志管理")
public class LogController {

    @Autowired
    LoginLogImp loginLogImp;

    @Autowired
    OperateLogImp operateLogImp;


    /**
     * 获取用户登陆日志列表
     *
     * @return
     */
    public PagerDataBaseVO getLoginLog() {
        return loginLogImp.getLoginLogTmpInfo(new LogPage());
    }

    /**
     * 获取用户操作日志列表
     *
     * @return
     */
    public PagerDataBaseVO getOperateLog() {
        return operateLogImp.getOperateLogTmpInfo(new LogPage());
    }
}
