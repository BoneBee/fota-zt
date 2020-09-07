package com.intest.api.controller;

import com.intest.common.result.ResultT;
import com.intest.common.util.MultiDownloadUtil;
import com.intest.dao.entity.CarTypeExtendBto;
import com.intest.dao.entity.FileBto;
import com.intest.dao.entity.FileInfo;
import com.intest.packageparser.file.FileParser;
import com.intest.packageservice.request.PackageDeleteRequest;
import com.intest.packageservice.request.PackageParseRequest;
import com.intest.packageservice.request.PackageRequest;
import com.intest.packageservice.service.LargePackageService;
import com.intest.packageservice.vo.PackageCheckRequest;
import com.intest.packageservice.vo.PackageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 原始包相关API接口
 * @author : intest
 */
@Api(tags = {"版本管理/原始包"})
@RequestMapping("/api")
@RestController
public class PackageController {

    private static Logger logger = LoggerFactory.getLogger(PackageController.class);
    @Autowired
    private LargePackageService largePackageService;

    @Autowired
    private FileParser fileParser;

    @ApiOperation("检查该车型下是否存在同名原始包")
    @RequestMapping(value = "/package/exist", method = RequestMethod.POST)
    public ResultT<Boolean> checkLargePackage(@RequestBody PackageCheckRequest request){
        ResultT<Boolean> result = new ResultT<>();
        result.setResult(largePackageService.checkParentFileName(request));
        return result;
    }

    @ApiOperation("原始包列表")
    @RequestMapping(value = "/package/list", method = RequestMethod.POST)
    public ResultT findAllLargePackage(@RequestBody PackageRequest request){
        ResultT result = new ResultT();
        result.setResult(largePackageService.findAllLargePackage(request));
        return result;
    }

    @ApiOperation("车型下拉框")
    @RequestMapping(value = "/package/cartypecombo", method = RequestMethod.POST)
    public ResultT<List<CarTypeExtendBto>> findAllCarType(){
        ResultT<List<CarTypeExtendBto>> result = new ResultT<>();
        result.setResult(largePackageService.findAllCarType());
        return result;
    }

    @ApiOperation("删除原始包")
    @Transactional
    @RequestMapping(value = "/package/delete", method = RequestMethod.POST)
    public ResultT deletePackage(@RequestBody PackageDeleteRequest request){
        ResultT result = new ResultT();
        result.setSuccess(largePackageService.deletePackage(request.getIds()));
        return result;
    }

    @ApiOperation("原始包详情")
    @RequestMapping(value = "/package/details", method = RequestMethod.POST)
    public ResultT<PackageVO> packageDetails(@RequestBody Map<String, String> params){
        ResultT<PackageVO> result = new ResultT<>();
        result.setResult(largePackageService.packageDetails(params.get("packageId")));
        return result;
    }

    @ApiOperation("原始包解析")
    @RequestMapping(value = "/package/parse", method = RequestMethod.POST)
    public ResultT<List<String>> parseFile(@RequestBody PackageParseRequest request) {
        ResultT<List<String>> result = new ResultT();
        fileParser.parseFile(request.getFileId(), request.getCarTypeId());
        int success = FileParser.largeZipResult.isSuccess() ? 1 : -1;
        result.setSuccess(success);
        result.setResult(FileParser.largeZipResult.getErrors());
        return result;
    }

    @ApiOperation("原始包解析结果保存")
    @Transactional
    @RequestMapping(value = "/package/save", method = RequestMethod.POST)
    public ResultT save(){
        ResultT result = new ResultT();
        fileParser.saveToDb(result);
        return result;
    }

    @ApiOperation("原始包下载")
    @RequestMapping(value = "/package/download", method = RequestMethod.GET)
    public void download(@RequestParam("ids") String[] ids, HttpServletRequest request, HttpServletResponse response){
        List<File> files = new ArrayList<>();
        for(String id : ids){
            FileBto fi = largePackageService.getFileById(id);
            if(fi == null){
                continue;
            }
            String fullPath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "packageFile" + File.separator + fi.getServersidepath();
            File file = new File(fullPath);
            if(file.exists()){
                files.add(file);
            }
        }
        if(files.size() >= 1){
            String zipTmp = File.separator + "tmp" + File.separator + "webhost" + File.separator +"download" + File.separator + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".zip";
            MultiDownloadUtil.zipd(zipTmp, files, response);
        }
//        FileInfo fi = largePackageService.getFileById(ids[0]);
//        String fullPath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "packageFile" + File.separator + fi.getServerSidePath();
//        File file = new File(fullPath);
//
//        ServletContext context = request.getServletContext();
//
//        String mimeType = context.getMimeType(fullPath);
//        if(mimeType == null){
//            mimeType = "application/octet-stream";
//            System.out.println("context getMimeType is null");
//        }
//        System.out.println("MIME type: " + mimeType);
//
//        response.setContentType(mimeType);
//        response.setContentLength((int)file.length());
//
//        String headerKey = "Content-Disposition";
//        String headerValue = String.format("attachment; filename=\"%s\"", file.getName());
//        response.setHeader(headerKey, headerValue);
//
//        try{
//            InputStream stream = new FileInputStream(fullPath);
//            IOUtils.copy(stream, response.getOutputStream());
//            response.flushBuffer();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}