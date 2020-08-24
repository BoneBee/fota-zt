package com.intest.common.result;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-13 11:48
 */
public class PagerDataBaseVO {

    /*
     * 分页总数
     *
     */
    private long Total;

    /*
     * 查询数据
     *
     */
    private List<?> Data;

    @JsonProperty("total")
    public long getTotal() {
        return this.Total;
    }

    public void setTotal(long value) {
        this.Total = value;
    }

    @JsonProperty("data")
    public List<?> getData() {
        return this.Data;
    }

    public void setData(List<?> value) {
        this.Data = value;
    }
}
