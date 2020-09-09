package com.intest.packageservice.vo;

import java.util.List;

/**
 * @author ：intest
 * @description：升级包详情实体
 * @date ：2020/9/9 10:49
 */
public class UpgradePackageDetailVO {
    /**
     * 描述标题
     */
    private String title;
    /**
     * 描述内容
     */
    private String content;
    /**
     * 升级包信息
     */
    private List<UpgradePackageVO> upgradePackages;
    /**
     * 升级零件
     */
    private List<PartsVO> parts;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<UpgradePackageVO> getUpgradePackages() {
        return upgradePackages;
    }

    public void setUpgradePackages(List<UpgradePackageVO> upgradePackages) {
        this.upgradePackages = upgradePackages;
    }

    public List<PartsVO> getParts() {
        return parts;
    }

    public void setParts(List<PartsVO> parts) {
        this.parts = parts;
    }
}
