package com.intest.service;

import com.intest.common.result.PagerDataBaseVO;

public interface OperateLogService {
    PagerDataBaseVO getOperateLogTmpInfo(LogPage model);
}
