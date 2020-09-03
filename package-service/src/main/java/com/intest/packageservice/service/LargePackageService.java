package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.*;
import com.intest.dao.entity.dto.PackageDto;
import com.intest.dao.entity.vo.PackageVo;
import com.intest.packageservice.vo.PackageCheckRequest;

import java.util.List;

public interface LargePackageService {
    Integer checkPartType(String partType, String carTypeId);

    boolean checkParentFileName(PackageCheckRequest request);

    String getPartsId(String partsName, String carTypeId);

    FileInfo getFileById(String fileId);

    PagerDataBaseVO findAllLargePackage(PackageVo vo);

    List<CarType> findAllCarType();

    PackageDto packageDetails(String packageId);

    int deletePackage(String[] ids);

    void saveLargeZipInfo(LargePackage largePackage);

    void saveZipInfo(PartsPackage partsPackage);

    void saveFileInfo(FileInfo fileInfo);

    void savePartsPackageDetail(PartsPackageDetail partsPackageDetail);

    void savePartDetailInfo();
}
