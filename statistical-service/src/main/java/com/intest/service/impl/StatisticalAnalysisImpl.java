package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.code.CarCode;
import com.intest.code.CarCodeEnu;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.entity.statisticalAnalysis.TimeRequest;
import com.intest.dao.entity.task.TaskBaseEntity;
import com.intest.dao.entity.task.TaskCarBaseEntity;
import com.intest.dao.entity.task.TaskCarInfoNumsEntity;
import com.intest.dao.mapper.*;
import com.intest.request.CarUpdateFindRequest;
import com.intest.response.*;
import com.intest.service.StatisticalAnalysisPage;
import com.intest.service.StatisticalAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@TableDataAnnotation
public class StatisticalAnalysisImpl implements StatisticalAnalysisService {

    @Autowired
    TaskMapper taskMapper;

    @Autowired
    TaskCarBtoMapper taskBtoMapper;

    @Autowired
    CarExtendMapper carExtendMapper;

    @Autowired
    CarTypeBtoMapper cartypeMapper;

    @Autowired
    CarBtoMapper carBtoMapper;

    @Autowired
    PartsBtoMapper partsBtoMapper;

    @Autowired
    private PartsPackageMapper partsPackageMapper;


    @Override
    public List<TaskBaseEntity> getTaskList(@RequestBody TimeRequest request) {
        List<TaskBaseEntity> taskLst = taskMapper.selectTimeTaskLst(request);
        return taskLst;
    }

    /**
     * 任务统计
     */
    @Override
    @TableDataAnnotation(tableId = "b5e13a9a-c2e9-44d0-8084-544b1c1aa84b")
    public PagerDataBaseVO getStatisticalAnalysisTmpInfo(StatisticalAnalysisPage model, TimeRequest request) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<TaskBaseEntity> taskLst = taskMapper.selectTimeTaskLst(request);
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
            response.setCreatAt(entity.getCreateAt());
            statisticalAnalysisResponses.add(response);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(statisticalAnalysisResponses);
        return type;
    }

    /**
     * 车辆统计区数据
     */
    @Override
    public CarMenuDateResponse getCarStatisticalAnalysisDate(TimeRequest request) {
        CarMenuDateResponse response = new CarMenuDateResponse();
        List<CarBtoExtend> cartmpExs = carExtendMapper.getTimeCars(request);//获取所有车辆信息
        TaskCarBtoExample example = new TaskCarBtoExample();
        TaskCarBtoExample.Criteria criteria = example.createCriteria();
        if (request.getEndTime() != null && request.getStarTime() != null) {
            criteria.andCreateatBetween(request.getStarTime(), request.getEndTime());
        }

        List<TaskCarBto> taskCarBtos = taskBtoMapper.selectByExample(example);
        int successNum = 0;
        for (TaskCarBto taskCarBto : taskCarBtos) {
            switch (taskCarBto.getFkTaskcarstatusvalueCode()) {
                case CarCode.CODE_1053:
                    successNum += 1;
                    break;
            }
        }
        response.setCarNum(cartmpExs.size());
        response.setUpdateNum(taskCarBtos.size());
        DecimalFormat dF = new DecimalFormat("0.00");
        if (taskCarBtos.size() == 0) {
            response.setUpdateRate("0");
        } else {
            response.setUpdateRate(dF.format((float) successNum / taskCarBtos.size()) + "");
        }
        return response;
    }


    /**
     * 车辆统计
     */
    @Override
    @TableDataAnnotation(tableId = "61596607-f69d-4862-a136-8311525c6d4a")
    public PagerDataBaseVO getCarAnalysisTmpInfo(StatisticalAnalysisPage model, TimeRequest request) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<CarBtoExtend> cartmpExs = carExtendMapper.getTimeCars(request);//获取所有车辆信息
        List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();//获取所有任务信息
        List<CarAnalysisResponse> carAnalysisResponseList = new ArrayList<>();
        PageInfo<CarBtoExtend> pageInfo = new PageInfo<>(cartmpExs);
        int index = pageInfo.getStartRow() - 1;
        for (CarBtoExtend carBtoExtend : cartmpExs) {
            int checkNum = 0;
            int downloadSuccessnum = 0;
            int updateNum = 0;
            int updateSuccessNum = 0;
            int updateErroNum = 0;
            CarAnalysisResponse response = new CarAnalysisResponse();
            response.setIndex(index += 1);
            response.setVin(carBtoExtend.getVin());
            response.setCarTypeName(carBtoExtend.getCarTypeName());
            response.setTerminal(carBtoExtend.getTerminal());
            for (TaskBaseEntity taskBaseEntity : taskLst) {
                List<TaskCarBaseEntity> taskCars = taskMapper.getTaskCar(taskBaseEntity.getTaskId());
                for (TaskCarBaseEntity taskCarBaseEntity : taskCars) {
                    if (carBtoExtend.getVin().equals(taskCarBaseEntity.getVin())) {
                        switch (taskCarBaseEntity.getTaskCarStatusValueCode()) {
                            case CarCode.CODE_1012:
                            case CarCode.CODE_1013:
                                checkNum += 1;
                                break;
                            case CarCode.CODE_1021:
                                downloadSuccessnum += 1;
                                break;
                            case CarCode.CODE_1041:
                                updateNum += 1;
                                break;
                            case CarCode.CODE_1053:
                                updateSuccessNum += 1;
                                break;
                            case CarCode.CODE_1050:
                                updateErroNum += 1;
                                break;
                        }
                    }
                }
            }
            response.setCheckNum(checkNum);
            response.setDownloadSuccessNum(downloadSuccessnum);
            response.setUpdateNum(updateNum);
            response.setUpdateSuccessNum(updateSuccessNum);
            response.setUpdateErroNum(updateErroNum);
            DecimalFormat dF = new DecimalFormat("0.00");
            if (updateNum == 0) {
                response.setUpdateSuccessRate("0.00");
            } else {
                response.setUpdateSuccessRate(dF.format((float) updateSuccessNum / updateNum) + "");
            }
            carAnalysisResponseList.add(response);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(carAnalysisResponseList);
        return type;
    }


    /**
     * 车辆升级详情统计
     */
    @Override
    @TableDataAnnotation(tableId = "cbba1b36-7527-4adf-a60a-cb2fa13a7ba0")
    public PagerDataBaseVO getCarUpdateFindList(StatisticalAnalysisPage model, CarUpdateFindRequest request) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<CarUpdateFindResponse> carUpdateFindResponses = new ArrayList<>();
        if (request.getModel() == 1) {
            TaskCarBtoExample example = new TaskCarBtoExample();
            TaskCarBtoExample.Criteria criteria = example.createCriteria();
            criteria.andVinEqualTo(request.getVin());
            criteria.andUpdateatBetween(request.getStarTime(), request.getEndTime());
            List<TaskCarBto> taskCarBtos = taskBtoMapper.selectByExample(example);
            PageInfo<TaskCarBto> pageInfo = new PageInfo<>(taskCarBtos);
            int index = pageInfo.getStartRow() - 1;
            for (TaskCarBto taskCarBto : taskCarBtos) {
                TaskBaseEntity taskBaseEntity = taskMapper.getTaskDetaile(taskCarBto.getFkTaskId());
                CarUpdateFindResponse response = new CarUpdateFindResponse();
                response.setIndex(index += 1);
                response.setVin(taskCarBto.getVin());
                response.setCarName(taskBaseEntity.getCarTypeName());
                response.setTerminal(taskBaseEntity.getTerminalName());
                response.setTaskName(taskBaseEntity.getTaskName());
                response.setUpdateModel(taskBaseEntity.getTaskStrategy());
                response.setUpdateTime(taskCarBto.getUpdateat());
                carUpdateFindResponses.add(response);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(carUpdateFindResponses);
            return type;
        } else {
            List<TaskBaseEntity> taskCarBtos = taskMapper.selectTaskLst();
            List<TaskCarBto> taskCarInfoNumsEntity = new ArrayList<>();
            TaskBaseEntity task = null;
            for (TaskBaseEntity taskBaseEntity : taskCarBtos) {
                if (taskBaseEntity.getTaskName().equals(request.getTaskName())) {
                    TaskCarBtoExample example = new TaskCarBtoExample();
                    TaskCarBtoExample.Criteria criteria = example.createCriteria();
                    criteria.andFkTaskIdEqualTo(taskBaseEntity.getTaskId());
                    taskCarInfoNumsEntity = taskBtoMapper.selectByExample(example);
                    task = taskBaseEntity;
                }
            }
            PageInfo<TaskCarBto> pageInfo = new PageInfo<>(taskCarInfoNumsEntity);
            int index = pageInfo.getStartRow() - 1;
            for (TaskCarBto entity : taskCarInfoNumsEntity) {
                CarUpdateFindResponse response = new CarUpdateFindResponse();
                response.setIndex(index += 1);
                response.setVin(entity.getVin());
                response.setCarName(task.getCarTypeName());
                response.setTerminal(task.getTerminalName());
                response.setTaskName(task.getTaskName());
                response.setUpdateModel(task.getTaskStrategy());
                response.setUpdateTime(entity.getUpdateat());
                carUpdateFindResponses.add(response);
            }
            type.setTotal(pageInfo.getTotal());
            type.setData(carUpdateFindResponses);
            return type;
        }
    }

    /**
     * 版本统计
     */
    @Override
    @TableDataAnnotation(tableId = "27e5e5f3-6d30-46ef-aece-0903ecbbb76f")
    public PagerDataBaseVO getVersionAnalysisTmpInfo(StatisticalAnalysisPage model) {
        PagerDataBaseVO result = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<VersionAnalysisResponse> versionAnalysisResponses = new ArrayList<>();
        List<PartsPackageExtendBto> list = partsPackageMapper.findAllPartsPackage(null);
        List<CarTypeBto> carTypeBtos = cartypeMapper.selectByExample(null);
        for (CarTypeBto carTypeBto : carTypeBtos) {
            List<PartsPackageExtendBto> versionBto = new ArrayList<>();
            for (PartsPackageExtendBto bto : list) {
                if (carTypeBto.getCartypename().equals(bto.getCarTypeName())) {
                    versionBto.add(bto);
                }
            }
            List<PartsPackageExtendBto> version = versionBto.stream().filter(distinctByKey(PartsPackageExtendBto::getVersion)).collect(Collectors.toList());
            for (PartsPackageExtendBto bto : version) {
                VersionAnalysisResponse response = new VersionAnalysisResponse();
                response.setPartName(bto.getPartsName());
                response.setPartType(bto.getPartsTypeName());
                response.setCarType(bto.getCarTypeName());
                response.setVersion(bto.getVersion());
                int versionNum = 0;
                for (PartsPackageExtendBto packageExtendBto : versionBto) {
                    if (bto.getVersion().equals(packageExtendBto.getVersion())) {
                        versionNum += 1;
                    }
                }

                PartsBtoExample example1 = new PartsBtoExample();
                PartsBtoExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andFkCartypeIdEqualTo(carTypeBto.getCartypeId());
                List<PartsBto> partsBtos = partsBtoMapper.selectByExample(example1);
                response.setVersionNum(versionNum);
                response.setPartNum(partsBtos.size());
                versionAnalysisResponses.add(response);
            }
        }
        PageInfo pageInfo = new PageInfo<VersionAnalysisResponse>(versionAnalysisResponses);
        int index = pageInfo.getStartRow() - 1;
        for (VersionAnalysisResponse version : versionAnalysisResponses) {
            version.setIndex(index += 1);
        }

        result.setTotal(pageInfo.getTotal());
        result.setData(versionAnalysisResponses);
        return result;
    }

    /**
     * 零件升级统计
     */
    @Override
    @TableDataAnnotation(tableId = "86397a49-d49f-41f6-8d6f-5d25ff854bc5")
    public PagerDataBaseVO getPartsUpdateAnalysisTmpInfo(StatisticalAnalysisPage model) {
        PagerDataBaseVO result = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<PartsUpdateResponse> versionAnalysisResponses = new ArrayList<>();
        List<PartsPackageExtendBto> list = partsPackageMapper.findAllPartsPackage(null);
        List<CarTypeBto> carTypeBtos = cartypeMapper.selectByExample(null);
        for (CarTypeBto carTypeBto : carTypeBtos) {
            List<PartsPackageExtendBto> versionBto = new ArrayList<>();
            for (PartsPackageExtendBto bto : list) {
                if (carTypeBto.getCartypename().equals(bto.getCarTypeName())) {
                    versionBto.add(bto);
                }
            }
            List<PartsPackageExtendBto> version = versionBto.stream().filter(distinctByKey(PartsPackageExtendBto::getVersion)).collect(Collectors.toList());
            for (PartsPackageExtendBto bto : version) {
                PartsUpdateResponse response = new PartsUpdateResponse();
                response.setCarType(bto.getCarTypeName());
                response.setPartName(bto.getPartsName());
                response.setPartNumber(bto.getPartsCode());
                response.setPartType(bto.getPartsTypeName());
                response.setVersionName(bto.getVersion());
                int versionNum = 0;
                for (PartsPackageExtendBto packageExtendBto : versionBto) {
                    if (bto.getVersion().equals(packageExtendBto.getVersion())) {
                        versionNum += 1;
                    }
                }
                response.setTotalNum(versionNum);
                versionAnalysisResponses.add(response);
            }
        }
        PageInfo pageInfo = new PageInfo<PartsUpdateResponse>(versionAnalysisResponses);
        int index = pageInfo.getStartRow() - 1;
        for (PartsUpdateResponse version : versionAnalysisResponses) {
            version.setIndex(index += 1);
        }

        result.setTotal(pageInfo.getTotal());
        result.setData(versionAnalysisResponses);
        return result;
    }


    /**
     * 失败原因统计
     */
    @Override
    @TableDataAnnotation(tableId = "df6eddca-fe13-4379-9463-3576ef0f9bac")
    public PagerDataBaseVO getErroMessageTmpInfo(StatisticalAnalysisPage model) {
        PagerDataBaseVO result = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<ErroMessageResponse> erroMessageResponses = new ArrayList<>();
        List<TaskBaseEntity> taskLst = taskMapper.selectTaskLst();
        List<TaskCarBaseEntity> allTaskCar = new ArrayList<>();
        for (TaskBaseEntity entity : taskLst) {
            List<TaskCarBaseEntity> taskCars = taskMapper.getTaskCar(entity.getTaskId());
            for (TaskCarBaseEntity taskCarBaseEntity : taskCars) {
                allTaskCar.add(taskCarBaseEntity);
            }
        }
        List<TaskBaseEntity> carType = taskLst.stream().filter(distinctByKey(TaskBaseEntity::getCarTypeName)).collect(Collectors.toList());
        for (TaskBaseEntity entity : carType) {
            List<TaskCarBaseEntity> taskLists = new ArrayList<>();
            for (TaskCarBaseEntity taskCarBto : allTaskCar) {
                if (entity.getCarTypeName().equals(taskCarBto.getCarTypeName())) {
                    taskLists.add(taskCarBto);
                }
            }
            int erroTotalNum = 0;
            for (TaskCarBaseEntity taskCarBaseEntity : taskLists) {
                for (CarCodeEnu enu : CarCodeEnu.values()) {
                    if (taskCarBaseEntity.getTaskCarStatusValueCode().equals(enu.getCode())) {
                        erroTotalNum += 1;
                    }
                }
            }

            List<TaskCarBaseEntity> codeLists = taskLists.stream().filter(distinctByKey(TaskCarBaseEntity::getTaskCarStatusValueCode)).collect(Collectors.toList());
            for (TaskCarBaseEntity taskCarBto : codeLists) {
                ErroMessageResponse response = new ErroMessageResponse();
                response.setCarTypeName(entity.getCarTypeName());
                for (CarCodeEnu enu : CarCodeEnu.values()) {
                    if (taskCarBto.getTaskCarStatusValueCode().equals(enu.getCode())) {
                        response.setErroMessage(enu.getMessage());
                    }
                }
                int erroNum = 0;
                for (TaskCarBaseEntity bto : taskLists) {
                    if (taskCarBto.getTaskCarStatusValueCode().equals(bto.getTaskCarStatusValueCode())) {
                        erroNum += 1;
                    }
                }

                DecimalFormat dF = new DecimalFormat("0.00");
                response.setErroNum(erroNum);
                response.setProportion(dF.format((float) erroNum / erroTotalNum) + "");
                erroMessageResponses.add(response);
            }
        }
        PageInfo pageInfo = new PageInfo<ErroMessageResponse>(erroMessageResponses);
        int index = pageInfo.getStartRow();
        for (ErroMessageResponse erro : erroMessageResponses) {
            erro.setIndex(index += 1);
        }
        result.setTotal(pageInfo.getTotal());
        result.setData(erroMessageResponses);
        return result;
    }


    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        ConcurrentHashMap<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
