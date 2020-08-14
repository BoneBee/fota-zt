package com.intest.dao.mapper;

import com.intest.dao.entity.Car;

import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-14 15:06
 */
public interface CarExtendMapper {
    /**
     * 分页查询车辆
     * @return
     */
    List<Car> selectPage();
}
