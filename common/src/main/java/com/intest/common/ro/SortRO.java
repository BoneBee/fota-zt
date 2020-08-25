package com.intest.common.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhanghui
 * @create 2020-08-24 14:14
 */
public class SortRO {
    /*
     * 顺序
     * ascend/descend/null
     */
    @JsonProperty("sortOrder")
    private String SortOrder;

    /*
     * 字段名称
     *
     */
    @JsonProperty("dataPropertyName")
    private String DataPropertyName;

    public String getSortOrder() {
        return this.SortOrder;
    }

    public String getDataPropertyName() {
        return this.DataPropertyName;
    }
}
