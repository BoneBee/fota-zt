package com.intest.common.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author zhanghui
 * @create 2020-08-14 13:22
 */
public class PagerBaseRO {

    /*
     * 页码
     */
    private int Pi;

    /*
     * 每页大小
     */
    private int Ps;

    /*
     * 排序
     */
    private String Sort;

    /*
     * 全文搜索
     */
    private String FullTextSearch;

    /*
     * 页码
     */
    public int getPi() {
        return this.Pi;
    }

    /*
     * 每页大小
     */
    public int getPs() {
        return this.Ps;
    }

    /*
     * 排序
     */
    public String getSort() {
        return this.Sort;
    }

    /*
     * 全文搜索
     */
    public String getFullTextSearch(){
        return this.FullTextSearch;
    }
}
