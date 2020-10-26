package com.intest.partsservice.part.impl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.PartsTypeBto;
import com.intest.dao.entity.PartsTypeBtoExample;
import com.intest.dao.mapper.PartsTypeBtoMapper;
import com.intest.partsservice.part.impl.service.PartsTypeService;
import com.intest.partsservice.part.response.PartTypePage;
import com.intest.partsservice.part.response.PartsTypeListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@TableDataAnnotation
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

    @Override
    @TableDataAnnotation(tableId = "9a168572-ecb0-49da-96c7-adf64af39df5")
    public PagerDataBaseVO getPartTypeInfo(PartTypePage model) {
        PagerDataBaseVO type = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<PartsTypeBto> partsTypeBtoList = partsTypeBtoMapper.selectByExample(null);
        List<PartsTypeListResponse> partsTypeListResponseList = new ArrayList<>();
        PageInfo<PartsTypeBto> pageInfo = new PageInfo<PartsTypeBto>(partsTypeBtoList);
        int index = pageInfo.getStartRow() - 1;
        for (PartsTypeBto partsTypeBto : partsTypeBtoList) {
            PartsTypeListResponse partsTypeListResponse = new PartsTypeListResponse(index += 1, partsTypeBto.getPartstypeId(), partsTypeBto.getPartstypename(), partsTypeBto.getRemark(), partsTypeBto.getCreateat(), partsTypeBto.getCreateby(), partsTypeBto.getUpdateat(), partsTypeBto.getUpdateby());
            partsTypeListResponseList.add(partsTypeListResponse);
        }
        type.setTotal(pageInfo.getTotal());
        type.setData(partsTypeListResponseList);
        return type;
    }
}
