package com.intest.partsservice.part.impl.service;


import com.intest.dao.entity.PartsBto;

import java.util.List;

public interface PartsService {
    PartsBto getPartsById(String partsId);

    PartsBto getPartsByFullName(String partsFullName);

    PartsBto getPartsByCode(String partsCode);

    List<PartsBto> getPartsList();

    int addParts(PartsBto partsBto);

    int updateParts(PartsBto partsBto);

    int deleteParts(String partsId);
}
