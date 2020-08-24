package com.intest.api.controller;

import com.intest.basicservice.part.impl.service.impl.PartsTypeImpl;
import com.intest.basicservice.part.request.PartsTypeRequest;

import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.table.config.helper.ValidateHelper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"零部件管理"})
public class PartsController {

    @Autowired
    PartsTypeImpl partsTypeImpl;


    @ResponseBody
    @RequestMapping(value = "/api/basic/part/addPartsType", method = RequestMethod.POST)
    public ResponseBean addPartsType(PartsTypeRequest partsTypeRequest) {
        ValidateHelper.validateNull(partsTypeRequest, new String[]{"PartsTypeName"});

        return null;

    }


}
