package com.intest.service;


import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.Car;
import com.intest.service.impl.CarPage;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-05 22:28
 */
public interface CarService {

    public PagerDataBaseVO getCarInfo(CarPage model);
}
