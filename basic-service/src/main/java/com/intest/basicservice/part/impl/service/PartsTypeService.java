package com.intest.basicservice.part.impl.service;

import com.intest.dao.entity.PartsTypeBto;

public interface PartsTypeService {

    PartsTypeBto getPartsTypeById(String partsTypeId);

    PartsTypeBto getPartsTypeByFullName(String fullName);


    int addPartsType(PartsTypeBto partsTypeBto);

    int updatePartsType(PartsTypeBto partsTypeBto);

    int deletePartsType(String partsTypeId);
}
