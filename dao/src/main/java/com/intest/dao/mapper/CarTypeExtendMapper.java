package com.intest.dao.mapper;

import com.intest.dao.entity.CarTypeBto;
import com.intest.dao.entity.CarTypePartsBto;
import com.intest.dao.entity.PartsBto;

import java.util.List;

public interface CarTypeExtendMapper {

    /**
     * 分页查询车型
     * @return
     */
    List<CarTypeBto> selectPageCon();

    /*
    添加车型需要使用的更新零件绑定车型外键
     */
    int addcarupdatePart(PartsBto pbto);

    /*
    删除车型所关联的零件
     */
    int mdfcarupdatePart(String fk_cartype_id,String userId);

    /*
    添加车型
     */
    int addCarType(CarTypeBto cbto);

    List<PartsBto> getPartsOfCarType(String fk_cartype_id);

}
