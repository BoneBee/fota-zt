package com.intest.dao.entity.dto;

import com.intest.dao.entity.ChildNode;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 15:02
 */
public class PartsTreeDto {
    /**
     * 零件ID
     */
    private String key;
    /**
     * 零件名称
     */
    private String title;
    /**
     * 子节点
     */
    private List<ChildNode> children;

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

    public List<ChildNode> getChildren() {
        return children;
    }

    public void setChildren(List<ChildNode> children) {
        this.children = children;
    }
}
