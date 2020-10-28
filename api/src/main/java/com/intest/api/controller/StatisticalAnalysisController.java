package com.intest.api.controller;

import com.intest.basicservice.table.common.ResponseBean;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.task.TaskBaseEntity;
import com.intest.response.TaskMenuDateResponse;
import com.intest.service.StatisticalAnalysisPage;
import com.intest.service.impl.StatisticalAnalysisImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "统计分析")
public class StatisticalAnalysisController {

    @Autowired
    StatisticalAnalysisImpl statisticalAnalysis;


    /**
     * 获取任务统计列表
     *
     * @return
     */
    public PagerDataBaseVO getStatisticalAnalysisTmpInfo() {
        return statisticalAnalysis.getStatisticalAnalysisTmpInfo(new StatisticalAnalysisPage());
    }

    /**
     * 获取任务统计区数据接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/statistical/getStatisticalAnalysisDate", method = RequestMethod.GET)
    public ResponseBean getStatisticalAnalysisDate() {
        List<TaskBaseEntity> taskLst = statisticalAnalysis.getTaskList();
        TaskMenuDateResponse response = new TaskMenuDateResponse();
        int erroNum = 0;
        int successNum = 0;
        for (TaskBaseEntity entity : taskLst) {
            switch (entity.getTaskStatusValueName()) {
                case "已完成":
                    successNum += 1;
                    break;
                case "":
                    erroNum += 1;
                    break;
            }
        }
        response.setErroNum(erroNum);
        response.setSuccessNum(successNum);
        response.setTaskNum(taskLst.size());
        return new ResponseBean(1, "查询成功", response);
    }

    /**
     * 获取车辆统计列表
     *
     * @return
     */
    public PagerDataBaseVO getCarAnalysisTmpInfo() {
        return statisticalAnalysis.getCarAnalysisTmpInfo(new StatisticalAnalysisPage());
    }


}
