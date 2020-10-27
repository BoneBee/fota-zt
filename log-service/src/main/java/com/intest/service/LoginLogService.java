package com.intest.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.LoginLogBto;

public interface LoginLogService {
    LoginLogBto getLoginLogById(String loginLogId);

    int addLoginLog(LoginLogBto loginLogBto);

    int updateLoginLog(LoginLogBto loginLogBto);

    int deleteLoginLog(String loginLogId);

    PagerDataBaseVO getLoginLogTmpInfo(LogPage model);
}
