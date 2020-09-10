package com.intest.carservice;

import com.intest.carservice.Request.*;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.CarTypeBto;

import java.util.List;


public interface CarTypesService {

    public PagerDataBaseVO getCarTypes(CarTypeRequest request);

    public CarTypeBto getCarTypeById(String carid);

    public PagerDataBaseVO getCarTypeInfo(RequestCarTypebyId CarTypebyId);

    public PagerDataBaseVO getTerminal();

    public PagerDataBaseVO getPartTypes();

    public String delCarType(List<RequestDelCarTypebyId> carTypes, StringBuffer buf);

    public int addCarType(addCarType addcartype);

    public int mdfCarType(addCarType addcartype);
}
