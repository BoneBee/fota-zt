package com.intest.api.controller;

import com.intest.common.result.ResultT;
import com.intest.dao.entity.FileBto;
import com.intest.dao.entity.PartsBigPackageBto;
import com.intest.dao.entity.PartsPackageBto;
import com.intest.dao.entity.PartsPackageBtoExample;
import com.intest.dao.mapper.FileBtoMapper;
import com.intest.dao.mapper.PartsBigPackageBtoMapper;
import com.intest.dao.mapper.PartsPackageBtoMapper;
import com.intest.packageservice.request.PartsPackageRequest;
import com.intest.packageservice.service.PartsPackageService;
import com.intest.packageservice.vo.PartsPackageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

    @Autowired
    private PartsPackageBtoMapper partsPackageBtoMapper;

    @Autowired
    private PartsBigPackageBtoMapper partsBigPackageBtoMapper;

    @Autowired
    private FileBtoMapper fileBtoMapper;

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

    @ApiOperation("零件包下载")
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void download(@RequestParam("fileId") String fileId, HttpServletRequest request, HttpServletResponse response){
        PartsPackageBtoExample example = new PartsPackageBtoExample();
        example.createCriteria().andFkFileIdEqualTo(fileId);
        List<PartsPackageBto> list = partsPackageBtoMapper.selectByExample(example);
        PartsBigPackageBto bto = partsBigPackageBtoMapper.selectByPrimaryKey(list.get(0).getFkPartsbigpackageId());
        FileBto fi = fileBtoMapper.selectByPrimaryKey(fileId);

        if(fi == null){
            return;
        }
        String fullPath = File.separator + "tmp" + File.separator + "webhost" + File.separator + "packageFile" + File.separator + bto.getFkFileId() + File.separator + fi.getOriginalname() + ".zip";
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
        String headerValue = String.format("attachment; filename=\"%s\"", fi.getOriginalname() + ".zip");
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
