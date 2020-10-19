package com.intest.systemservice.response;


import java.util.List;

public class SystemMenuResponse {
    private String key;
    private int type;
    private int check;
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

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
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
