package com.intest.basicservice.table.impl.service;


import com.intest.dao.entity.MeunBto;

import java.util.List;

public interface MeunService {
    MeunBto getMeunById(String menuId);

    List<MeunBto> getMeun();

    int addMeun(MeunBto meunBto);

    int updateMeun(MeunBto meunBto);

    int deleteMeun(String menuId);
}
