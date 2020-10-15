package com.intest.basicservice.user.request;

public class UpdatePassworldRequest {
    private String loginName;
    private String oldPassworld;
    private String newPassworld;
    private String isPassworld;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getOldPassworld() {
        return oldPassworld;
    }

    public void setOldPassworld(String oldPassworld) {
        this.oldPassworld = oldPassworld;
    }

    public String getNewPassworld() {
        return newPassworld;
    }

    public void setNewPassworld(String newPassworld) {
        this.newPassworld = newPassworld;
    }

    public String getIsPassworld() {
        return isPassworld;
    }

    public void setIsPassworld(String isPassworld) {
        this.isPassworld = isPassworld;
    }
}
