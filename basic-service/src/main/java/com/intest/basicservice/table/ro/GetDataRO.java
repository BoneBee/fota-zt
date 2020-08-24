package com.intest.basicservice.table.ro;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intest.basicservice.table.ro.QueryWhereRO;
import com.intest.basicservice.table.ro.SortRO;

import javax.swing.*;

/**
 * @author zhanghui
 * @create 2020-08-13 11:19
 */
public class GetDataRO {

    /*
     * 表格的主键
     */
    @JsonProperty("tableId")
    private String TableId;

    /*
     * 页码
     */
    @JsonProperty("pi")
    private int Pi;

    /*
     * 每页大小
     */

    @JsonProperty("ps")
    private int Ps;

    /*
     * 排序
     */
    @JsonProperty("sortOrder")
    private SortRO SortOrder;

    /*
     * 顺序
     */
    @JsonProperty("queryWhere")
    private QueryWhereRO QueryWhere;

    /*
     * 全文搜索
     */
    @JsonProperty("fullTextSearch")
    private String FullTextSearch;

    public String getTableId() {
        return this.TableId;
    }

    public int getPi() {
        return this.Pi;
    }

    public int getPs() {
        return this.Ps;
    }

    public SortRO getSortOrder() {
        return this.SortOrder;
    }

    public QueryWhereRO getQueryWhere() {
        return this.QueryWhere;
    }

    public String getFullTextSearch() {
        return this.FullTextSearch;
    }
}
