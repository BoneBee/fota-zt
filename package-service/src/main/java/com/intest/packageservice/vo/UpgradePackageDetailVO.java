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
}
