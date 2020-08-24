package com.intest.basicservice.uploadfile.impl;

import cn.hutool.core.net.multipart.UploadFile;
import com.intest.basicservice.uploadfile.UploadFileService;
import com.intest.basicservice.uploadfile.ro.ChunkFileRO;
import com.intest.basicservice.uploadfile.ro.PreUploadFileRO;
import com.intest.basicservice.uploadfile.utils.FileComparator;
import com.intest.basicservice.uploadfile.vo.CheckUploadFileVO;
import com.intest.basicservice.uploadfile.vo.ChunkFileVO;
import com.intest.dao.entity.UploadFileBto;
import com.intest.dao.entity.UploadFileBtoExample;
import com.intest.dao.mapper.UploadFileBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author zhanghui
 * @create 2020-08-10 15:33
 */
@Component
public class UploadFileServiceImpl implements UploadFileService {

    @Autowired
    private UploadFileBtoMapper uploadFileDao;

    @Value("${upload-file.path-string}")
    private String path;

    @Override
    public CheckUploadFileVO CheckUploadFile(PreUploadFileRO model) {
        CheckUploadFileVO result = new CheckUploadFileVO();

        UploadFileBto uploadFile = new UploadFileBto();
        uploadFile.setFilesize(model.getSize());
        uploadFile.setOriginalname(model.getOriginalName());
        uploadFile.setLastmodifieddate(model.getLastModifiedDate());

        UploadFileBtoExample example = new UploadFileBtoExample();
        UploadFileBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFilesizeEqualTo(model.getSize());
        criteria.andOriginalnameEqualTo(model.getOriginalName());
        criteria.andLastmodifieddateEqualTo(model.getLastModifiedDate());

        List<UploadFileBto> list = uploadFileDao.selectByExample(example);

        // 未匹配到续传的文件
        if (list.isEmpty()) {
            uploadFile.setUploadfileId(UUID.randomUUID().toString());
            uploadFile.setCreateby("A7B3CC45-ED81-421D-A2C8-3CBD9036AE5A");
            result.setFileId(uploadFile.getUploadfileId());
            result.setUploadKind(model.getUploadType());
            uploadFileDao.insert(uploadFile);

            List<Integer> emptyArray = new ArrayList<>();
            result.setChunkDone(emptyArray);
        } else {
            // 已找到可续传文件
            UploadFileBto uploadFile1 = list.get(0);
            result.setFileId(uploadFile1.getUploadfileId());
            File file = new File(path + uploadFile1.getUploadfileId() + "/");
            List<Integer> chunkFiles = new ArrayList<>();
            if (file.isDirectory()) {
                System.out.println("Directory found:" + file.getName());
                int blockSize = FileBlockSize(model.getSize());
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    long fileSize = files[i].length();
                    chunkFiles.add(Integer.valueOf(files[i].getName()));
                }
                result.setChunkDone(chunkFiles);
                System.out.println(chunkFiles.toString());
            } else {
                List<Integer> emptyArray = new ArrayList<>();
                result.setChunkDone(emptyArray);
            }
        }
        return result;
    }

    private int FileBlockSize(long size) {
        return new Double(Math.ceil(size / (4 * 1024 * 1024))).intValue();
    }

    @Override
    public ChunkFileVO ChunkFileUpload(ChunkFileRO model) {
        return null;
    }

    @Override
    public Boolean CompleteFileUpload(String fileId) {
        Boolean result = true;
        try {
            File file = new File(path + fileId);

            if (file.isDirectory()) {

                FileFilter filter = new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.isFile();
                    }
                };

                File[] files = file.listFiles(filter);
                Arrays.sort(files, new FileComparator());
                UploadFileBto uploadFile = uploadFileDao.selectByPrimaryKey(fileId);
                String extension = uploadFile.getOriginalname().substring(uploadFile.getOriginalname().indexOf("."));
                String newPath = path + fileId + extension;
                MergeFiles(files, newPath);

                UploadFileBto uploadFile1 = new UploadFileBto();
                uploadFile1.setUpdateby("A7B3CC45-ED81-421D-A2C8-3CBD9036AE5A");

                UploadFileBtoExample example = new UploadFileBtoExample();
                UploadFileBtoExample.Criteria criteria = example.createCriteria();
                criteria.andUploadfileIdEqualTo(fileId);

                File newFile = new File(newPath);
                if (uploadFile.getFilesize().longValue() != newFile.length()) {
                    uploadFile1.setUploadedsuccess((short)2);
                    uploadFileDao.updateByExample(uploadFile1, example);
                    result = false;
                } else {
                    uploadFile1.setUploadedsuccess((short) 1);
                    uploadFileDao.updateByExample(uploadFile1, example);
                }
            }
        } catch (Exception ex) {
            result = false;
        }
        return result;
    }

    private boolean MergeFiles(File[] files, String resultPath) {
        if (files == null || files.length < 1) {
            return false;
        }
        if (files.length == 1) {
            return files[0].renameTo(new File(resultPath));
        }

        File resultFile = new File(resultPath);

        try {
            FileChannel resultFileChannel = new FileOutputStream(resultFile, true).getChannel();
            for (int i = 0; i < files.length; i++) {
                FileChannel blk = new FileInputStream(files[i]).getChannel();
                resultFileChannel.transferFrom(blk, resultFileChannel.size(), blk.size());
                blk.close();
            }
            resultFileChannel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        for (int i = 0; i < files.length; i++) {
            files[i].delete();
        }
        return true;
    }
}
