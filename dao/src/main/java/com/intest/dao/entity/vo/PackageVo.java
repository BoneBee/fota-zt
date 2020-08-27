package com.intest.dao.entity.vo;

import lombok.Data;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/14 10:32
 */
@Data
public class PackageVo extends PageBase {
    /**
     * 原始包名称
     */
    private String packageName;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 上传人
     */
    private String uploadUser;
}
