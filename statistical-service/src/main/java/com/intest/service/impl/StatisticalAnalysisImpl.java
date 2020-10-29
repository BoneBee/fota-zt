package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.code.CarCode;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.CarBtoExtend;
import com.intest.dao.entity.task.TaskBaseEntity;
import com.intest.dao.entity.task.TaskCarBaseEntity;
import com.intest.dao.entity.task.TaskCarInfoNumsEntity;
import com.intest.dao.mapper.CarExtendMapper;
import com.intest.dao.mapper.TaskMapper;
import com.intest.response.CarAnalysisResponse;
import com.intest.response.StatisticalAnalysisResponse;
import com.intest.service.StatisticalAnalysisPage;
import com.intest.service.StatisticalAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@TableDataAnnotation
public class StatisticalAnalysisImpl implements StatisticalAnalysisService {

    @Autowired
    TaskMapper taskMapper;

    @Autowired
    CarExtendMapper carExtendMapper;


    @Override
    public List<TaskBaseEntity> getTaskList() {
        List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();
        return taskLst;
    }

    @Override
    @TableDataAnnotation(tableId = "b5e13a9a-c2e9-44d0-8084-544b1c1aa84b")
    public PagerDataBaseVO getStatisticalAnalysisTmpInfo(StatisticalAnalysisPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();
        List<StatisticalAnalysisResponse> statisticalAnalysisResponses = new ArrayList<>();
        PageInfo<TaskBaseEntity> pageInfo = new PageInfo<>(taskLst);
        int index = pageInfo.getStartRow() - 1;
        for (TaskBaseEntity entity : taskLst) {
            TaskCarInfoNumsEntity taskCarInfoNumsEntity = taskMapper.selectTaskCarNum(entity.getTaskId());
            List<TaskCarBaseEntity> taskCars = taskMapper.getTaskCar(entity.getTaskId());
            int UpdateNum = 0;
            int SuccessNum = 0;
            int ErroNum = 0;
            int CancleNum = 0;
            for (TaskCarBaseEntity taskCarBaseEntity : taskCars) {
                switch (taskCarBaseEntity.getTaskCarStatusValueCode()) {
                    /**
                     * 升级中
                     * */
                    case CarCode.CODE_0000:
                    case CarCode.CODE_0007:
                    case CarCode.CODE_1000:
                    case CarCode.CODE_1002:
                    case CarCode.CODE_1004:
                    case CarCode.CODE_1012:
                    case CarCode.CODE_1017:
                    case CarCode.CODE_1020:
                    case CarCode.CODE_1021:
                    case CarCode.CODE_1023:
                    case CarCode.CODE_1030:
                    case CarCode.CODE_1032:
                    case CarCode.CODE_1033:
                    case CarCode.CODE_1034:
                    case CarCode.CODE_1036:
                    case CarCode.CODE_1037:
                    case CarCode.CODE_1041:
                    case CarCode.CODE_1042:
                    case CarCode.CODE_1064:
                    case CarCode.CODE_1071:
                        UpdateNum += 1;
                        break;
                    /**
                     * 取消升级*/
                    case CarCode.CODE_1018:
                    case CarCode.CODE_1063:
                    case CarCode.CODE_1070:
                        CancleNum += 1;
                        break;
                    /**
                     * 已完成
                     * */
                    case CarCode.CODE_1053:
                        SuccessNum += 1;
                        break;
                    /**
                     * 升级失败
                     * */
                    case CarCode.CODE_0008:
                    case CarCode.CODE_1001:
                    case CarCode.CODE_1003:
                    case CarCode.CODE_1013:
                    case CarCode.CODE_1022:
                    case CarCode.CODE_1024:
                    case CarCode.CODE_1025:
                    case CarCode.CODE_1027:
                    case CarCode.CODE_1028:
                    case CarCode.CODE_1040:
                    case CarCode.CODE_1047:
                    case CarCode.CODE_1048:
                    case CarCode.CODE_1049:
                    case CarCode.CODE_1050:
                    case CarCode.CODE_1051:
                    case CarCode.CODE_1052:
                    case CarCode.CODE_1054:
                    case CarCode.CODE_1060:
                    case CarCode.CODE_1061:
                    case CarCode.CODE_1062:
                    case CarCode.CODE_1065:
                    case CarCode.CODE_1072:
                    case CarCode.CODE_1073:
                    case CarCode.CODE_1074:
                    case CarCode.CODE_1075:
                    case CarCode.CODE_1076:
                    case CarCode.CODE_1077:
                    case CarCode.CODE_1078:
                    case CarCode.CODE_1080:
                    case CarCode.CODE_1081:
                    case CarCode.CODE_1082:
                    case CarCode.CODE_1083:
                    case CarCode.CODE_1084:
                    case CarCode.CODE_1085:
                    case CarCode.CODE_1086:
                    case CarCode.CODE_1087:
                    case CarCode.CODE_1088:
                    case CarCode.CODE_1089:
                    case CarCode.CODE_1090:
                    case CarCode.CODE_1091:
                    case CarCode.CODE_1092:
                    case CarCode.CODE_1093:
                    case CarCode.CODE_1094:
                    case CarCode.CODE_1095:
                    case CarCode.CODE_1096:
                    case CarCode.CODE_1097:
                    case CarCode.CODE_1098:
                    case CarCode.CODE_1099:
                    case CarCode.CODE_1100:
                    case CarCode.CODE_1101:
                    case CarCode.CODE_1102:
                    case CarCode.CODE_1103:
                    case CarCode.CODE_1104:
                    case CarCode.CODE_1105:
                    case CarCode.CODE_1106:
                    case CarCode.CODE_1107:
                    case CarCode.CODE_1108:
                    case CarCode.CODE_1109:
                    case CarCode.CODE_1110:
                    case CarCode.CODE_1111:
                    case CarCode.CODE_1112:
                    case CarCode.CODE_1113:
                        ErroNum += 1;
                        break;
                }
            }

            StatisticalAnalysisResponse response = new StatisticalAnalysisResponse();
            response.setIndex(index += 1);
            response.setTaskName(entity.getTaskName());
            response.setCarTypeName(entity.getCarTypeName());
            response.setTaskStrategy(entity.getTaskStrategy());
            response.setTaskStatusValueName(entity.getTaskStatusValueName());
            response.setCarNum(taskCarInfoNumsEntity.getCarTotalNum());
            response.setUpdateNum(UpdateNum);
            response.setSuccessNum(SuccessNum);
            response.setErroNum(ErroNum);
            response.setCancleNum(CancleNum);
            response.setCreatAy(entity.getCreateAt());
            statisticalAnalysisResponses.add(response);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(statisticalAnalysisResponses);
        return type;
    }

    @Override
    @TableDataAnnotation(tableId = "61596607-f69d-4862-a136-8311525c6d4a")
    public PagerDataBaseVO getCarAnalysisTmpInfo(StatisticalAnalysisPage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<CarBtoExtend> cartmpExs = carExtendMapper.getCars(null);//获取所有车辆信息
        List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();//获取所有任务信息
        List<CarAnalysisResponse> carAnalysisResponseList = new ArrayList<>();
        PageInfo<CarBtoExtend> pageInfo = new PageInfo<>(cartmpExs);
        int index = pageInfo.getStartRow() - 1;
        for (CarBtoExtend carBtoExtend : cartmpExs) {
            int checkNum = 0;
            CarAnalysisResponse response = new CarAnalysisResponse();
            response.setIndex(index += 1);
            response.setVin(carBtoExtend.getVin());
            response.setCarTypeName(carBtoExtend.getCarTypeName());
            response.setTerminal(carBtoExtend.getTerminal());
            for (TaskBaseEntity taskBaseEntity : taskLst) {
                List<TaskCarBaseEntity> taskCars = taskMapper.getTaskCar(taskBaseEntity.getTaskId());
                for (TaskCarBaseEntity taskCarBaseEntity : taskCars) {
                    if (carBtoExtend.getVin().equals(taskCarBaseEntity.getVin())) {
                        checkNum += 1;
                    }
                }
            }
            response.setCheckNum(checkNum);
            response.setDownloadSuccessNum(0);
            response.setUpdateNum(0);
            response.setUpdateSuccessNum(0);
            response.setUpdateErroNum(0);
            response.setUpdateSuccessRate("30%");
            carAnalysisResponseList.add(response);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(carAnalysisResponseList);
        return type;
    }
}
