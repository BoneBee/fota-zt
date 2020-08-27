package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.*;
import com.intest.dao.entity.dto.PackageDto;
import com.intest.dao.entity.vo.PackageVo;

import java.util.List;

public interface LargePackageService {
    Integer checkPartType(String partType, String carTypeId);

    boolean checkParentFileName(String fileName, String carTypeId);

    String getPartsId(String partsName, String carTypeId);

    FileInfo getFileById(String fileId);

    PagerDataBaseVO findAllLargePackage(PackageVo vo);

    List<CarType> findAllCarType();

    PackageDto packageDetails(String packageId);

    int deletePackage(String packageId);

    void saveLargeZipInfo(LargePackage largePackage);

    void saveZipInfo(PartsPackage partsPackage);

    void saveFileInfo(FileInfo fileInfo);

    void savePartsPackageDetail(PartsPackageDetail partsPackageDetail);

    void savePartDetailInfo();
}
