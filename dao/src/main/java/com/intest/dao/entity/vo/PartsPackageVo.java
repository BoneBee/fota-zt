package com.intest.dao.entity.vo;

import lombok.Data;

/**
 * @author ：intest
 * @description：零件包查询请求实体
 * @date ：2020/8/26 15:15
 */
@Data
public class PartsPackageVo extends PageBase {
    /**
     * 零件包名称
     */
    private String partsPackageName;
    /**
     * 原始包名称
     */
    private String packageName;
    /**
     * 车型名称
     */
    private String carTypeName;
    /**
     * 零件简称
     */
    private String partsName;
    /**
     * 零件类型
     */
    private String partsTypeName;
}
