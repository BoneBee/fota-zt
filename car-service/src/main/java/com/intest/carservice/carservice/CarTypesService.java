package com.intest.carservice;

import com.intest.carservice.Respone.CarTypeRespone;
import com.intest.carservice.Request.CarTypeRequest;
import com.intest.carservice.carservice.Request.addCarType;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.CarTypeBto;

import java.util.List;

public interface CarTypesService {

    public PagerDataBaseVO getCarTypes(CarTypeRequest request);

    public CarTypeBto getCarTypeById(String carid);

    public PagerDataBaseVO getCarTypeInfo(String carTypeId);

    public PagerDataBaseVO getTerminal();

    public PagerDataBaseVO getPartTypes();

    public PagerDataBaseVO delCarType(List<CarTypeBto> carTypes);

    public PagerDataBaseVO addCarType(addCarType addcartype);

    public PagerDataBaseVO mdfCarType(String carTypeId,String carTypeName, String terminalId, List<String> partTypes,String remark);
}
