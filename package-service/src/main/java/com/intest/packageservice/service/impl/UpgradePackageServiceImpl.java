package com.intest.packageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.UpgradePackage;
import com.intest.dao.entity.UpgradePackageExtendBto;
import com.intest.dao.entity.dto.PartsTreeDto;
import com.intest.dao.mapper.UpgradePackageMapper;
import com.intest.packageservice.request.UpgradePackageRequest;
import com.intest.packageservice.service.UpgradePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 11:04
 */
@Component
@TableDataAnnotation
public class UpgradePackageServiceImpl implements UpgradePackageService {
    @Autowired
    private UpgradePackageMapper upgradePackageMapper;

    @Override
    @TableDataAnnotation(tableId = "e1796f23-c541-4b70-9cf9-20abe3cb30af")
    public PagerDataBaseVO findAllUpgradePackage(UpgradePackageRequest request) {
        PageHelper.startPage(request.getPi(), request.getPs());
        UpgradePackageExtendBto bto = new UpgradePackageExtendBto();
        bto.setPackageName(request.getPackageName());
        bto.setCarTypeName(request.getCarTypeName());
        bto.setPackageType(request.getPackageType());
        bto.setPublishStatus(request.getPublishStatus());

        List<UpgradePackageExtendBto> list = upgradePackageMapper.findAllUpgradePackage(bto);
        PageInfo pageInfo = new PageInfo<UpgradePackageExtendBto>(list);
        PagerDataBaseVO result = new PagerDataBaseVO();
        result.setTotal(pageInfo.getTotal());
        result.setData(list);
        return result;
    }

    @Override
    public List<PartsTreeDto> partsTree(String carTypeId){
        List<PartsTreeDto> list = upgradePackageMapper.getPartsByCarTypeId(carTypeId);
        for(PartsTreeDto dto : list){
            dto.setChildren(upgradePackageMapper.getPartsCode(dto.getKey()));
        }
        return list;
    }

    @Override
    public List<String> getVersion(String partsCode, String partsId){
        return upgradePackageMapper.getVersion(partsCode, partsId);
    }
}
