package com.intest.api.controller;

import com.intest.carservice.Request.CarTypeRequest;
import com.intest.carservice.carservice.Request.*;
import com.intest.carservice.carservice.cartypesimpl.carmpl;
import com.intest.carservice.carservice.cartypesimpl.cartypesassemblyImpl;

import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.result.ResultT;
import com.intest.dao.entity.CarTypeBto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"车型管理"})
public class CarTypesController {

    @Autowired
    cartypesassemblyImpl cartypesTypeImpl;

    @Autowired
    carmpl mpl;

    @ApiOperation("获取车型详情")
    @RequestMapping(value = "/api/cartypes/getTypeDetail", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getCarTypeInfo(String carTypeId) {

        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = cartypesTypeImpl.getCarTypeInfo(carTypeId);
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }


    @ApiOperation("获取终端类型")
    @RequestMapping(value = "/api/parts/getTerminal", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getTerminal() {

        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = cartypesTypeImpl.getTerminal();
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("获取零件")
    @RequestMapping(value = "/api/parts/getParts", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getPartsType() {

        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = cartypesTypeImpl.getPartTypes();
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("删除车型")
    @RequestMapping(value = "/api/cartypes/delCarType", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> delCarType(List<CarTypeBto> carTypes) {

        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = cartypesTypeImpl.delCarType(carTypes);
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("新增车型")
    @RequestMapping(value = "/api/cartypes/addCarType", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> addCarType(@RequestBody addCarType addcartype) {

        ResultT<PagerDataBaseVO> result = new ResultT<>();
        StringBuffer buffer = new StringBuffer();
        try {
            PagerDataBaseVO pgVO = cartypesTypeImpl.addCarType(addcartype);
            result.setResult(pgVO);
            result.setSuccess(1);

        } catch (Exception ex) {
            result.setSuccess(0);
            ex.printStackTrace();
        }
        return null;
    }

    @ApiOperation("修改车型")
    @RequestMapping(value = "/api/cartypes/mdfCarType", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> mdfCarType(String carTypeId, String carTypeName, String terminalId, List<String> partTypes, String remark) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = cartypesTypeImpl.mdfCarType(carTypeId, carTypeName, terminalId, partTypes, remark);
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("删除车辆")
    @RequestMapping(value = "/api/cars/delCar", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> delCars(List<carsEx> carArr) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = mpl.delCars(carArr);
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("获取车辆")
    @RequestMapping(value = "/api/cars/getcars", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getCars(CarRequest carq) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = mpl.getCars(carq);
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("获取车辆详情")
    @RequestMapping(value = "/api/cars/getcardetail", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getCarsInfo(String carId) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = mpl.getCarInfo(carId);
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("新增车辆")
    @RequestMapping(value = "/api/cars/addcar", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> addnewcar(@RequestBody addCar pcar) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = new PagerDataBaseVO();
            result.setResult(pgVO);
            int i = mpl.addCar(pcar);
            if (i == 1) {
                result.setSuccess(1);
            }
            else {
                result.setSuccess(0);
            }
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }


    @ApiOperation("修改车辆")
    @RequestMapping(value = "/api/cars/mdfCar", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> mdfCar(@RequestBody addCar pcar) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            int i = mpl.mdfCar(pcar);
            PagerDataBaseVO pgVO = new PagerDataBaseVO();
            result.setResult(pgVO);
            if (i == 1) {
                result.setSuccess(1);
            }
            else {
                result.setSuccess(0);
            }
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }


    @ApiOperation("新增车辆获取车型")
    @RequestMapping(value = "/api/cars/getcartypes", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getcartypes(){
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = mpl.getCarTypes();
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

}
