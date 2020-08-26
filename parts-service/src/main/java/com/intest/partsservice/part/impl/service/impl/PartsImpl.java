package com.intest.partsservice.part.impl.service.impl;

import com.intest.dao.entity.PartsBto;
import com.intest.dao.entity.PartsBtoExample;
import com.intest.dao.mapper.PartsBtoMapper;
import com.intest.partsservice.part.impl.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsImpl implements PartsService {
    @Autowired
    PartsBtoMapper partsBtoMapper;

    @Override
    public PartsBto getPartsById(String partsId) {
        return partsBtoMapper.selectByPrimaryKey(partsId);
    }

    @Override
    public PartsBto getPartsByFullName(String partsFullName) {
        PartsBtoExample partsBtoExample = new PartsBtoExample();
        PartsBtoExample.Criteria criteria = partsBtoExample.createCriteria();
        criteria.andPartsnameEqualTo(partsFullName);
        List<PartsBto> partsBtos = partsBtoMapper.selectByExample(partsBtoExample);
        if (partsBtos.size() != 0) {
            return partsBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public PartsBto getPartsByCode(String partsCode) {
        PartsBtoExample partsBtoExample = new PartsBtoExample();
        PartsBtoExample.Criteria criteria = partsBtoExample.createCriteria();
        criteria.andPartscodeEqualTo(partsCode);
        List<PartsBto> partsBtos = partsBtoMapper.selectByExample(partsBtoExample);
        if (partsBtos.size() != 0) {
            return partsBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<PartsBto> getPartsList() {
        PartsBtoExample partsBtoExample = new PartsBtoExample();
        List<PartsBto> partsBtos = partsBtoMapper.selectByExample(partsBtoExample);
        return partsBtos;
    }

    @Override
    public int addParts(PartsBto partsBto) {
        return partsBtoMapper.insert(partsBto);
    }

    @Override
    public int updateParts(PartsBto partsBto) {
        return partsBtoMapper.updateByPrimaryKey(partsBto);
    }

    @Override
    public int deleteParts(String partsId) {
        return partsBtoMapper.deleteByPrimaryKey(partsId);
    }
}
