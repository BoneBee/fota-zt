package com.intest.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.task.TaskBaseEntity;

import java.util.List;

public interface StatisticalAnalysisService {
    List<TaskBaseEntity> getTaskList();

    PagerDataBaseVO getStatisticalAnalysisTmpInfo(StatisticalAnalysisPage model);

    PagerDataBaseVO getCarAnalysisTmpInfo(StatisticalAnalysisPage model);
}
