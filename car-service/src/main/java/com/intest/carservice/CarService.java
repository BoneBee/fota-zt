package com.intest.carservice;

import com.intest.carservice.Request.*;
import com.intest.carservice.Respone.delCarRespone;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.CarBto;

import java.util.List;

public interface CarService {

    public List<CarBto> getCar(String carTypeId);

    public delCarRespone delCars(List<carsEx> carArr);

    public PagerDataBaseVO getCars(CarRequest carq);

    public PagerDataBaseVO getCarDetail(String carId);

    public int addCar(addCar pcar);

    public int mdfCar(addCar pcar);

    public PagerDataBaseVO getAddCarTypes();

    public String checkVin(RequestCheckVin cvin);
}
