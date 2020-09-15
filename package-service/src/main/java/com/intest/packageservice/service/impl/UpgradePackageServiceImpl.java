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
import com.intest.packageservice.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    private PartsUpgradePackageBtoMapper partsUpgradePackageBtoMapper;

    @Override
    @TableDataAnnotation(tableId = "e1796f23-c541-4b70-9cf9-20abe3cb30af")
    public PagerDataBaseVO findAllUpgradePackage(UpgradePackageRequest request) {
        PageHelper.startPage(request.getPi(), request.getPs());
        UpgradePackageExtendBto bto = new UpgradePackageExtendBto();
        bto.setPackageName(request.getPackageName());
        bto.setCarTypeName(request.getCarTypeName());
        bto.setPackageType(request.getPackageType());

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
        try{
            PackageTaskBto packageTaskBto = new PackageTaskBto();
            String packageTaskId = UUID.randomUUID().toString();
            packageTaskBto.setPackagetaskId(packageTaskId);
            packageTaskBto.setFkPackagetaskstatusvalueCode("100");
            packageTaskBto.setCreateby(UUID.randomUUID().toString());
            packageTaskBto.setFkCartypeId(request.getCarTypeId());
            packageTaskBto.setTitle(request.getTitle());
            packageTaskBto.setContent(request.getContent());
            packageTaskBto.setPackagename(request.getPackageName());
            packageTaskBto.setMaketype(new BigDecimal(request.getPackageType()));
            packageTaskBtoMapper.insertSelective(packageTaskBto);

            for(PartsRequest partsRequest : request.getPartsPackage()){
                if(partsRequest.getType() == 0){
                    TaskOriginalPackageBto taskOriginalPackageBto = new TaskOriginalPackageBto();
                    taskOriginalPackageBto.setTaskoriginalpackageId(UUID.randomUUID().toString());
                    taskOriginalPackageBto.setFkPackagetaskId(packageTaskId);
                    taskOriginalPackageBto.setType(new BigDecimal(0));
                    taskOriginalPackageBto.setFkPartspackageId(partsRequest.getBasePartsPackageId());
                    taskOriginalPackageBto.setCreateby(UUID.randomUUID().toString());
                    taskOriginalPackageBtoMapper.insertSelective(taskOriginalPackageBto);

                    taskOriginalPackageBto = new TaskOriginalPackageBto();
                    taskOriginalPackageBto.setTaskoriginalpackageId(UUID.randomUUID().toString());
                    taskOriginalPackageBto.setFkPackagetaskId(packageTaskId);
                    taskOriginalPackageBto.setType(new BigDecimal(1));
                    taskOriginalPackageBto.setFkPartspackageId(partsRequest.getTargetPartsPackageId());
                    taskOriginalPackageBto.setCreateby(UUID.randomUUID().toString());
                    taskOriginalPackageBtoMapper.insertSelective(taskOriginalPackageBto);
                }else if(partsRequest.getType() == 1){
                    TaskOriginalPackageBto taskOriginalPackageBto = new TaskOriginalPackageBto();
                    taskOriginalPackageBto.setTaskoriginalpackageId(UUID.randomUUID().toString());
                    taskOriginalPackageBto.setFkPackagetaskId(packageTaskId);
                    taskOriginalPackageBto.setType(new BigDecimal(2));
                    taskOriginalPackageBto.setFkPartspackageId(partsRequest.getBasePartsPackageId());
                    taskOriginalPackageBto.setCreateby(UUID.randomUUID().toString());
                    taskOriginalPackageBtoMapper.insertSelective(taskOriginalPackageBto);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }

        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int unpublish(String packageTaskId){
        PackageTaskBto bto = new PackageTaskBto();
        bto.setFkPackagetaskstatusvalueCode("104");
        bto.setPackagetaskId(packageTaskId);
        int count = packageTaskBtoMapper.updateByPrimaryKeySelective(bto);
        return count > 0 ? 1 : -1;
    }

    @Override
    public UpgradePackageDetailVO upgradePackageDesc(String packageTaskId){
        UpgradePackageDetailVO vo = new UpgradePackageDetailVO();
        PackageTaskBto bto = packageTaskBtoMapper.selectByPrimaryKey(packageTaskId);
        vo.setTitle(bto.getTitle());
        vo.setContent(bto.getContent());
        return vo;
    }

    @Override
    public List<PartsVO> getParts(String packageTaskId){
        TaskOriginalPackageBtoExample example = new TaskOriginalPackageBtoExample();
        example.createCriteria().andFkPackagetaskIdEqualTo(packageTaskId);
        List<TaskOriginalPackageBto> tops = taskOriginalPackageBtoMapper.selectByExample(example);
        List<PartsVO> plist = new ArrayList<>();
        int index = 1;
        for(TaskOriginalPackageBto top : tops){
            PartsPackageBto ppbto = partsPackageBtoMapper.selectByPrimaryKey(top.getFkPartspackageId());
            PartsBto pbto = partsBtoMapper.selectByPrimaryKey(ppbto.getFkPartsId());
            PartsVO pvo = new PartsVO();
            pvo.setId(index++);
            if(top.getType().intValue() == 0){
                boolean flag = false;
                for(PartsVO pv : plist){
                    if(pv.getPartsName().equals(pbto.getPartsname())){
                        pv.setBaseVersion(ppbto.getSoftwareversion());
                        flag = true;
                    }
                }
                if(!flag){
                    pvo.setPartsName(pbto.getPartsname());
                    pvo.setPartsCode(ppbto.getPartnumber());
                    pvo.setPartsTypeName(ppbto.getProjectcode());
                    pvo.setBaseVersion(ppbto.getSoftwareversion());
                    plist.add(pvo);
                }
            } else if(top.getType().intValue() == 1){
                boolean flag = false;
                for(PartsVO pv : plist){
                    if(pv.getPartsName().equals(pbto.getPartsname())){
                        pv.setTargetVersion(ppbto.getSoftwareversion());
                        flag = true;
                    }
                }
                if(!flag){
                    pvo.setPartsName(pbto.getPartsname());
                    pvo.setPartsCode(ppbto.getPartnumber());
                    pvo.setPartsTypeName(ppbto.getProjectcode());
                    pvo.setTargetVersion(ppbto.getTargetsoftwareversion());
                    plist.add(pvo);
                }
            } else if(top.getType().intValue() == 2){
                pvo.setPartsName(pbto.getPartsname());
                pvo.setPartsCode(ppbto.getPartnumber());
                pvo.setPartsTypeName(ppbto.getProjectcode());
                pvo.setBaseVersion(ppbto.getSoftwareversion());
                pvo.setTargetVersion(ppbto.getTargetsoftwareversion());
                plist.add(pvo);
            }
        }
        return plist;
    }

    @Override
    public List<UpgradePackageVO> getUpgradePackage(String packageTaskId){
        PartsUpgradePackageBtoExample partsUpgradePackageBtoExample = new PartsUpgradePackageBtoExample();
        partsUpgradePackageBtoExample.createCriteria().andFkPackagetaskIdEqualTo(packageTaskId);
        List<PartsUpgradePackageBto> pups = partsUpgradePackageBtoMapper.selectByExample(partsUpgradePackageBtoExample);
        List<UpgradePackageVO> uplist = new ArrayList<>();
        for(PartsUpgradePackageBto pup : pups){
            UpgradePackageFileinfoBto baseBto = upgradePackageFileinfoBtoMapper.selectByPrimaryKey(pup.getFkUpgradepackagefileinfoIdB());
            UpgradePackageVO upvo = new UpgradePackageVO();
            upvo.setPackageName(baseBto.getFilename());
            upvo.setSize(baseBto.getFilesize().floatValue());
            upvo.setType(0);
            uplist.add(upvo);

            UpgradePackageFileinfoBto targetBto = upgradePackageFileinfoBtoMapper.selectByPrimaryKey(pup.getFkUpgradepackagefileinfoId());
            upvo = new UpgradePackageVO();
            upvo.setPackageName(targetBto.getFilename());
            upvo.setSize(targetBto.getFilesize().floatValue());
            upvo.setType(1);
            uplist.add(upvo);
        }
        return uplist;
    }
}
