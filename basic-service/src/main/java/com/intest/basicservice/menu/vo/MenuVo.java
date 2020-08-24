package com.intest.basicservice.menu.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-22 14:44
 */
public class MenuVo {
    private String Id;

    private boolean IsShow;

    private String Link;

    private String PId;

    private String PermissionId;

    private String Text;

    private String IconSkin;

    private List<MenuVo> Children;

    public String getId() {
        return this.Id;
    }

    public String getLink(){
        return this.Link;
    }

    public String getPId(){
        return this.PId;
    }

    public String getPermissionId(){
        return this.PermissionId;
    }

    public String getText(){
        return this.Text;
    }

    public String getIconSkin(){
        return this.IconSkin;
    }

    public boolean getIsShow(){
        return this.IsShow;
    }

    public List<MenuVo> getChildren() {
        if (this.Children == null) {
            this.Children = new ArrayList<>();
        }
        return this.Children;
    }

    public void setId(String value) {
        this.Id = value;
    }

    public void setPId(String value) {
        this.PId = value;
    }

    public void setIsShow(boolean value) {
        this.IsShow = value;
    }

    public void setLink(String value) {
        this.Link = value;
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

    public void setChildren(List<MenuVo> value) {
        this.Children = value;
    }
}
