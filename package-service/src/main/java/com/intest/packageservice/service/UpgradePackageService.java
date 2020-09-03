package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.dto.PartsTreeDto;
import com.intest.packageservice.request.UpgradePackageRequest;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 11:03
 */
public interface UpgradePackageService {
    PagerDataBaseVO findAllUpgradePackage(UpgradePackageRequest request);

    List<PartsTreeDto> partsTree(String carTypeId);

    List<String> getVersion(String partsCode, String partsId);
}
