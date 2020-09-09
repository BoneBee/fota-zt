package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：升级包详情请求实体
 * @date ：2020/9/9 14:23
 */
public class UpgradePackageDetailRequest {
    /**
     * 升级包制作任务ID
     */
    private String packageTaskId;

    public String getPackageTaskId() {
        return packageTaskId;
    }

    public void setPackageTaskId(String packageTaskId) {
        this.packageTaskId = packageTaskId;
    }
}
