package com.intest.dao.mapper;


import com.intest.dao.entity.*;
import com.intest.dao.entity.dto.PartsPackageDto;

import java.util.List;

public interface PackageMapper {
    Integer checkPartType(String partType, String carTypeId);

    Integer checkParentFileName(String fileName, String carTypeId);

    String getPartsId(String partsName, String carTypeId);

    FileInfo getFileById(String fileId);

    List<PackageExtendBto> findAllLargePackage(PackageBto bto);

    List<CarTypeExtendBto> findAllCarType();

    PackageExtendBto packageDetails(String packageId);

    List<PartsPackageExtendBto> getPartsPackage(String packageId);

    int deletePackage(String[] ids);

    int deletePartsPackage(String[] ids);

    void saveLargeZipInfo(LargePackage largePackage);

    void saveZipInfo(PartsPackage partsPackage);

    void saveFileInfo(FileInfo fileInfo);

    void savePartsPackageDetail(PartsPackageDetail partsPackageDetail);

    void savePartDetailInfo();
}
