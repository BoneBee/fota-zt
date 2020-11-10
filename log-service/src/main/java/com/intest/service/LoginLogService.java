package com.intest.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.LoginLogBto;

public interface LoginLogService {

    PagerDataBaseVO getLoginLogTmpInfo(LogPage model);
}
