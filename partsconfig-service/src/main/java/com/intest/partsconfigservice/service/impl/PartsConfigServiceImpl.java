package com.intest.partsconfigservice.service.impl;

import com.intest.dao.entity.partsConfig.CarTypeAPartsEntity;
import com.intest.dao.entity.partsConfig.PartsBaseConfig;
import com.intest.dao.mapper.PartsConfigMapper;
import com.intest.partsconfigservice.service.PartsConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @作者:
 * @描述:
 * @创建时间: 2020/8/31 15:39
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Service
public class PartsConfigServiceImpl implements PartsConfigService {

    @Autowired
    PartsConfigMapper partsConfigMapper;

    @Override
    public PartsBaseConfig getPartsConfig(String partsId) {

        return partsConfigMapper.selectPartsConfig(partsId);
    }

    @Override
    public int updatePartsConfig(PartsBaseConfig partsBaseConfig) {
        return partsConfigMapper.updatePartsConfig(partsBaseConfig);
    }

    @Override
    public List<CarTypeAPartsEntity> selectCarType(String likeStr) {

        return  partsConfigMapper.selectCarType(likeStr);

    }

    @Override
    public List<CarTypeAPartsEntity> selectCarTypeByCarTypeId(String carTypeId) {
        return partsConfigMapper.selectCarTypeByCarTypeId(carTypeId);
    }
}
