package com.intest.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.Car;
import com.intest.dao.mapper.CarExtendMapper;
import com.intest.dao.mapper.CarMapper;
import com.intest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-05 22:27
 */
@Component
@TableDataAnnotation
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private CarExtendMapper carExtend;

    @Override
    @TableDataAnnotation(tableId = "123")
    public PagerDataBaseVO getCarInfo(CarPage model) {
        PagerDataBaseVO car = new PagerDataBaseVO();

        //List<Car> list = carMapper.selectByExample(null);

        PageHelper.startPage(model.getPi(), model.getPs());
        List<Car> cars = carExtend.selectPage();
        PageInfo pageInfo = new PageInfo<Car>(cars);
        car.setTotal(pageInfo.getTotal());
        car.setData(cars);

        return car;
    }
}
