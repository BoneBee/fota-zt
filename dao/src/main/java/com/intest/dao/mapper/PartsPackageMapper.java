package com.intest.dao.mapper;

import com.intest.dao.entity.dto.PartsPackageDetailsDto;
import com.intest.dao.entity.dto.PartsPackageListDto;
import com.intest.dao.entity.vo.PartsPackageVo;

import java.util.List;

public interface PartsPackageMapper {
    List<PartsPackageListDto> findAllPartsPackage(PartsPackageVo vo);

    PartsPackageDetailsDto partsPackageDetails(String partsPackageId);
}
