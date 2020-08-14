package com.intest.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intest.basicservice.uploadfile.UploadFileService;
import com.intest.basicservice.uploadfile.ro.ChunkFileRO;
import com.intest.basicservice.uploadfile.ro.PreUploadFileRO;
import com.intest.basicservice.uploadfile.vo.CheckUploadFileVO;
import com.intest.basicservice.uploadfile.vo.ChunkFileVO;
import com.intest.basicservice.uploadfile.vo.CompleteVO;
import com.intest.common.result.ResultT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zhanghui
 * @create 2020-08-11 21:39
 * basic-service 文件上传
 */
@RestController
public class UploadFileController {

    @Autowired
    UploadFileService uploadFileService;

    /**
     * create by: zhanghui
     * description: 文件上传前请求数据
     * create time: 2020/8/11 22:32
     *
     * @param model
     * @return com.intest.common.result.ResultT<com.intest.basicservice.uploadfile.vo.CheckUploadFileVO>
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/upload/preUploadFile", method = RequestMethod.POST)
    public ResultT<CheckUploadFileVO> PreUploadFile(@RequestBody PreUploadFileRO model) {

        ResultT<CheckUploadFileVO> result = new ResultT<CheckUploadFileVO>();
        try {
            CheckUploadFileVO vo = uploadFileService.CheckUploadFile(model);
            result.setResult(vo);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return result;
    }

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Value("${upload-file.path-string}")
    private String path;

    /**
     * create by: zhanghui
     * description: 分块上传文件
     * create time: 2020/8/11 22:32
     *
     * @param file
     * @param model
     * @return com.intest.common.result.ResultT<com.intest.basicservice.uploadfile.vo.ChunkFileVO>
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/upload/chunkFileUpload", method = RequestMethod.POST)
    public ResultT<ChunkFileVO> ChunkUploadFile(@RequestParam(value = "file") MultipartFile file, @RequestParam(value = "model") String model) throws IOException {

        if (file.isEmpty()) {
            System.out.println("上传文件为空");
        }
        ResultT<ChunkFileVO> vo = new ResultT<ChunkFileVO>();
        vo.setResult(new ChunkFileVO());
        ChunkFileRO chunkFile = null;
        try {
            chunkFile = objectMapper.readValue(model, ChunkFileRO.class);
            String fileName = String.valueOf(chunkFile.getChunkIndex());

            String pathString = path + "/" + chunkFile.getFileId();
            File dir = new File(pathString);
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("UploadFile文件目录不存在：" + pathString);
            }
            byte[] bytes = file.getBytes();
            BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File(pathString + "/" + fileName)));
            buffStream.write(bytes);
            buffStream.close();
        } catch (Exception ex) {
            System.out.println(ex);
            vo.setFail();
            vo.getResult().setMsg(ex.getMessage());
        }

        vo.getResult().setChunkIndex(chunkFile.getChunkIndex());
        return vo;
    }

    /**
     * create by: zhanghui
     * description: 文件上传完成调用接口
     * create time: 2020/8/11 22:32
     *
     * @param model
     * @return com.intest.common.result.ResultT<com.intest.basicservice.uploadfile.vo.CompleteVO>
     */
    @ResponseBody
    @RequestMapping(value = "/api/basic/upload/completeFileUpload", method = RequestMethod.GET)
    public ResultT<CompleteVO> CompleteFileUpload(CompleteVO model) {

        ResultT<CompleteVO> result = new ResultT<CompleteVO>();
        try {
            boolean value = uploadFileService.CompleteFileUpload(model.getFileId());
            if (!value) {
                result.setFail();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return result;
    }
}
