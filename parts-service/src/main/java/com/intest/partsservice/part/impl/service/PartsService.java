package com.intest.partsservice.part.impl.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.PartsBto;
import com.intest.partsservice.part.response.PartPage;

import java.util.List;

public interface PartsService {
    PartsBto getPartsById(String partsId);

    PartsBto getPartsByFullName(String partsFullName);

    PartsBto getPartsByCode(String partsCode);

    List<PartsBto> getPartsList();

    int addParts(PartsBto partsBto);

    int updateParts(PartsBto partsBto);

    int deleteParts(String partsId);

    PagerDataBaseVO getPartInfo(PartPage model);
}
