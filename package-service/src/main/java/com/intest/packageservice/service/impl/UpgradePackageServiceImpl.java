package com.intest.packageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.*;
import com.intest.packageservice.request.*;
import com.intest.packageservice.service.UpgradePackageService;
import com.intest.packageservice.vo.VersionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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

    @Autowired
    private PartsPackageBtoMapper partsPackageBtoMapper;

    @Autowired
    private PartsBtoMapper partsBtoMapper;

    @Autowired
    private UpgradePackageFileinfoBtoMapper upgradePackageFileinfoBtoMapper;

    @Autowired
    private PackageTaskBtoMapper packageTaskBtoMapper;

    @Autowired
    private TaskOriginalPackageBtoMapper taskOriginalPackageBtoMapper;

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
    public List<PartsTreeBto> partsTree(PartsTreeRequest request){
        List<PartsTreeBto> list = new ArrayList<>();
        if(StringUtils.isEmptyStr(request.getQueryText())){
            list = upgradePackageMapper.getPartsByCarTypeId(request.getCarTypeId());
            for(PartsTreeBto bto : list){
                bto.setChildren(upgradePackageMapper.getPartsCode(bto.getKey()));
            }
        }
        else {
            PartsBtoExample partsBtoExample = new PartsBtoExample();
            partsBtoExample.createCriteria().andFkCartypeIdEqualTo(request.getCarTypeId()).andPartsnameLike("%"+request.getQueryText()+"%");
            List<PartsBto> partsBtoList = partsBtoMapper.selectByExample(partsBtoExample);
            for(PartsBto bto : partsBtoList){
                PartsTreeBto partsTreeBto = new PartsTreeBto();
                partsTreeBto.setKey(bto.getPartsId());
                partsTreeBto.setTitle(bto.getPartsname());
                partsTreeBto.setChildren(upgradePackageMapper.getPartsCode(bto.getPartsId()));
                list.add(partsTreeBto);
            }

            PartsPackageBtoExample example = new PartsPackageBtoExample();
            example.setDistinct(true);
            example.createCriteria().andPartnumberLike("%"+request.getQueryText()+"%");
            List<PartsPackageBto> partsPackageBtoList = partsPackageBtoMapper.selectByExample(example);
            List<String> ids = new ArrayList<>();
            for(PartsPackageBto bto : partsPackageBtoList){
                ids.add(bto.getFkPartsId());
            }
            if(ids.size() == 0){
                return list;
            }

            partsBtoExample = new PartsBtoExample();
            partsBtoExample.createCriteria().andFkCartypeIdEqualTo(request.getCarTypeId()).andPartsIdIn(ids);
            partsBtoList = partsBtoMapper.selectByExample(partsBtoExample);
            List<String> keys = new ArrayList<>();
            for(PartsBto bto : partsBtoList){
                PartsTreeBto partsTreeBto = new PartsTreeBto();
                partsTreeBto.setKey(bto.getPartsId());
                partsTreeBto.setTitle(bto.getPartsname());
                List<ChildNode> nodes = new ArrayList<>();
                for(PartsPackageBto partsPackageBto : partsPackageBtoList){
                    if(bto.getPartsId().equals(partsPackageBto.getFkPartsId())){
                        if(!keys.contains(partsPackageBto.getPartnumber())){
                            ChildNode node = new ChildNode();
                            node.setKey(partsPackageBto.getFkPartsId());
                            node.setTitle(partsPackageBto.getPartnumber());
                            nodes.add(node);
                            keys.add(partsPackageBto.getPartnumber());
                        }
                    }
                }
                partsTreeBto.setChildren(nodes);
                list.add(partsTreeBto);
            }
        }
        return list;
    }

    @Override
    public List<VersionVO> getVersion(VersionRequest request){
        List<VersionVO> list = new ArrayList<>();
        PartsPackageBtoExample example = new PartsPackageBtoExample();
        example.createCriteria().andFkPartsIdEqualTo(request.getPartsId()).andPartnumberEqualTo(request.getPartsCode());
        List<PartsPackageBto> partsPackageBtoList = partsPackageBtoMapper.selectByExample(example);
        for(PartsPackageBto bto : partsPackageBtoList){
            VersionVO vo = new VersionVO();
            vo.setPartsPackageId(bto.getPartspackageId());
            vo.setVersion(bto.getSoftwareversion());
            vo.setTargetVersion(bto.getTargetsoftwareversion());
            vo.setType(bto.getPackagetype().intValue());
            list.add(vo);
        }
        return list;
    }

    @Override
    public int make(MakeRequest request){
        PackageTaskBto packageTaskBto = new PackageTaskBto();
        String packageTaskId = UUID.randomUUID().toString();
        packageTaskBto.setPackagetaskId(packageTaskId);
        packageTaskBto.setFkPackagetaskstatusvalueCode("100");
        packageTaskBto.setCreateby(UUID.randomUUID().toString());
        packageTaskBto.setFkCartypeId(request.getCarTypeId());
        packageTaskBtoMapper.insertSelective(packageTaskBto);

        for(PartsRequest partsRequest : request.getPartsPackage()){
            if(partsRequest.getType() == 0){
                TaskOriginalPackageBto taskOriginalPackageBto = new TaskOriginalPackageBto();
                taskOriginalPackageBto.setTaskoriginalpackageId(UUID.randomUUID().toString());
                taskOriginalPackageBto.setFkPackagetaskId(packageTaskId);
                taskOriginalPackageBto.setType(new BigDecimal(0));
                taskOriginalPackageBto.setMaketype(new BigDecimal(0));
                taskOriginalPackageBto.setFkPartspackageId(partsRequest.getBasePartsPackageId());
                taskOriginalPackageBto.setCreateby(UUID.randomUUID().toString());
                taskOriginalPackageBtoMapper.insertSelective(taskOriginalPackageBto);

                taskOriginalPackageBto = new TaskOriginalPackageBto();
                taskOriginalPackageBto.setTaskoriginalpackageId(UUID.randomUUID().toString());
                taskOriginalPackageBto.setFkPackagetaskId(packageTaskId);
                taskOriginalPackageBto.setType(new BigDecimal(1));
                taskOriginalPackageBto.setMaketype(new BigDecimal(0));
                taskOriginalPackageBto.setFkPartspackageId(partsRequest.getTargetPartsPackageId());
                taskOriginalPackageBto.setCreateby(UUID.randomUUID().toString());
                taskOriginalPackageBtoMapper.insertSelective(taskOriginalPackageBto);
            }else if(partsRequest.getType() == 1){
                TaskOriginalPackageBto taskOriginalPackageBto = new TaskOriginalPackageBto();
                taskOriginalPackageBto.setTaskoriginalpackageId(UUID.randomUUID().toString());
                taskOriginalPackageBto.setFkPackagetaskId(packageTaskId);
                taskOriginalPackageBto.setType(new BigDecimal(2));
                taskOriginalPackageBto.setMaketype(new BigDecimal(1));
                taskOriginalPackageBto.setFkPartspackageId(partsRequest.getBasePartsPackageId());
                taskOriginalPackageBto.setCreateby(UUID.randomUUID().toString());
                taskOriginalPackageBtoMapper.insertSelective(taskOriginalPackageBto);
            }
        }

        return 1;
    }

    @Override
    public int unpublish(String[] ids){
        UpgradePackageFileinfoBto bto = new UpgradePackageFileinfoBto();
        bto.setIspublish(new BigDecimal(2));
        UpgradePackageFileinfoBtoExample example = new UpgradePackageFileinfoBtoExample();
        example.createCriteria().andUpgradepackagefileinfoIdIn(Arrays.asList(ids));
        int count = upgradePackageFileinfoBtoMapper.updateByExampleSelective(bto, example);
        return count > 0 ? 1 : 0;
    }
}
