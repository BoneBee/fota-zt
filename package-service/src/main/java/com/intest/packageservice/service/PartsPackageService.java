package com.intest.packageservice.service;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.packageservice.request.PartsPackageRequest;
import com.intest.packageservice.vo.PartsPackageVO;

public interface PartsPackageService {
    PagerDataBaseVO findAllPartsPackage(PartsPackageRequest request);

    PartsPackageVO partsPackageDetails(String partsPackageId);
}
