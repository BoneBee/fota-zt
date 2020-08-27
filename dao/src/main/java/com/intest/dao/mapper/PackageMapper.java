package com.intest.dao.mapper;


import com.intest.dao.entity.*;
import com.intest.dao.entity.dto.PartsPackageDto;
import com.intest.dao.entity.vo.PackageVo;

import java.util.List;

public interface PackageMapper {
    Integer checkPartType(String partType, String carTypeId);

    Integer checkParentFileName(String fileName, String carTypeId);

    String getPartsId(String partsName, String carTypeId);

    FileInfo getFileById(String fileId);

    List<LargePackage> findAllLargePackage(PackageVo vo);

    List<CarType> findAllCarType();

    LargePackage packageDetails(String packageId);

    List<PartsPackageDto> getPartsPackage(String packageId);

    int deletePackage(String packageId);

    int deletePartsPackage(String packageId);

    void saveLargeZipInfo(LargePackage largePackage);

    void saveZipInfo(PartsPackage partsPackage);

    void saveFileInfo(FileInfo fileInfo);

    void savePartsPackageDetail(PartsPackageDetail partsPackageDetail);

    void savePartDetailInfo();
}
