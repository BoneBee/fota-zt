package com.intest.api.controller;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.service.CarService;
import com.intest.service.impl.CarPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author zhanghui
 * @create 2020-08-05 22:31
 */
@RestController
@Api(tags = "测试")
public class TestController {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CarService carService;

    @GetMapping("/api/test")
    @ApiOperation(value = "获取车辆")
    public PagerDataBaseVO test() {
        return carService.getCarInfo(new CarPage());
    }

}
