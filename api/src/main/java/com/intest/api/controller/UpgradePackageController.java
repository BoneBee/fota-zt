package com.intest.api.controller;

import com.intest.common.result.ResultT;
import com.intest.packageservice.request.PartsTreeRequest;
import com.intest.packageservice.request.UpgradePackageRequest;
import com.intest.packageservice.request.VersionRequest;
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
    public ResultT findAllUpgradePackage(UpgradePackageRequest request){
        ResultT result = new ResultT();
        result.setResult(upgradePackageService.findAllUpgradePackage(request));
        return result;
    }

    @ApiOperation("升级包制作-零件树")
    @PostMapping("/partstree")
    public ResultT partsTree(@RequestBody PartsTreeRequest request){
        ResultT result = new ResultT();
        result.setResult(upgradePackageService.partsTree(request));
        return result;
    }

    @ApiOperation("升级包制作-版本列表")
    @PostMapping("/versionlist")
    public ResultT versionList(@RequestBody VersionRequest request){
        ResultT result = new ResultT();
        result.setResult(upgradePackageService.getVersion(request));
        return result;
    }
}
