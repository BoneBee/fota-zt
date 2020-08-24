package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.MeunService;

import com.intest.dao.entity.MenuBto;
import com.intest.dao.entity.MenuBtoExample;
import com.intest.dao.mapper.MenuBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeunImpl implements MeunService {

    @Autowired
    MenuBtoMapper meunBtoMapper;

    @Override
    public MenuBto getMeunById(String menuId) {
        return meunBtoMapper.selectByPrimaryKey(menuId);
    }

    @Override
    public List<MenuBto> getMeun() {
        MenuBtoExample example = new MenuBtoExample();
        List<MenuBto> meunBtos = meunBtoMapper.selectByExample(example);
        return meunBtos;
    }

    @Override
    public int addMeun(MenuBto meunBto) {
        return meunBtoMapper.insert(meunBto);
    }

    @Override
    public int updateMeun(MenuBto meunBto) {
        return meunBtoMapper.updateByPrimaryKey(meunBto);
    }

    @Override
    public int deleteMeun(String menuId) {
        return meunBtoMapper.deleteByPrimaryKey(menuId);
    }
}
