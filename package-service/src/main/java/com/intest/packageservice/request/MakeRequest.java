package com.intest.packageservice.request;

import java.util.List;

/**
 * @author ：intest
 * @description：升级包制作请求实体
 * @date ：2020/9/7 9:19
 */
public class MakeRequest {
    /**
     * 升级包类型
     * 0-全量包，1-差分包，2-智能包
     */
    private int packageType;
    /**
     * 车型ID
     */
    private String carTypeId;
    /**
     * 升级包名称
     */
    private String packageName;
    /**
     * 描述标题
     */
    private String title;
    /**
     * 描述内容
     */
    private String content;
    /**
     * 零件
     */
    private List<PartsRequest> partsPackage;

    public int getPackageType() {
        return packageType;
    }

    public void setPackageType(int packageType) {
        this.packageType = packageType;
    }

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<PartsRequest> getPartsPackage() {
        return partsPackage;
    }

    public void setPartsPackage(List<PartsRequest> partsPackage) {
        this.partsPackage = partsPackage;
    }
}
