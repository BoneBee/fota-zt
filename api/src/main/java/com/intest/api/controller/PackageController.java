package com.intest.api.controller;

import com.intest.common.result.ResultT;
import com.intest.dao.entity.CarType;
import com.intest.dao.entity.FileInfo;
import com.intest.dao.entity.dto.PackageDto;
import com.intest.dao.entity.vo.PackageVo;
import com.intest.dao.entity.vo.ParserVo;
import com.intest.packageparser.file.FileParser;
import com.intest.packageservice.service.LargePackageService;
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

    @ApiOperation("检查该车型下是否存在同名原始包")
    @RequestMapping(value = "/package/exist", method = RequestMethod.GET)
    public ResultT<Boolean> checkLargePackage(@RequestParam("fileName") String fileName, @RequestParam("carTypeId") String carTypeId){
        ResultT<Boolean> result = new ResultT<>();
        result.setResult(largePackageService.checkParentFileName(fileName, carTypeId));
        return result;
    }

    @ApiOperation("原始包列表")
    @RequestMapping(value = "/package/list", method = RequestMethod.POST)
    public ResultT findAllLargePackage(@RequestBody PackageVo vo){
        ResultT result = new ResultT();
        result.setResult(largePackageService.findAllLargePackage(vo));
        return result;
    }

    @ApiOperation("车型下拉框")
    @RequestMapping(value = "/package/cartypecombo", method = RequestMethod.POST)
    public ResultT<List<CarType>> findAllCarType(){
        ResultT<List<CarType>> result = new ResultT<>();
        result.setResult(largePackageService.findAllCarType());
        return result;
    }

    @ApiOperation("删除原始包")
    @Transactional
    @RequestMapping(value = "/package/delete", method = RequestMethod.POST)
    public ResultT deletePackage(@RequestBody Map<String, String> params){
        ResultT result = new ResultT();
        result.setSuccess(largePackageService.deletePackage(params.get("packageId")));
        return result;
    }

    @ApiOperation("原始包详情")
    @RequestMapping(value = "/package/details", method = RequestMethod.POST)
    public ResultT<PackageDto> packageDetails(@RequestBody Map<String, String> params){
        ResultT<PackageDto> result = new ResultT<>();
        result.setResult(largePackageService.packageDetails(params.get("packageId")));
        return result;
    }

    @ApiOperation("原始包解析")
    @RequestMapping(value = "/package/parse", method = RequestMethod.POST)
    public ResultT<List<String>> parseFile(@RequestBody ParserVo vo) {
        ResultT<List<String>> result = new ResultT();
        //String filePath = "C:\\Users\\Peejacky2018\\Desktop\\包测试\\N60AB.zip";
        //String newPath = "C:\\Users\\Peejacky2018\\Desktop\\tmp";
        String filePath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "uploadFile" + File.separator + "N60AB.zip";
        String newPath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "uploadFile" + File.separator + "temp";
        // carTypeId : 53D4C2C5-1BD6-4512-B116-6EA854D1EEE6
        FileParser.parseFile(largePackageService, vo.getFileId(), vo.getCarTypeId());
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
        FileParser.saveToDb(largePackageService, result);
        return result;
    }

    @ApiOperation("原始包下载")
    @RequestMapping(value = "/package/download", method = RequestMethod.GET)
    public void download(@RequestParam("fileId") String fileId, HttpServletRequest request, HttpServletResponse response){
        FileInfo fi = largePackageService.getFileById(fileId);
        //String fullPath = "C:\\Users\\Peejacky2018\\Desktop\\包测试\\N60AB.zip";
        String fullPath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "packageFile" + File.separator + fi.getServerSidePath();
        File file = new File(fullPath);

        ServletContext context = request.getServletContext();

        String mimeType = context.getMimeType(fullPath);
        if(mimeType == null){
            mimeType = "application/octet-stream";
            System.out.println("context getMimeType is null");
        }
        System.out.println("MIME type: " + mimeType);

        response.setContentType(mimeType);
        response.setContentLength((int)file.length());

        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"", file.getName());
        response.setHeader(headerKey, headerValue);

        try{
            InputStream stream = new FileInputStream(fullPath);
            IOUtils.copy(stream, response.getOutputStream());
            response.flushBuffer();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}