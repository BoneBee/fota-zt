package com.intest.dao.entity.dto;

import lombok.Data;

import java.util.List;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/12 15:02
 */
@Data
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
}
