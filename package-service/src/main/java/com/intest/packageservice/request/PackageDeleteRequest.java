package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/9/3 11:12
 */
public class PackageDeleteRequest {
    /**
     * 需要删除的原始包ID
     * 字符串数组
     */
    private String[] ids;

    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }
}
