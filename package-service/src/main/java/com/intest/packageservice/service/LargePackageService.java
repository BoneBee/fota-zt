package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.*;
import com.intest.packageservice.request.PackageRequest;
import com.intest.packageservice.vo.PackageCheckRequest;
import com.intest.packageservice.vo.PackageVO;

import java.util.List;

public interface LargePackageService {
    Integer checkPartType(String partType, String carTypeId);

    boolean checkParentFileName(PackageCheckRequest request);

    String getPartsId(String partsName, String carTypeId);

    FileInfo getFileById(String fileId);

    PagerDataBaseVO findAllLargePackage(PackageRequest request);

    List<CarTypeExtendBto> findAllCarType();

    PackageVO packageDetails(String packageId);

    int deletePackage(String[] ids);

    void saveLargeZipInfo(LargePackage largePackage);

    void saveZipInfo(PartsPackage partsPackage);

    void saveFileInfo(FileInfo fileInfo);

    void savePartsPackageDetail(PartsPackageDetail partsPackageDetail);

    void savePartDetailInfo();
}
