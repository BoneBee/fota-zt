package com.intest.api.controller;

import com.alibaba.fastjson.JSON;
import com.intest.basicservice.table.common.ResponseBean;
import com.intest.dao.entity.partsConfig.CarTypeAPartsEntity;
import com.intest.dao.entity.partsConfig.PartsBaseConfig;
import com.intest.partsconfigservice.service.entity.CarTypeBaseInfoEntity;
import com.intest.partsconfigservice.service.entity.PartsBaseInfoEntity;
import com.intest.partsconfigservice.service.impl.PartsConfigServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.intest.partsconfigservice.service.ExcpUtil;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @作者:dl
 * @描述:策略管理模块 API接口
 * @创建时间: 2020/8/31 16:04
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@RestController
@Api(tags = {"策略管理"})
public class PartsConfigController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PartsConfigServiceImpl partsConfigServiceImpl;


    @ApiOperation("策略信息查询")
    @RequestMapping(value = "/api/basic/parts/getPartsConfig", method = RequestMethod.GET)
    public ResponseBean getPartsConfig(String partsId) {
        logger.info("接收到策略信息查询请求，partsId："+partsId);
        try {
            PartsBaseConfig cartTpeToPartsConfig = partsConfigServiceImpl.getPartsConfig(partsId);
            if (cartTpeToPartsConfig != null) {
                logger.info("处理策略信息查询成功，查询结果："+ JSON.toJSONString(cartTpeToPartsConfig));
                return new ResponseBean(1, "查询成功", cartTpeToPartsConfig);
            } else {
                logger.info("处理策略信息查询成功，无查询结果：");
                return new ResponseBean(1, "策略信息查询成功，无数据", null);
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
            logger.error("策略信息查询失败：失败信息："+ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "策略信息查询失败", null);
        }

    }

    @ApiOperation("配置策略信息")
    @RequestMapping(value = "/api/basic/parts/updatePartsConfig", method = RequestMethod.POST)
    public ResponseBean updatePartsConfig(@RequestBody PartsBaseConfig partsBaseConfig) {
        logger.info("接收到配置策略信息请求，更新信息："+JSON.toJSONString(partsBaseConfig));
        try {
            int n = partsConfigServiceImpl.updatePartsConfig(partsBaseConfig);
            if (n > 0) {
                logger.info("处理配置策略信息修改成功，更新信息："+JSON.toJSONString(partsBaseConfig));
                return new ResponseBean(1, "配置策略信息修改成功", null);
            } else {
                logger.info("处理配置策略信息修改成功,影响行数为：0");
                return new ResponseBean(1, "配置策略信息修改成功，影响行数：0", null);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            logger.error("配置策略信息修改失败：失败信息："+ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "配置策略信息修改成功", null);
        }

    }

    @ApiOperation("获取车型零部件信息")
    @RequestMapping(value = "/api/basic/parts/getCarTypeParts", method = RequestMethod.GET)
    public ResponseBean getCarTypeParts(String likeStr) {
        logger.info("接收到获取车型零部件信息请求，请求参数："+likeStr);
        try {
            if(likeStr==null){
                likeStr="";
            }
            List<CarTypeAPartsEntity> carTypeAPartsEntities = partsConfigServiceImpl.selectCarType(likeStr.toUpperCase());
            if (carTypeAPartsEntities.size() > 0) {
                List<CarTypeBaseInfoEntity> lst = new ArrayList<>();
                //获取不重复车型ID信息
                Set<String> carTypeIds = new HashSet<>(carTypeAPartsEntities.stream().map(CarTypeAPartsEntity::getCarTypeId).collect(Collectors.toList()));
                for (String carTypeId:carTypeIds){
                    //循环车型ID，组合对应的tree结构数据
                    List<CarTypeAPartsEntity> _lst=carTypeAPartsEntities.stream().filter(x->x.getCarTypeId().equals(carTypeId)).collect(Collectors.toList());
                    CarTypeBaseInfoEntity carTypeBaseInfoEntity=new CarTypeBaseInfoEntity();
                    carTypeBaseInfoEntity.setKey(carTypeId);
                    carTypeBaseInfoEntity.setTitle(_lst.get(0).getCarTypeName());
                    carTypeBaseInfoEntity.children=new ArrayList<>();
                    for (CarTypeAPartsEntity item:_lst){
                        PartsBaseInfoEntity partsBaseInfoEntity=new PartsBaseInfoEntity();

                        partsBaseInfoEntity.setKey(item.getPartsId());

                        partsBaseInfoEntity.setTitle(item.getPartsName());

                        partsBaseInfoEntity.setOrderNum(item.getOrderNum());

                        carTypeBaseInfoEntity.children.add(partsBaseInfoEntity);
                    }
                    lst.add(carTypeBaseInfoEntity);
                }
                logger.info("处理车型零部件信息查询成功，查询结果："+JSON.toJSONString(lst));
                return new ResponseBean(1, "取车型零部件信息查询成功", lst);
            } else {
                logger.info("处理车型零部件信息查询成功，无数据");
                return new ResponseBean(1, "取车型零部件信息查询成功，无数据", null);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            logger.error("取车型零部件信息查询失败：失败信息："+ExcpUtil.getStackTraceString(ex));
            return new ResponseBean(0, "取车型零部件信息查询失败", null);
        }

    }

}
