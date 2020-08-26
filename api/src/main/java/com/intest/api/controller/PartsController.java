package com.intest.api.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.exception.CustomException;
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
import com.intest.partsservice.part.response.DateResponse;
import com.intest.partsservice.part.response.PartsTypeResponse;
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
     * @param pi
     * @param ps
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/getPartsTypeList", method = RequestMethod.GET)
    public ResponseBean getPartsTypeList(@ApiParam(defaultValue = "1") int pi, @ApiParam(defaultValue = "10") int ps) {
        if (pi <= 0 || ps <= 0) {
            pi = 1;
            ps = 10;
        }
        PageHelper.startPage(pi, ps);
        List<PartsTypeBto> partsTypeBtoList = partsTypeImpl.getPartsTypeList();
        if (partsTypeBtoList == null || partsTypeBtoList.size() <= 0) {
            return new ResponseBean(1, "查询成功", null);
        }
        List<PartsTypeResponse> partsTypeResponseList = new ArrayList<>();
        for (PartsTypeBto partsTypeBto : partsTypeBtoList) {
            PartsTypeResponse partsTypeResponse = new PartsTypeResponse(partsTypeBto.getPartstypename(), partsTypeBto.getRemark(), partsTypeBto.getCreateat(), partsTypeBto.getCreateby(), partsTypeBto.getUpdateat(), partsTypeBto.getUpdateby());
            partsTypeResponseList.add(partsTypeResponse);
        }
        PageInfo<PartsTypeResponse> pageInfo = new PageInfo<PartsTypeResponse>(partsTypeResponseList);
        Map<String, Object> result = new HashMap<String, Object>(16);
        result.put("count", pageInfo.getTotal());
        result.put("data", pageInfo.getList());
        return new ResponseBean(1, "获取成功", result);
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
        partsConfigBto.setCreateat(new Date());
        partsConfigBto.setCreateby("admin");
        if (partsConfigImpl.addParts(partsConfigBto) != 1) {
            throw new CustomException("新增零部件策略配置信息失败");
        }
        return new ResponseBean(1, "新增成功", null);

    }

    /**
     * 新增零部件信息管理
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/part/updatePartMessage", method = RequestMethod.GET)
    public ResponseBean updatePartMessage(@ApiParam String partsName, @ApiParam String fullName, @ApiParam String partsType, @ApiParam String remark) {
        if (!StringUtils.isNotEmptyStr(partsName) || !StringUtils.isNotEmptyStr(fullName) || !StringUtils.isNotEmptyStr(partsType)) {
            throw new CustomException("partsName、fullName、partsType不能为空");
        }
        return null;


    }


}
