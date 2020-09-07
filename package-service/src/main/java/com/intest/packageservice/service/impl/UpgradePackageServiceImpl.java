package com.intest.packageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.PartsBtoMapper;
import com.intest.dao.mapper.PartsPackageBtoMapper;
import com.intest.dao.mapper.UpgradePackageMapper;
import com.intest.packageservice.request.PartsTreeRequest;
import com.intest.packageservice.request.UpgradePackageRequest;
import com.intest.packageservice.request.VersionRequest;
import com.intest.packageservice.service.UpgradePackageService;
import com.intest.packageservice.vo.VersionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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

    @Autowired
    private PartsPackageBtoMapper partsPackageBtoMapper;

    @Autowired
    private PartsBtoMapper partsBtoMapper;

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
            example.createCriteria().andPartnumberLike(request.getQueryText());
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
            for(PartsBto bto : partsBtoList){
                PartsTreeBto partsTreeBto = new PartsTreeBto();
                partsTreeBto.setKey(bto.getPartsId());
                partsTreeBto.setTitle(bto.getPartsname());
                List<ChildNode> nodes = new ArrayList<>();
                for(PartsPackageBto partsPackageBto : partsPackageBtoList){
                    if(bto.getPartsId().equals(partsPackageBto.getFkPartsId())){
                        ChildNode node = new ChildNode();
                        node.setKey(partsPackageBto.getFkPartsId());
                        node.setTitle(partsPackageBto.getPartnumber());
                        nodes.add(node);
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
            //vo.setTargetVersion(bto.getTarget);
            //vo.setType(bto.getPackageType());
            list.add(vo);
        }
        return list;
    }
}
