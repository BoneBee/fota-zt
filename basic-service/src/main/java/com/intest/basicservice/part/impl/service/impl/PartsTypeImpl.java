package com.intest.basicservice.part.impl.service.impl;

import com.intest.basicservice.part.impl.service.PartsTypeService;
import com.intest.basicservice.table.exception.CustomException;
import com.intest.basicservice.table.util.common.StringUtils;
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
    public PartsTypeBto getPartsTypeByFullName(String fullName) {
        if (!StringUtils.isNotEmptyStr(fullName)) {
            throw new CustomException("fullName不能为空！");
        }
        PartsTypeBtoExample partsTypeBtoExample = new PartsTypeBtoExample();
        PartsTypeBtoExample.Criteria criteria = partsTypeBtoExample.createCriteria();
        criteria.andFullnameEqualTo(fullName);
        List<PartsTypeBto> partsTypeBtos = partsTypeBtoMapper.selectByExample(partsTypeBtoExample);
        if (partsTypeBtos != null || partsTypeBtos.size() != 0) {
            return partsTypeBtos.get(0);
        } else {
            return null;
        }
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
