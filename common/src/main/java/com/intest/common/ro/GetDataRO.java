package com.intest.common.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.swing.*;
import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-24 14:12
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
    @JsonProperty("sort")
    private List<SortRO> Sort;

    /*
     * 顺序
     */
    @JsonProperty("queryWhere")
    private List<QueryWhereRO> QueryWhere;

    /*
     * 新增底层参数 查询任务车辆时使用
     */
    @JsonProperty("taskId")
    private String TaskId;


    /*
     * 全文搜索
     */
    @JsonProperty("fullTextSearch")
    private String FullTextSearch;

    public String getTableId() {
        return this.TableId;
    }


    public String getTaskId() {
        return this.TaskId;
    }


    public int getPi() {
        return this.Pi;
    }

    public int getPs() {
        return this.Ps;
    }

    public List<SortRO> getSort() {
        return this.Sort;
    }

    public List<QueryWhereRO> getQueryWhere() {
        return this.QueryWhere;
    }

    public String getFullTextSearch() {
        return this.FullTextSearch;
    }
}
