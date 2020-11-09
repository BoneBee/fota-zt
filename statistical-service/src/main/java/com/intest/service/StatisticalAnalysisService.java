package com.intest.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.statisticalAnalysis.TimeRequest;
import com.intest.dao.entity.task.TaskBaseEntity;
import com.intest.request.CarUpdateFindRequest;
import com.intest.response.CarErroDateResponse;
import com.intest.response.CarMenuDateResponse;
import com.intest.response.HomeDateResponse;
import com.intest.response.HomeStatisticalResponse;

import java.util.List;

public interface StatisticalAnalysisService {

    HomeStatisticalResponse getHomeOneDate();

    List<HomeDateResponse> getHomeTaskDate();

    List<HomeDateResponse> getHomeUpdatePackageDate();

    PagerDataBaseVO getCarUpdateDate(TimeRequest request);

    List<CarErroDateResponse> getCarErroDate(TimeRequest request);

    List<TaskBaseEntity> getTaskList(TimeRequest request);

    PagerDataBaseVO getCarUpdateFindList(StatisticalAnalysisPage model, CarUpdateFindRequest request);

    CarMenuDateResponse getCarStatisticalAnalysisDate(TimeRequest request);

    PagerDataBaseVO getStatisticalAnalysisTmpInfo(StatisticalAnalysisPage model, TimeRequest request);

    PagerDataBaseVO getCarAnalysisTmpInfo(StatisticalAnalysisPage model, TimeRequest request);

    PagerDataBaseVO getVersionAnalysisTmpInfo(StatisticalAnalysisPage model);

    PagerDataBaseVO getPartsUpdateAnalysisTmpInfo(StatisticalAnalysisPage model);

    PagerDataBaseVO getErroMessageTmpInfo(StatisticalAnalysisPage model);
}
