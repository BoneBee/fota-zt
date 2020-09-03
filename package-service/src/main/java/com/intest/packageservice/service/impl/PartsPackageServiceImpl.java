package com.intest.packageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.PartsPackageExtendBto;
import com.intest.dao.mapper.PartsPackageMapper;
import com.intest.packageservice.request.PartsPackageRequest;
import com.intest.packageservice.service.PartsPackageService;
import com.intest.packageservice.vo.PartsPackageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@TableDataAnnotation
public class PartsPackageServiceImpl implements PartsPackageService {
    @Autowired
    private PartsPackageMapper partsPackageMapper;

    @Override
    @TableDataAnnotation(tableId = "c53b2e07-4622-46b6-a0bf-d77463d5202b")
    public PagerDataBaseVO findAllPartsPackage(PartsPackageRequest request) {
        PartsPackageExtendBto bto = new PartsPackageExtendBto();
        bto.setPartsPackageName(request.getPartsPackageName());
        bto.setPartsName(request.getPartsName());
        bto.setPartsTypeName(request.getPartsTypeName());
        bto.setPackageName(request.getPackageName());
        bto.setCarTypeName(request.getCarTypeName());

        PageHelper.startPage(request.getPi(), request.getPs());
        List<PartsPackageExtendBto> list = partsPackageMapper.findAllPartsPackage(bto);
        PageInfo pageInfo = new PageInfo<PartsPackageExtendBto>(list);
        PagerDataBaseVO result = new PagerDataBaseVO();
        result.setTotal(pageInfo.getTotal());
        result.setData(list);
        return result;
    }

    @Override
    public PartsPackageVO partsPackageDetails(String partsPackageId) {
        PartsPackageExtendBto bto = partsPackageMapper.partsPackageDetails(partsPackageId);
        PartsPackageVO vo = new PartsPackageVO();
        vo.setVersion(bto.getVersion());
        vo.setPartsTypeName(bto.getPartsTypeName());
        vo.setPartsPackageSize(bto.getPartsPackageSize());
        vo.setPartsPackageName(bto.getPartsPackageName());
        vo.setPartsName(bto.getPartsName());
        vo.setPartCode(bto.getPartCode());
        vo.setId(bto.getId());
        vo.setFileId(bto.getFileId());
        return vo;
    }
}
