package com.intest.packageservice.request;

/**
 * @author ：intest
 * @description：零件树请求实体
 * @date ：2020/9/4 10:36
 */
public class PartsTreeRequest {
    /**
     * 车型ID
     */
    private String carTypeId;
    /**
     * 搜索内容
     */
    private String queryText;

    public String getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(String carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }
}
