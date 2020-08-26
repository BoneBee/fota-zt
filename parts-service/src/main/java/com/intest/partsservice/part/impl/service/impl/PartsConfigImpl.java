package com.intest.partsservice.part.impl.service.impl;

import com.intest.dao.entity.PartsConfigBto;
import com.intest.dao.mapper.PartsConfigBtoMapper;
import com.intest.partsservice.part.impl.service.PartsConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartsConfigImpl implements PartsConfigService {
    @Autowired
    PartsConfigBtoMapper partsConfigBtoMapper;
    @Override
    public int addParts(PartsConfigBto partsConfigBto) {
        return partsConfigBtoMapper.insert(partsConfigBto);
    }
}
