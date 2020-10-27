package com.intest.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.OperateLogBto;

public interface OperateLogService {
    OperateLogBto getOperateLogById(String operateLogId);

    int addOperateLog(OperateLogBto operateLogBto);

    int updateOperateLog(OperateLogBto operateLogBto);

    int deleteOperateLog(String operateLogId);

    PagerDataBaseVO getOperateLogTmpInfo(LogPage model);
}
