package com.intest.dao.entity.vo;

import lombok.Data;

/**
 * @author ：intest
 * @description：TODO
 * @date ：2020/8/14 15:38
 */
@Data
public class PageBase {
    /**
     * 当前页数
     */
    private int pi = 1;
    /**
     * 每页大小
     */
    private int ps = 10;
}
