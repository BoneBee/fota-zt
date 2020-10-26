package com.intest.dao.mapper;

import com.intest.dao.entity.CarBtoExtend;
import com.intest.dao.entity.PartsBto;

import java.util.List;

public interface CarExtendMapper {

    List<CarBtoExtend>  getCars(CarBtoExtend carEx);

    List<PartsBto> getPartsOfCar(String fk_cartype_id);
}
