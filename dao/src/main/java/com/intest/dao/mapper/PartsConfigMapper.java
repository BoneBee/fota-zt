package com.intest.dao.mapper;


import com.intest.dao.entity.partsConfig.CarTypeAPartsEntity;
import com.intest.dao.entity.partsConfig.PartsBaseConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @作者:dl
 * @描述:策略管理模块 API接口
 * @创建时间: 2020/8/31 16:04
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
public interface PartsConfigMapper {

     PartsBaseConfig selectPartsConfig(String partsId);

     int updatePartsConfig(PartsBaseConfig cartTpeToPartsConfig);

     List<CarTypeAPartsEntity> selectCarType(@Param("likeStr") String likeStr);

     List<CarTypeAPartsEntity> selectCarTypeByCarTypeId(String carTypeId);
}