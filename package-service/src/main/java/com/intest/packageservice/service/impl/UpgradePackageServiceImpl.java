package com.intest.packageservice.service.impl;

import com.intest.dao.entity.UpgradePackage;
import com.intest.dao.entity.dto.PartsTreeDto;
import com.intest.dao.mapper.UpgradePackageMapper;
import com.intest.packageservice.service.UpgradePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 11:04
 */
@Component
public class UpgradePackageServiceImpl implements UpgradePackageService {
    @Autowired
    private UpgradePackageMapper upgradePackageMapper;

    @Override
    public List<UpgradePackage> findAllUpgradePackage() {
        return upgradePackageMapper.findAllUpgradePackage();
    }

    @Override
    public List<PartsTreeDto> partsTree(String carTypeId){
        List<PartsTreeDto> list = upgradePackageMapper.getPartsByCarTypeId(carTypeId);
        for(PartsTreeDto dto : list){
            dto.setChildren(upgradePackageMapper.getPartsCode(dto.getKey()));
        }
        return list;
    }

    @Override
    public List<String> getVersion(String partsCode, String partsId){
        return upgradePackageMapper.getVersion(partsCode, partsId);
    }
}
