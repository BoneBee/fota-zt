package com.intest.api.controller;

import com.intest.common.result.ResultT;
import com.intest.common.util.FtpClientUtil;
import com.intest.common.util.MultiDownloadUtil;
import com.intest.common.webcore.BaseController;
import com.intest.dao.entity.FileBto;
import com.intest.dao.entity.PartsUpgradePackageBto;
import com.intest.dao.entity.PartsUpgradePackageBtoExample;
import com.intest.dao.entity.UpgradePackageFileinfoBto;
import com.intest.dao.mapper.PartsUpgradePackageBtoMapper;
import com.intest.dao.mapper.UpgradePackageFileinfoBtoMapper;
import com.intest.packageservice.request.*;
import com.intest.packageservice.service.UpgradePackageService;
import com.intest.util.ModelName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class UpgradePackageController extends BaseController {
    @Autowired
    private UpgradePackageService upgradePackageService;

    @Autowired
    private PartsUpgradePackageBtoMapper partsUpgradePackageBtoMapper;

    @Autowired
    private UpgradePackageFileinfoBtoMapper upgradePackageFileinfoBtoMapper;

    @ApiOperation("升级包列表")
    @PostMapping("/list")
    public ResultT findAllUpgradePackage(UpgradePackageRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.findAllUpgradePackage(request));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("升级包制作-零件树")
    @PostMapping("/partstree")
    public ResultT partsTree(@RequestBody PartsTreeRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.partsTree(request));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("升级包制作-版本列表")
    @PostMapping("/versionlist")
    public ResultT versionList(@RequestBody VersionRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.getVersion(request));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("升级包制作")
    @PostMapping("/make")
    public ResultT make(@RequestBody MakeRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.make(request));
            addOperateLog(ModelName.MODEL_UPDATE_FILE, ModelName.ACTION_CREATE,ModelName.actionRemark("升级包制作", getAccount().getRealName(), 1));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("取消发布")
    @PostMapping("/unpublish")
    public ResultT unpublish(@RequestBody UpgradePackageDetailRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.unpublish(request.getPackageTaskId()));
            addOperateLog(ModelName.MODEL_UPDATE_FILE, ModelName.ACTION_UPDATE_FILE_CANCLE,ModelName.actionRemark("取消发布", getAccount().getRealName(), 1));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("升级包详情/升级包描述")
    @PostMapping("/describe")
    public ResultT upgradePackageDetails(@RequestBody UpgradePackageDetailRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.upgradePackageDesc(request.getPackageTaskId()));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("升级包详情/升级零件")
    @PostMapping("/parts")
    public ResultT getParts(@RequestBody UpgradePackageDetailRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.getParts(request.getPackageTaskId()));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("升级包详情/升级包信息")
    @PostMapping("/info")
    public ResultT getUpgradePackage(@RequestBody UpgradePackageDetailRequest request){
        ResultT result = new ResultT();
        try{
            result.setResult(upgradePackageService.getUpgradePackage(request.getPackageTaskId()));
        }catch (Exception e){
            e.printStackTrace();
            result.setFail();
        }
        return result;
    }

    @ApiOperation("下载")
    @GetMapping("/download")
    public void download(@RequestParam("packageTaskId") String packageTaskId, HttpServletRequest request, HttpServletResponse response){
        List<File> files = new ArrayList<>();
        PartsUpgradePackageBtoExample example = new PartsUpgradePackageBtoExample();
        example.createCriteria().andFkPackagetaskIdEqualTo(packageTaskId);
        List<PartsUpgradePackageBto> list = partsUpgradePackageBtoMapper.selectByExample(example);
        String localPath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "download";

        for(PartsUpgradePackageBto bto : list){
            UpgradePackageFileinfoBto fi = upgradePackageFileinfoBtoMapper.selectByPrimaryKey(bto.getFkUpgradepackagefileinfoId());
            try {
                String fileName = fi.getFilename().substring(fi.getFilename().lastIndexOf("/") + 1);
                FtpClientUtil.downloadFile(fileName, localPath);
                File file = new File(localPath + File.separator + fileName);
                if(file.exists()){
                    files.add(file);
                }
                fi = upgradePackageFileinfoBtoMapper.selectByPrimaryKey(bto.getFkUpgradepackagefileinfoIdB());
                fileName = fi.getFilename().substring(fi.getFilename().lastIndexOf("/") + 1);
                FtpClientUtil.downloadFile(fileName, localPath);
                file = new File(localPath + File.separator + fileName);
                if(file.exists()){
                    files.add(file);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        MultiDownloadUtil.zipd(localPath + File.separator + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".zip", files, response);
    }
}
