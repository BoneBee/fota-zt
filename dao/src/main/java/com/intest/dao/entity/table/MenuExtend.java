package com.intest.dao.entity.table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class MenuExtend {
    private String key;
    @JsonIgnore
    private String parentId;
    private int type;
    private Boolean checked ;
    private String title;
    private List<MenuExtend> children;

    public MenuExtend() {
    }

    public MenuExtend(String key, String parentId, int type, Boolean checked, String title, List<MenuExtend> children) {
        this.key = key;
        this.parentId = parentId;
        this.type = type;
        this.checked = checked;
        this.title = title;
        this.children = children;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean isChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MenuExtend> getChildren() {
        return children;
    }

    public void setChildren(List<MenuExtend> children) {
        this.children = children;
    }
}
