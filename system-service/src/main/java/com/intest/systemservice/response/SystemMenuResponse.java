package com.intest.systemservice.response;


import java.util.List;

public class SystemMenuResponse {
    private String key;
    private int type;
    private Boolean checked;
    private String title;
    private List<SystemMenuResponse> children;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public List<SystemMenuResponse> getChildren() {
        return children;
    }

    public void setChildren(List<SystemMenuResponse> children) {
        this.children = children;
    }
}
