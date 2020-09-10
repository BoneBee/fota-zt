package com.intest.dao.mapper;

import com.intest.dao.entity.PartsPackageExtendBto;

import java.util.List;

public interface PartsPackageMapper {
    List<PartsPackageExtendBto> findAllPartsPackage(PartsPackageExtendBto bto);

    PartsPackageExtendBto partsPackageDetails(String partsPackageId);
}
