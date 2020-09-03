package com.intest.dao.mapper;

import com.intest.dao.entity.UpgradePackageExtendBto;
import com.intest.dao.entity.dto.ChildNode;
import com.intest.dao.entity.dto.PartsTreeDto;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 11:00
 */
public interface UpgradePackageMapper {
    List<UpgradePackageExtendBto> findAllUpgradePackage(UpgradePackageExtendBto bto);

    List<PartsTreeDto> getPartsByCarTypeId(String carTypeId);

    List<ChildNode> getPartsCode(String partsId);

    List<String> getVersion(String partsCode, String partsId);
}
