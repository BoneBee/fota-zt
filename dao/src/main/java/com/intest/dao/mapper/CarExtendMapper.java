package com.intest.dao.mapper;

import com.intest.dao.entity.CarBtoExtend;
import com.intest.dao.entity.statisticalAnalysis.TimeRequest;

import java.util.List;

public interface CarExtendMapper {

    List<CarBtoExtend>  getCars(CarBtoExtend carEx);

    List<CarBtoExtend>  getTimeCars(TimeRequest carEx);

}
