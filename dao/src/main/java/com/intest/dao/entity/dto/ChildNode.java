package com.intest.dao.entity.dto;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 17:07
 */
public class ChildNode {
    /**
     * 零件包ID
     */
    private String key;
    /**
     * 零件号
     */
    private String title;
    /**
     * 是否叶子节点
     * 默认值 true
     */
    private Boolean isLeaf = true;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getLeaf() {
        return isLeaf;
    }

    public void setLeaf(Boolean leaf) {
        isLeaf = leaf;
    }
}
