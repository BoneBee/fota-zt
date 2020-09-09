package com.intest.api.controller;

import com.intest.common.result.ResultT;
import com.intest.packageservice.request.PartsPackageRequest;
import com.intest.packageservice.service.PartsPackageService;
import com.intest.packageservice.vo.PartsPackageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 零件包相关API接口
 * @author : intest
 */
@Api(tags = {"版本管理/零件包"})
@RequestMapping("/api/partspackage")
@RestController
public class PartsPackageController {
    @Autowired
    private PartsPackageService partsPackageService;

    @ApiOperation("零件包列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ResultT partsPackageList(@RequestBody PartsPackageRequest request){
        ResultT result = new ResultT<>();
        try{
            result.setResult(partsPackageService.findAllPartsPackage(request));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("零件包详情")
    @RequestMapping(value = "/details", method = RequestMethod.POST)
    public ResultT<PartsPackageVO> partsPackageDetails(@RequestBody Map<String, String> params){
        ResultT<PartsPackageVO> result = new ResultT<>();
        try{
            result.setResult(partsPackageService.partsPackageDetails(params.get("partsPackageId")));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }
}
