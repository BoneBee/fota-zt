package com.intest.partsservice.part.impl.service.impl;

import com.intest.partsservice.part.impl.service.PartsTypeService;
import com.intest.common.exception.CustomException;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.PartsTypeBto;
import com.intest.dao.entity.PartsTypeBtoExample;
import com.intest.dao.mapper.PartsTypeBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsTypeImpl implements PartsTypeService {

    @Autowired
    PartsTypeBtoMapper partsTypeBtoMapper;

    @Override
    public PartsTypeBto getPartsTypeById(String partsTypeId) {
        return partsTypeBtoMapper.selectByPrimaryKey(partsTypeId);
    }

    @Override
    public PartsTypeBto getPartsTypeByName(String partsTypeName) {
        PartsTypeBtoExample partsTypeBtoExample = new PartsTypeBtoExample();
        PartsTypeBtoExample.Criteria criteria = partsTypeBtoExample.createCriteria();
        criteria.andPartstypenameEqualTo(partsTypeName);
        List<PartsTypeBto> partsTypeBtos = partsTypeBtoMapper.selectByExample(partsTypeBtoExample);
        System.out.println(partsTypeBtos.size());
        if (partsTypeBtos.size() != 0) {
            return partsTypeBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<PartsTypeBto> getPartsTypeList() {
        PartsTypeBtoExample partsTypeBtoExample = new PartsTypeBtoExample();
        List<PartsTypeBto> partsTypeBtoList = partsTypeBtoMapper.selectByExample(partsTypeBtoExample);
        return partsTypeBtoList;
    }

    @Override
    public int addPartsType(PartsTypeBto partsTypeBto) {
        return partsTypeBtoMapper.insert(partsTypeBto);
    }

    @Override
    public int updatePartsType(PartsTypeBto partsTypeBto) {
        return partsTypeBtoMapper.updateByPrimaryKey(partsTypeBto);
    }

    @Override
    public int deletePartsType(String partsTypeId) {
        return partsTypeBtoMapper.deleteByPrimaryKey(partsTypeId);
    }
}