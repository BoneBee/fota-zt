package com.intest.partsconfigservice.service;

import com.intest.dao.entity.partsConfig.CarTypeAPartsEntity;
import com.intest.dao.entity.partsConfig.PartsBaseConfig;

import java.util.List;

/**
 * @作者:dl
 * @描述:策略管理模块接口
 * @创建时间: 2020/8/31 13:52
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
public interface PartsConfigService {
    /**
     * 策略信息查询
     * @param partsId  零部件ID
     * @return
     */
    PartsBaseConfig getPartsConfig(String partsId);

    int updatePartsConfig(PartsBaseConfig cartTpeToPartsConfig);

    List<CarTypeAPartsEntity> selectCarType(String likeStr);

}
