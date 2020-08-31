package com.intest.dao.entity.vo;

/**
 * @author ：intest
 * @description：零件包查询请求实体
 * @date ：2020/8/26 15:15
 */
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

    public String getPartsPackageName() {
        return partsPackageName;
    }

    public void setPartsPackageName(String partsPackageName) {
        this.partsPackageName = partsPackageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public String getPartsTypeName() {
        return partsTypeName;
    }

    public void setPartsTypeName(String partsTypeName) {
        this.partsTypeName = partsTypeName;
    }
}
