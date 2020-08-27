package com.intest.packageparser.file;

import lombok.Data;

import java.util.List;

@Data
public class LargeZipResult {
    /**
     * 原始包编号
     */
    private String largeZipId;
    /**
     * 对应的文件信息ID
     */
    private String fileId;
    /**
     * 原始包名称
     */
    private String largeZipName;
    /**
     * 是否解析成功
     * true:成功
     * false:失败
     */
    private boolean success = true;
    /**
     * 错误提示信息集合
     */
    private List<String> errors;
    /**
     * 控制器包集合
     */
    private List<ZipResult> zipResults;
    /**
     * 车型编号
     */
    private String carTypeId;
}
