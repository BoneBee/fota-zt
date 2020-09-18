package com.intest.dao.mapper;


import com.intest.dao.entity.*;

import java.util.List;

public interface PackageMapper {
    Integer checkPartType(String partType, String carTypeId);

    Integer checkParentFileName(String fileName, String carTypeId);

    String getPartsId(String partsName, String carTypeId);

    List<PackageExtendBto> findAllLargePackage(PackageBto bto);

    List<CarTypeExtendBto> findAllCarType();

    PackageExtendBto packageDetails(String packageId);

    List<PartsPackageExtendBto> getPartsPackage(String packageId);

    int deletePackage(String[] ids);

    int deletePartsPackage(String[] ids);
}
