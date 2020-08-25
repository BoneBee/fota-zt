package com.intest.common.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhanghui
 * @create 2020-08-24 14:13
 */
public class QueryWhereRO {
    /*
     * 字段
     *
     */
    @JsonProperty("fields")
    private String Fields;

    /*
     * 值
     *
     */
    @JsonProperty("value")
    private String Value;

    public String getFields() {
        return this.Fields;
    }

    public String getValue() {
        return this.Value;
    }
}
