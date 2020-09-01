package com.intest.api.controller;

import com.intest.common.result.ResultT;
import com.intest.packageservice.service.UpgradePackageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 升级包相关API接口
 * @author ：intest
 * @description：升级包相关API接口
 * @date ：2020/8/12 11:06
 */
@Api(tags = {"升级包管理/升级包"})
@RequestMapping("/api/upgradepackage")
@RestController
public class UpgradePackageController {
    @Autowired
    private UpgradePackageService upgradePackageService;

    @ApiOperation("升级包列表")
    @PostMapping("/list")
    public ResultT findAllUpgradePackage(){
        ResultT result = new ResultT();
        result.setResult(upgradePackageService.findAllUpgradePackage());
        return result;
    }

    @ApiOperation("升级包制作-零件树")
    @GetMapping("/partstree")
    public ResultT partsTree(@RequestParam("carTypeId") String carTypeId){
        ResultT result = new ResultT();
        result.setResult(upgradePackageService.partsTree(carTypeId));
        return result;
    }

    @ApiOperation("升级包制作-版本列表")
    @GetMapping("/versionlist")
    public ResultT versionList(String partsCode, String partsId){
        ResultT result = new ResultT();
        result.setResult(upgradePackageService.getVersion(partsCode, partsId));
        return result;
    }
}
