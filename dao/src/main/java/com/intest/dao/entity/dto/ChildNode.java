package com.intest.dao.entity.dto;

import lombok.Data;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 17:07
 */
@Data
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
}
