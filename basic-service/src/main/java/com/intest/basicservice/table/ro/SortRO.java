package com.intest.basicservice.table.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhanghui
 * @create 2020-08-13 11:22
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
