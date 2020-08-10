package com.intest.service.impl;

import com.intest.service.CarService;
import com.intest.dao.entity.Car;
import com.intest.dao.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-05 22:27
 */
@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> getCarInfo() {
        List<Car> list = carMapper.selectByExample(null);
        return list;
    }
}
