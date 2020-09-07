package com.intest.carservice.carservice;

import com.intest.carservice.carservice.Request.CarRequest;
import com.intest.carservice.carservice.Request.addCar;
import com.intest.carservice.carservice.Request.carsEx;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.CarBto;

import java.util.List;

public interface CarService {

    public List<CarBto> getCar(String carTypeId);

    public PagerDataBaseVO delCars(List<carsEx> carArr);

    public PagerDataBaseVO getCars(CarRequest carq);

    public PagerDataBaseVO getCarInfo(String carId);

    public int addCar(addCar pcar);

    public int mdfCar(addCar pcar);

    public PagerDataBaseVO getCarTypes();
}
