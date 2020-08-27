package com.intest.packageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.dto.PartsPackageDetailsDto;
import com.intest.dao.entity.dto.PartsPackageListDto;
import com.intest.dao.entity.vo.PartsPackageVo;
import com.intest.dao.mapper.PartsPackageMapper;
import com.intest.packageservice.service.PartsPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PartsPackageServiceImpl implements PartsPackageService {
    @Autowired
    private PartsPackageMapper partsPackageMapper;

    @Override
    public PagerDataBaseVO findAllPartsPackage(PartsPackageVo vo) {
        PageHelper.startPage(vo.getPi(), vo.getPs());
        List<PartsPackageListDto> list = partsPackageMapper.findAllPartsPackage(vo);
        PageInfo pageInfo = new PageInfo<PartsPackageListDto>(list);
        PagerDataBaseVO result = new PagerDataBaseVO();
        result.setTotal(pageInfo.getTotal());
        result.setData(list);
        return result;
    }

    @Override
    public PartsPackageDetailsDto partsPackageDetails(String partsPackageId) {
        return partsPackageMapper.partsPackageDetails(partsPackageId);
    }
}
