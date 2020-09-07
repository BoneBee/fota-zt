package com.intest.api.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.basicservice.table.util.CheckPwd;
import com.intest.common.exception.CustomException;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.util.StringUtils;
import com.intest.dao.entity.PartsBto;
import com.intest.dao.entity.PartsConfigBto;
import com.intest.dao.entity.PartsTypeBto;
import com.intest.partsservice.part.impl.service.impl.PartsConfigImpl;
import com.intest.partsservice.part.impl.service.impl.PartsImpl;
import com.intest.partsservice.part.impl.service.impl.PartsTypeImpl;
import com.intest.partsservice.part.request.PartsMessageRequest;
import com.intest.partsservice.part.request.PartsTypeRequest;

import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import com.intest.partsservice.part.response.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@Api(tags = {"零部件管理"})
public class PartsController {

    @Autowired
    PartsTypeImpl partsTypeImpl;

    @Autowired
    PartsImpl partsImpl;

    @Autowired
    PartsConfigImpl partsConfigImpl;

    /**
     * 新增零部件类型
     *
     * @param partsTypeRequest
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/addPartsType", method = RequestMethod.POST)
    public ResponseBean addPartsType(@RequestBody PartsTypeRequest partsTypeRequest) {
        ValidateHelper.validateNull(partsTypeRequest, new String[]{"partsTypeName"});
        PartsTypeBto partsTypeBto = partsTypeImpl.getPartsTypeByName(partsTypeRequest.getPartsTypeName());
        if (partsTypeBto != null) {
            throw new CustomException("PartsTypeName已经存在！");
        } else {
            partsTypeBto = new PartsTypeBto();
            partsTypeBto.setPartstypeId(UUID.randomUUID() + "");
            partsTypeBto.setPartstypename(partsTypeRequest.getPartsTypeName());
            partsTypeBto.setRemark(partsTypeRequest.getRemark());
            partsTypeBto.setIsdelete((short) 1);
            partsTypeBto.setCreateat(new Date());
            partsTypeBto.setCreateby("admin");
            if (partsTypeImpl.addPartsType(partsTypeBto) != 1) {
                throw new CustomException("新增零部件类型失败！");
            }
            return new ResponseBean(1, "新增成功", null);
        }
    }

    /**
     * 编辑（修改）零部件类型
     *
     * @param partsTypeName
     * @param remark
     * @param partsTypeId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/updatePartsType", method = RequestMethod.GET)
    public ResponseBean updatePartsType(@ApiParam String partsTypeName, @ApiParam String remark, @ApiParam String partsTypeId) {
        if (!StringUtils.isNotEmptyStr(partsTypeName) || !StringUtils.isNotEmptyStr(partsTypeId)) {
            throw new CustomException("partsTypeName、partsTypeId不能为空");
        }
        PartsTypeBto partsTypeBto = partsTypeImpl.getPartsTypeById(partsTypeId);
        if (partsTypeBto == null) {
            throw new CustomException("未找到对应零部件类型");
        } else {
            partsTypeBto.setPartstypename(partsTypeName);
            partsTypeBto.setRemark(remark);
            if (partsTypeImpl.updatePartsType(partsTypeBto) != 1) {
                throw new CustomException("修改零部件类型失败！");
            }
            return new ResponseBean(1, "修改成功", null);
        }
    }

    /**
     * 删除零部件类型
     *
     * @param partsTypeId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/deletePartsType", method = RequestMethod.GET)
    public ResponseBean deletePartsType(@ApiParam String partsTypeId) {
        if (!StringUtils.isNotEmptyStr(partsTypeId)) {
            throw new CustomException("partsTypeId不能为空");
        }
        PartsTypeBto partsTypeBto = partsTypeImpl.getPartsTypeById(partsTypeId);
        if (partsTypeBto == null) {
            throw new CustomException("未找到对应零部件类型");
        } else {
            if (partsTypeImpl.deletePartsType(partsTypeId) != 1) {
                throw new CustomException("删除零部件类型失败！");
            }
            return new ResponseBean(1, "删除成功", null);
        }
    }

    /**
     * 零部件名称检测接
     *
     * @param partsTypeName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/selectPartsType", method = RequestMethod.GET)
    public ResponseBean selectPartsType(@ApiParam String partsTypeName) {
        if (!StringUtils.isNotEmptyStr(partsTypeName)) {
            throw new CustomException("partsTypeName不能为空");
        }
        PartsTypeBto partsTypeBto = partsTypeImpl.getPartsTypeByName(partsTypeName);
        if (partsTypeBto == null) {
            return new ResponseBean(1, "该partsTypeName不存在", new DateResponse(0));
        } else {
            return new ResponseBean(1, "该partsTypeName已存在", new DateResponse(1));
        }
    }

    /**
     * 获取零部件类型列表
     *
     * @return
     */
    public PagerDataBaseVO getPartsTypeList() {
        return partsTypeImpl.getPartTypeInfo(new PartTypePage());
    }


    /**
     * 新增零部件信息管理
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/addPartMessage", method = RequestMethod.POST)
    public ResponseBean addPartMessage(@RequestBody PartsMessageRequest partsMessageRequest) {
        ValidateHelper.validateNull(partsMessageRequest, new String[]{"partsName", "fullName", "partsType"});
        if (partsMessageRequest.getPartsName().length() > 3 || !CheckPwd.checkUpperCase(partsMessageRequest.getPartsName())) {
            throw new CustomException("零件简称不合法");
        }
        if (partsMessageRequest.getFullName().length() > 20) {
            throw new CustomException("零件全称长度超过上限");
        }
        PartsBto partsBto = partsImpl.getPartsByFullName(partsMessageRequest.getFullName());
        PartsBto partsBto2 = partsImpl.getPartsByCode(partsMessageRequest.getPartsName());
        if (partsBto != null) {
            throw new CustomException("fullName已经存在");
        }
        if (partsBto2 != null) {
            throw new CustomException("partsName已经存在");
        }
        PartsBto saveParts = new PartsBto();
        saveParts.setPartsId(UUID.randomUUID() + "");
        saveParts.setPartsname(partsMessageRequest.getFullName());
        saveParts.setPartscode(partsMessageRequest.getPartsName());
        saveParts.setFkPartstypeId(partsMessageRequest.getPartsType());
        saveParts.setOrdernum((short) 1);
        saveParts.setIsdelete((short) 1);
        saveParts.setCreateat(new Date());
        saveParts.setCreateby("admin");
        saveParts.setRemark(partsMessageRequest.getRemark());
        if (partsImpl.addParts(saveParts) != 1) {
            throw new CustomException("新增零部件信息失败");
        }
        PartsConfigBto partsConfigBto = new PartsConfigBto();
        partsConfigBto.setPartsconfigId(UUID.randomUUID() + "");
        partsConfigBto.setFkPartsId(saveParts.getPartsId());
        partsConfigBto.setVoltagemodel((short)1);
        partsConfigBto.setCantype((short)1);
        partsConfigBto.setTravelstate((short)0);
        partsConfigBto.setGear((short)1);
        partsConfigBto.setOrdernum((short)1);
        partsConfigBto.setPreprogramme((short)1);
        partsConfigBto.setInprogramme((short)1);
        partsConfigBto.setSafetylevel((short)1);
        partsConfigBto.setAlgorithmmask("OTA");
        partsConfigBto.setDelay((short)1);
        partsConfigBto.setIsalignment((short)0);
        partsConfigBto.setAlignmentcompany((short)10);
        partsConfigBto.setEcuwaitresettime((short)5);
        partsConfigBto.setCreateat(new Date());
        partsConfigBto.setCreateby("admin");
        if (partsConfigImpl.addParts(partsConfigBto) != 1) {
            throw new CustomException("新增零部件策略配置信息失败");
        }
        return new ResponseBean(1, "新增成功", null);

    }

    /**
     * 修改零部件信息管理
     *
     * @param partsName
     * @param fullName
     * @param partsId
     * @param remark
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/updatePartMessage", method = RequestMethod.GET)
    public ResponseBean updatePartMessage(@ApiParam String partsTypeId, @ApiParam String partsName, @ApiParam String fullName, @ApiParam String partsId, @ApiParam String remark) {
        if (!StringUtils.isNotEmptyStr(partsName) || !StringUtils.isNotEmptyStr(fullName) || !StringUtils.isNotEmptyStr(partsId) || !StringUtils.isNotEmptyStr(partsTypeId)) {
            throw new CustomException("partsName、fullName、partsTypeId、partsId不能为空");
        }
        if (partsName.length() > 3 || !CheckPwd.checkUpperCase(partsName)) {
            throw new CustomException("零件简称不合法");
        }
        if (fullName.length() > 20) {
            throw new CustomException("零件全称长度超过上限");
        }
        PartsBto partsBto = partsImpl.getPartsById(partsId);
        if (partsBto == null) {
            throw new CustomException("未找到对应零部件信息");
        } else {
            partsBto.setPartsname(fullName);
            partsBto.setPartscode(partsName);
            partsBto.setFkPartstypeId(partsId);
            partsBto.setRemark(remark);
            if (partsImpl.updateParts(partsBto) != 1) {
                throw new CustomException("修改零部件信息失败");
            }
        }

        return new ResponseBean(1, "修改成功", null);
    }

    /**
     * 删除零部件信息管理
     *
     * @param partsId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/deletePartMessage", method = RequestMethod.GET)
    public ResponseBean deletePartMessage(@ApiParam String partsId) {
        if (!StringUtils.isNotEmptyStr(partsId)) {
            throw new CustomException("partsId不能为空");
        }
        if (partsImpl.deleteParts(partsId) != 1) {
            throw new CustomException("删除零部件信息失败");
        }
        return new ResponseBean(1, "删除成功", null);
    }

    /**
     * 获取零件信息管理列表
     *

     * @return
     */

    public PagerDataBaseVO getPartsMessageList() {
        return partsImpl.getPartInfo(new PartPage());
    }

    /**
     * 零件简称检测
     *
     * @param partsName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/selectPartsName", method = RequestMethod.GET)
    public ResponseBean selectPartsName(@ApiParam String partsName) {
        if (!StringUtils.isNotEmptyStr(partsName)) {
            throw new CustomException("partsName不能为空");
        }
        if (partsName.length() > 3 || !CheckPwd.checkUpperCase(partsName)) {
            return new ResponseBean(1, "零件简称不合法", new DateResponse(2));
        }
        PartsBto partsBto2 = partsImpl.getPartsByCode(partsName);
        if (partsBto2 != null) {
            return new ResponseBean(1, "该简称已存在", new DateResponse(1));
        }
        return new ResponseBean(1, "该简称不存在", new DateResponse(0));
    }

    /**
     * 零件全称检测
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/selectFullName", method = RequestMethod.GET)
    public ResponseBean selectFullName(@ApiParam String fullName) {
        if (!StringUtils.isNotEmptyStr(fullName)) {
            throw new CustomException("fullName不能为空");
        }
        if (fullName.length() > 20) {
            return new ResponseBean(1, "零件全称不合法", new DateResponse(2));
        }
        PartsBto partsBto = partsImpl.getPartsByFullName(fullName);
        if (partsBto != null) {
            return new ResponseBean(1, "该简称已存在", new DateResponse(1));
        }
        return new ResponseBean(1, "该简称不存在", new DateResponse(0));

    }

    /**
     * 获取零部件类型列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/getPartsType", method = RequestMethod.GET)
    public ResponseBean getPartsType() {
        List<PartsTypeBto> partsTypeBtoList = partsTypeImpl.getPartsTypeList();
        if (partsTypeBtoList == null || partsTypeBtoList.size() <= 0) {
            return new ResponseBean(1, "查询成功", null);
        }
        List<PartsTypeResponse> partsTypeListResponseList = new ArrayList<>();
        for (PartsTypeBto partsTypeBto : partsTypeBtoList) {
            PartsTypeResponse partsTypeListResponse = new PartsTypeResponse(partsTypeBto.getPartstypeId(), partsTypeBto.getPartstypename());
            partsTypeListResponseList.add(partsTypeListResponse);
        }
        return new ResponseBean(1, "获取成功", partsTypeListResponseList);
    }


}
