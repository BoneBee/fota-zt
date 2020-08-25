package com.intest.partsservice.part.impl.service;


import com.intest.dao.entity.PartsTypeBto;

import java.util.List;

public interface PartsTypeService {

    PartsTypeBto getPartsTypeById(String partsTypeId);

    PartsTypeBto getPartsTypeByName(String partsTypeName);

    List<PartsTypeBto> getPartsTypeList();

    int addPartsType(PartsTypeBto partsTypeBto);

    int updatePartsType(PartsTypeBto partsTypeBto);

    int deletePartsType(String partsTypeId);
}
