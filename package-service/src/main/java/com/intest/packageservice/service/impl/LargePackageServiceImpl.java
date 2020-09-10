package com.intest.packageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.FileBtoMapper;
import com.intest.dao.mapper.PackageMapper;
import com.intest.packageservice.request.PackageRequest;
import com.intest.packageservice.service.LargePackageService;
import com.intest.packageservice.vo.PackageCheckRequest;
import com.intest.packageservice.vo.PackageVO;
import com.intest.packageservice.vo.PartsPackageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@TableDataAnnotation
public class LargePackageServiceImpl implements LargePackageService {
    @Autowired
    private PackageMapper packageMapper;

    @Autowired
    private FileBtoMapper fileBtoMapper;

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
    public FileBto getFileById(String fileId){
        return fileBtoMapper.selectByPrimaryKey(fileId);
    }

    @Override
    @TableDataAnnotation(tableId = "525760ef-cffa-4e9a-a3d2-12efa2e49cdb")
    public PagerDataBaseVO findAllLargePackage(PackageRequest request) {
        PageHelper.startPage(request.getPi(), request.getPs());
        PackageBto bto = new PackageBto();
        bto.setPackageName(request.getPackageName());
        bto.setCarTypeName(request.getCarTypeName());
        bto.setUploadUser(request.getUploadUser());

        List<PackageExtendBto> list = packageMapper.findAllLargePackage(bto);
        PageInfo pageInfo = new PageInfo<PackageExtendBto>(list);
        PagerDataBaseVO result = new PagerDataBaseVO();
        result.setTotal(pageInfo.getTotal());
        result.setData(list);
        return result;
    }

    @Override
    public List<CarTypeExtendBto> findAllCarType(){
        return packageMapper.findAllCarType();
    }

    @Override
    public PackageVO packageDetails(String packageId){
        PackageVO vo = new PackageVO();
        PackageExtendBto bto = packageMapper.packageDetails(packageId);
        if(bto != null){
            vo.setPackageName(bto.getPackageName());
            vo.setCarTypeName(bto.getCarTypeName());
            vo.setPackageSize(bto.getPackageSize());
            vo.setUploadTime(bto.getUploadTime());
            vo.setUploadUser(bto.getUploadUser());
            List<PartsPackageVO> partsPackages = new ArrayList<>();
            List<PartsPackageExtendBto> list = packageMapper.getPartsPackage(packageId);
            for(PartsPackageExtendBto pbto : list){
                PartsPackageVO ppvo = new PartsPackageVO();
                ppvo.setFileId(pbto.getFileId());
                ppvo.setId(pbto.getId());
                ppvo.setPartCode(pbto.getPartCode());
                ppvo.setPartsName(pbto.getPartsName());
                ppvo.setPartsPackageName(pbto.getPartsPackageName());
                ppvo.setPartsPackageSize(pbto.getPartsPackageSize());
                ppvo.setPartsTypeName(pbto.getPartsTypeName());
                ppvo.setVersion(pbto.getVersion());
                partsPackages.add(ppvo);
            }
            vo.setPartsPackage(partsPackages);
        }
        return vo;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deletePackage(String[] ids){
        int count = 0;
        int packageCount = packageMapper.deletePackage(ids);
        int partsPackageCount = packageMapper.deletePartsPackage(ids);
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
