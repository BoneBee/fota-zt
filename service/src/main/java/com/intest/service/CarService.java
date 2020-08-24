package com.intest.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.service.impl.CarPage;

/**
 * @author zhanghui
 * @create 2020-08-05 22:28
 */
public interface CarService {

    public PagerDataBaseVO getCarInfo(CarPage model);
}
