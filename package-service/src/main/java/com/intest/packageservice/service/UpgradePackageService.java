package com.intest.packageservice.service;

import com.intest.dao.entity.UpgradePackage;
import com.intest.dao.entity.dto.PartsTreeDto;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 11:03
 */
public interface UpgradePackageService {
    List<UpgradePackage> findAllUpgradePackage();

    List<PartsTreeDto> partsTree(String carTypeId);

    List<String> getVersion(String partsCode, String partsId);
}
