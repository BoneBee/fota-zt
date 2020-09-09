package com.intest.carservice.carservice.cartypesimpl;

import com.github.pagehelper.PageInfo;
import com.intest.carservice.carservice.Request.addCarType;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.CarTypeBto;
import com.intest.dao.entity.PartsBto;
import com.intest.dao.entity.PartsTypeBto;
import com.intest.dao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public class achieveMethod {

    @Autowired
    CarTypeBtoMapper cartypeMapper;

    @Autowired
    TerminalBtoMapper tmMapper;


    @Autowired
    PartsBtoMapper partMapper;
    @Autowired
    PartsTypeBtoMapper partsTypeBtoMapper;

    @Autowired
    CarTypeExtendMapper extendMapper;


    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public PagerDataBaseVO toaddCarType(CarTypeBtoMapper cartypeMapper, PartsBtoMapper partMapper,
                                        CarTypeExtendMapper extendMapper, addCarType addcartype) {

        CarTypeBto cbto = new CarTypeBto();
        String carId = UUID.randomUUID().toString();
        cbto.setCartypeId(carId);
        cbto.setCartypename(addcartype.getCarTypeName());
        cbto.setFkTerminalId(addcartype.getTerminalId());
        cbto.setRemark(addcartype.getRemark());
        //添加新车型
        //extendMapper.addCarType(cbto);
        cartypeMapper.insertSelective(cbto);
        List<String> pts = addcartype.getPartTypes();
        for (String pId : pts) {
            PartsBto tbto = new PartsBto();
            tbto.setPartsId(pId);
            tbto.setFkCartypeId(carId);
            //添加车型相关的零件

            //extendMapper.addcarupdatePart(tbto);
            partMapper.updateByPrimaryKey(tbto);
        }


        PagerDataBaseVO partsTypeVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<PartsTypeBto>(null);
        partsTypeVO.setTotal(pageInfo.getTotal());
        partsTypeVO.setData(null);

        return partsTypeVO;
    }
}
