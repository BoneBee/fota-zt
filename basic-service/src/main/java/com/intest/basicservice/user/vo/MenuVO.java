package com.intest.basicservice.user.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-21 9:35
 */
public class MenuVO {

    private String Id;

    private boolean IsPage;

    private boolean IsShow;

    private String Link;

    private String PId;

    private String PermissionId;

    private String Text;

    private String IconSkin;

    private List<MenuVO> Children;

    @JsonProperty("id")
    public String getId() {
        return this.Id;
    }

    @JsonProperty("isPage")
    public boolean getIsPage() {
        return this.IsPage;
    }

    @JsonProperty("isShow")
    public boolean getIsShow() {
        return this.IsShow;
    }

    @JsonProperty("link")
    public String getLink() {
        return this.Link;
    }

    @JsonProperty("pId")
    public String getPId() {
        return this.PId;
    }

    @JsonProperty("permissionId")
    public String getPermissionId() {
        return this.PermissionId;
    }

    @JsonProperty("text")
    public String getText() {
        return this.Text;
    }

    @JsonProperty("iconSkin")
    public String getIconSkin() {
        return this.IconSkin;
    }

    @JsonProperty("children")
    public List<MenuVO> getChildren() {
        if (this.Children == null) {
            this.Children = new ArrayList<MenuVO>();
        }
        return this.Children;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public void setIsPage(boolean value) {
        this.IsPage = value;
    }

    public void setIsShow(boolean value) {
        this.IsShow = value;
    }

    public void setLink(String value) {
        this.Link = value;
    }

    public void setPId(String value) {
        this.PId = value;
    }

    public void setPermissionId(String value) {
        this.PermissionId = value;
    }

    public void setText(String value) {
        this.Text = value;
    }

    public void setIconSkin(String value) {
        this.IconSkin = value;
    }

    public void setChildren(List<MenuVO> value) {
        this.Children = value;
    }
}