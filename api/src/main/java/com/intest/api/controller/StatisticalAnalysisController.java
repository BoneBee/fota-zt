package com.intest.api.controller;

import com.intest.basicservice.table.common.ResponseBean;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.result.ResultT;
import com.intest.dao.entity.statisticalAnalysis.TimeRequest;
import com.intest.dao.entity.task.TaskBaseEntity;
import com.intest.request.CarUpdateFindRequest;
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
     * 获取主页数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/home/getHomeOneDate", method = RequestMethod.GET)
    public ResultT getHomeOneDate() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getHomeOneDate());
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }


    /**
     * 获取平台任务情况数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/home/getHomeTaskDate", method = RequestMethod.GET)
    public ResultT getHomeTaskDate() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getHomeTaskDate());
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取升级包类型占比
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/home/getHomeUpdatePackageDate", method = RequestMethod.GET)
    public ResultT getHomeUpdatePackageDate() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getHomeUpdatePackageDate());
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取车辆升级数量趋势折线图数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/home/getCarUpdateDate", method = RequestMethod.POST)
    public ResultT getCarUpdateDate(@RequestBody TimeRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getCarUpdateDate(request));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取车辆升级失败原因统计数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/home/getCarErroDate", method = RequestMethod.POST)
    public ResultT getCarErroDate(@RequestBody TimeRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getCarErroDate(request));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }


    /**
     * 获取任务统计列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/statistical/getStatisticalAnalysisTmpInfo", method = RequestMethod.POST)
    public ResultT getStatisticalAnalysisTmpInfo(@RequestBody TimeRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getStatisticalAnalysisTmpInfo(new StatisticalAnalysisPage(), request));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取任务统计区数据接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/statistical/getStatisticalAnalysisDate", method = RequestMethod.POST)
    public ResponseBean getStatisticalAnalysisDate(@RequestBody TimeRequest request) {
        List<TaskBaseEntity> taskLst = statisticalAnalysis.getTaskList(request);
        TaskMenuDateResponse response = new TaskMenuDateResponse();
        int erroNum = 0;
        int successNum = 0;
        for (TaskBaseEntity entity : taskLst) {
            switch (entity.getTaskStatusValueName()) {
                case "已完成":
                    successNum += 1;
                    break;
                case "已关闭":
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
    @ResponseBody
    @RequestMapping(value = "/api/basic/statistical/getCarAnalysisTmpInfo", method = RequestMethod.POST)
    public PagerDataBaseVO getCarAnalysisTmpInfo(@RequestBody TimeRequest request) {
        return statisticalAnalysis.getCarAnalysisTmpInfo(new StatisticalAnalysisPage(), request);
    }

    /**
     * 获取车辆统计区数据接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/statistical/getCarStatisticalAnalysisDate", method = RequestMethod.POST)
    public ResultT getCarStatisticalAnalysisDate(@RequestBody TimeRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getCarStatisticalAnalysisDate(request));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 新建Vin查询任务-获取车辆vin列表接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/statistical/getVinCarList", method = RequestMethod.POST)
    public ResultT getVinCarList(@RequestBody CarUpdateFindRequest request) {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getCarUpdateFindList(new StatisticalAnalysisPage(), request));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取版本统计列表
     *
     * @return
     */
    public ResultT getVersionAnalysisTmpInfo() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getVersionAnalysisTmpInfo(new StatisticalAnalysisPage()));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    /**
     * 获取零件升级统计列表
     *
     * @return
     */
    public ResultT getPartsUpdateAnalysisTmpInfo() {
        ResultT result = new ResultT<>();
        try {
            result.setResult(statisticalAnalysis.getPartsUpdateAnalysisTmpInfo(new StatisticalAnalysisPage()));
        } catch (Exception e) {
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }


    /**
     * 获取失败原因统计列表
     *
     * @return
     */
    public PagerDataBaseVO getErroMessageTmpInfo() {
        return statisticalAnalysis.getErroMessageTmpInfo(new StatisticalAnalysisPage());
    }


}
