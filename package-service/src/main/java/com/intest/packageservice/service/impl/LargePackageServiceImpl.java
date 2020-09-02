package com.intest.packageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.entity.dto.PackageDto;
import com.intest.dao.entity.dto.PartsPackageDto;
import com.intest.dao.entity.vo.PackageVo;
import com.intest.dao.mapper.PackageMapper;
import com.intest.packageservice.service.LargePackageService;
import com.intest.packageservice.vo.PackageCheckRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@TableDataAnnotation
public class LargePackageServiceImpl implements LargePackageService {
    @Autowired
    private PackageMapper packageMapper;

    @Override
    public Integer checkPartType(String partType, String carTypeId) {
        Integer result = packageMapper.checkPartType(partType, carTypeId);
        return result;
    }

    @Override
    public boolean checkParentFileName(PackageCheckRequest request) {
        Integer result = packageMapper.checkParentFileName(request.getFileName(), request.getCarTypeId());
        return result > 0;
    }

    @Override
    public String getPartsId(String partsName, String carTypeId){
        return packageMapper.getPartsId(partsName, carTypeId);
    }

    @Override
    public FileInfo getFileById(String fileId){
        return packageMapper.getFileById(fileId);
    }

    @Override
    @TableDataAnnotation(tableId = "525760ef-cffa-4e9a-a3d2-12efa2e49cdb")
    public PagerDataBaseVO findAllLargePackage(PackageVo vo) {
        PageHelper.startPage(vo.getPi(), vo.getPs());
        List<LargePackage> list = packageMapper.findAllLargePackage(vo);
        PageInfo pageInfo = new PageInfo<LargePackage>(list);
        PagerDataBaseVO result = new PagerDataBaseVO();
        result.setTotal(pageInfo.getTotal());
        result.setData(list);
        return result;
    }

    @Override
    public List<CarType> findAllCarType(){
        return packageMapper.findAllCarType();
    }

    @Override
    public PackageDto packageDetails(String packageId){
        PackageDto dto = new PackageDto();
        LargePackage lp = packageMapper.packageDetails(packageId);
        if(lp != null){
            dto.setPackageName(lp.getPackageName());
            dto.setCarTypeName(lp.getCarTypeName());
            dto.setPackageSize(lp.getPackageSize());
            dto.setUploadTime(lp.getUploadTime());
            dto.setUploadUser(lp.getUploadUser());
            List<PartsPackageDto> list = packageMapper.getPartsPackage(packageId);
            dto.setPartsPackage(list);
        }
        return dto;
    }

    @Override
    public int deletePackage(String packageId){
        int count = 0;
        int packageCount = packageMapper.deletePackage(packageId);
        int partsPackageCount = packageMapper.deletePartsPackage(packageId);
        if(packageCount > 0 && partsPackageCount > 0){
            count = 1;
        }
        return count;
    }

    @Override
    public void saveLargeZipInfo(LargePackage largePackage) {
        packageMapper.saveLargeZipInfo(largePackage);
    }

    @Override
    public void saveZipInfo(PartsPackage partsPackage) {
        packageMapper.saveZipInfo(partsPackage);
    }

    @Override
    public void saveFileInfo(FileInfo fileInfo) {
        packageMapper.saveFileInfo(fileInfo);
    }

    @Override
    public void savePartsPackageDetail(PartsPackageDetail partsPackageDetail){packageMapper.savePartsPackageDetail(partsPackageDetail);}

    @Override
    public void savePartDetailInfo() {
        packageMapper.savePartDetailInfo();
    }
}
