package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.dto.PartsPackageDetailsDto;
import com.intest.dao.entity.vo.PartsPackageVo;

public interface PartsPackageService {
    PagerDataBaseVO findAllPartsPackage(PartsPackageVo vo);

    PartsPackageDetailsDto partsPackageDetails(String partsPackageId);
}
