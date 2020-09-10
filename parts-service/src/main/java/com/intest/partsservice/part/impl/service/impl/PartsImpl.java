package com.intest.partsservice.part.impl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.PartsBto;
import com.intest.dao.entity.PartsBtoExample;
import com.intest.dao.entity.PartsTypeBto;
import com.intest.dao.mapper.PartsBtoMapper;
import com.intest.dao.mapper.PartsTypeBtoMapper;
import com.intest.partsservice.part.impl.service.PartsService;
import com.intest.partsservice.part.response.PartPage;
import com.intest.partsservice.part.response.PartsListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@TableDataAnnotation
public class PartsImpl implements PartsService {
    @Autowired
    PartsBtoMapper partsBtoMapper;

    @Autowired
    PartsTypeBtoMapper partsTypeBtoMapper;

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

    @Override
    @TableDataAnnotation(tableId = "5d61bc92-3c01-4e73-a786-1680de013280")
    public PagerDataBaseVO getPartInfo(PartPage model) {
        PagerDataBaseVO part = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        PartsBtoExample partsBtoExample = new PartsBtoExample();
        List<PartsBto> partsList = partsBtoMapper.selectByExample(partsBtoExample);
        List<PartsListResponse> partsListRespons = new ArrayList<>();
        PageInfo<PartsBto> pageInfo = new PageInfo<PartsBto>(partsList);
        int index = pageInfo.getStartRow() - 1;
        for (PartsBto partsBto : partsList) {
            String partTypeName = "";
            PartsTypeBto partsTypeBto = partsTypeBtoMapper.selectByPrimaryKey(partsBto.getFkPartstypeId());
            if (partsTypeBto != null) {
                partTypeName = partsTypeBto.getPartstypename();
            }
            PartsListResponse partsListResponse = new PartsListResponse(index += 1, partsBto.getPartsId(), partsBto.getPartsname(), partsBto.getFkPartstypeId(), partTypeName, partsBto.getCreateat(), partsBto.getCreateby(), partsBto.getUpdateat(), partsBto.getUpdateby(), partsBto.getRemark());
            partsListRespons.add(partsListResponse);
        }
        part.setTotal(pageInfo.getTotal());
        part.setData(partsListRespons);
        return part;
    }
}
