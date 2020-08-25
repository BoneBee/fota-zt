package com.intest.api.controller;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.service.CarService;
import com.intest.service.impl.CarPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zhanghui
 * @create 2020-08-05 22:31
 */
@RestController
@Api(tags = "测试")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CarService carService;

    @GetMapping("/api/test")
    @ApiOperation(value = "获取车辆")
    public PagerDataBaseVO test() {
        //logger.error("测试");
        return carService.getCarInfo(new CarPage());
    }

}
