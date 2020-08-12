package com.intest.basicservice.table.impl.service.impl;


import com.intest.basicservice.table.impl.service.MeunService;
import com.intest.dao.entity.MeunBto;
import com.intest.dao.entity.MeunBtoExample;
import com.intest.dao.entity.UserBtoExample;
import com.intest.dao.mapper.MeunBtoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MeunImpl implements MeunService {

    @Resource
    MeunBtoMapper meunBtoMapper;

    @Override
    public MeunBto getMeunById(String menuId) {
        return meunBtoMapper.selectByPrimaryKey(menuId);
    }

    @Override
    public List<MeunBto> getMeun() {
        MeunBtoExample example = new MeunBtoExample();
        List<MeunBto> meunBtos = meunBtoMapper.selectByExample(example);
        return meunBtos;
    }

    @Override
    public int addMeun(MeunBto meunBto) {
        return meunBtoMapper.insert(meunBto);
    }

    @Override
    public int updateMeun(MeunBto meunBto) {
        return meunBtoMapper.updateByPrimaryKey(meunBto);
    }

    @Override
    public int deleteMeun(String menuId) {
        return meunBtoMapper.deleteByPrimaryKey(menuId);
    }
}
