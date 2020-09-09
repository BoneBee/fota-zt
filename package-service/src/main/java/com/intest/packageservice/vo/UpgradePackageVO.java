package com.intest.packageservice.vo;

/**
 * @author ：intest
 * @description：升级包实体
 * @date ：2020/9/9 10:58
 */
public class UpgradePackageVO {
    /**
     * 升级包名称
     */
    private String packageName;
    /**
     * 包类型
     * 0-备份包，1-升级包
     */
    private int type;
    /**
     * 包大小
     */
    private Float size;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }
}
