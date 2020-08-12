package com.intest.basicservice.uploadfile;

import com.intest.basicservice.uploadfile.ro.ChunkFileRO;
import com.intest.basicservice.uploadfile.ro.PreUploadFileRO;
import com.intest.basicservice.uploadfile.vo.CheckUploadFileVO;
import com.intest.basicservice.uploadfile.vo.ChunkFileVO;

/**
 * @author zhanghui
 * @create 2020-08-10 14:26
 */
public interface UploadFileService {

    CheckUploadFileVO CheckUploadFile(PreUploadFileRO model);

    ChunkFileVO ChunkFileUpload(ChunkFileRO model);

    Boolean CompleteFileUpload(String fileId);
}
