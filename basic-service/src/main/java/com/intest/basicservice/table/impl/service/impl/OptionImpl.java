package com.intest.basicservice.table.impl.service.impl;


import com.intest.basicservice.table.impl.service.OptionService;
import com.intest.dao.entity.OptionBto;
import com.intest.dao.mapper.OptionBtoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OptionImpl implements OptionService {
    @Resource
    OptionBtoMapper optionBtoMapper;

    @Override
    public OptionBto getOptionById(String optionId) {
        return optionBtoMapper.selectByPrimaryKey(optionId);
    }


    @Override
    public int addOption(OptionBto optionBto) {
        return optionBtoMapper.insert(optionBto);
    }

    @Override
    public int updateOption(OptionBto optionBto) {
        return optionBtoMapper.updateByPrimaryKey(optionBto);
    }

    @Override
    public int deleteOption(String optionId) {
        return optionBtoMapper.deleteByPrimaryKey(optionId);
    }
}
