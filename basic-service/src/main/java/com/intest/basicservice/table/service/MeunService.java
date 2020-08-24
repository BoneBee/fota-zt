package com.intest.basicservice.table.service;


import com.intest.dao.entity.MenuBto;

import java.util.List;

public interface MeunService {
    MenuBto getMeunById(String menuId);

    List<MenuBto> getMeun();

    int addMeun(MenuBto meunBto);

    int updateMeun(MenuBto meunBto);

    int deleteMeun(String menuId);
}
