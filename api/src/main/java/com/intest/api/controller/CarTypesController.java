package com.intest.api.controller;


import com.intest.carservice.Respone.CarAddRespone;
import com.intest.carservice.Respone.delCarRespone;
import com.intest.carservice.cartypesimpl.carmpl;
import com.intest.carservice.Request.*;
import com.intest.carservice.cartypesimpl.cartypesassemblyImpl;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.result.Result;
import com.intest.common.result.ResultT;
import com.intest.common.webcore.BaseController;
import com.intest.util.ModelName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = {"车型管理"})
public class CarTypesController extends BaseController {

    @Autowired
    cartypesassemblyImpl cartypesTypeImpl;

    @Autowired
    carmpl mpl;

    @ApiOperation("获取所有车型")
    @RequestMapping(value = "/api/cartypes/getCarTypes", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getCarTypes(@RequestBody CarTypeRequest ctRequest) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
//            PagerDataBaseVO pgVO = cartypesTypeImpl.getCarInfo(ctRequest.getPi(), ctRequest.getPs(), 1, ctRequest.getDataName());
            PagerDataBaseVO pgVO = cartypesTypeImpl.getCarTypes(ctRequest);
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("获取车型详情")
    @RequestMapping(value = "/api/cartypes/getTypeDetail", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getCarTypeInfo(@RequestBody RequestCarTypebyId CarTypebyId) {

        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = cartypesTypeImpl.getCarTypeInfo(CarTypebyId);
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
    public Result delCarType(@RequestBody List<RequestDelCarTypebyId> carTypes) {

        Result result = new Result();
        try {
            StringBuffer buf = new StringBuffer();
            PagerDataBaseVO pgVO = new PagerDataBaseVO();
            String ErrMsg = cartypesTypeImpl.delCarType(carTypes, buf);
            result.setMsg(ErrMsg);
            addOperateLog(ModelName.MODEL_CAR_TYPE, ModelName.ACTION_DELETE);
            if (ErrMsg.equals("") || ErrMsg == null) {
                result.setSuccess(1);
            }
            else {
                result.setSuccess(0);
            }
        } catch (Exception ex) {
            result.setMsg(ex.getMessage());
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("新增车型")
    @RequestMapping(value = "/api/cartypes/addCarType", method = RequestMethod.POST)
    public Result addCarType(@RequestBody addCarType addcartype) {

        Result result = new Result();
        StringBuffer buffer = new StringBuffer();
        try {
            int i = cartypesTypeImpl.addCarType(addcartype);
            addOperateLog(ModelName.MODEL_CAR_TYPE, ModelName.ACTION_CREATE);
            result.setSuccess(i);

        } catch (Exception ex) {
            result.setSuccess(0);
            result.setMsg(ex.getMessage());
            ex.printStackTrace();
        }
        return result;
    }

    @ApiOperation("修改车型")
    @RequestMapping(value = "/api/cartypes/mdfCarType", method = RequestMethod.POST)
    public Result mdfCarType(@RequestBody addCarType addcartype) {
        Result result = new Result();
        try {
            int i = cartypesTypeImpl.mdfCarType(addcartype);
            addOperateLog(ModelName.MODEL_CAR_TYPE, ModelName.ACTION_UPDATE);
            result.setSuccess(i);
        } catch (Exception ex) {
            result.setSuccess(0);
            result.setMsg(ex.getMessage());
        }
        return result;
    }

    @ApiOperation("删除车辆")
    @RequestMapping(value = "/api/cars/delCar", method = RequestMethod.POST)
    public Result delCars(@RequestBody List<carsEx> carArr) {
        Result result = new Result();
        try {
            delCarRespone dels = mpl.delCars(carArr);
            addOperateLog(ModelName.MODEL_CAR_MESSAGE, ModelName.ACTION_DELETE);
            result.setMsg(dels.getSuccessMsg());
            if (dels.getSuccessMsg() == null || dels.getSuccessMsg().equals("")) {
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

    @ApiOperation("获取车辆")
    @RequestMapping(value = "/api/cars/getCars", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getCars(@RequestBody CarRequest carq) {
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
    @RequestMapping(value = "/api/cars/getCarDetail", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getCarDetail(@RequestBody RequestCarInfobyId CarInfobyId) {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = mpl.getCarDetail(CarInfobyId.getCarId());
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("新增车辆")
    @RequestMapping(value = "/api/cars/addCar", method = RequestMethod.POST)
    public Result addnewcar(@RequestBody addCar pcar) {
        Result result = new Result();
        try {
            CarAddRespone addCar = mpl.addCar(pcar);
            addOperateLog(ModelName.MODEL_CAR_MESSAGE, ModelName.ACTION_CREATE);
            result.setSuccess(addCar.getAddCarResult());
            result.setMsg(addCar.getMsg());
        } catch (Exception ex) {
            result.setSuccess(0);
            result.setMsg(ex.getMessage());
        }
        return result;
    }


    @ApiOperation("修改车辆")
    @RequestMapping(value = "/api/cars/modifyCar", method = RequestMethod.POST)
    public Result mdfCar(@RequestBody addCar pcar) {
        Result result = new Result();
        try {
            int i = mpl.mdfCar(pcar);
            addOperateLog(ModelName.MODEL_CAR_MESSAGE, ModelName.ACTION_UPDATE);
            if (i >= 1) {
                result.setSuccess(1);
            }
            else {
                result.setSuccess(0);
            }
        } catch (Exception ex) {
            result.setSuccess(0);
            result.setMsg(ex.getMessage());
        }
        return result;
    }


    @ApiOperation("新增车辆获取车型")
    @RequestMapping(value = "/api/cars/getAddCarTypes", method = RequestMethod.POST)
    public ResultT<PagerDataBaseVO> getAddCarTypes() {
        ResultT<PagerDataBaseVO> result = new ResultT<>();
        try {
            PagerDataBaseVO pgVO = mpl.getAddCarTypes();
            result.setResult(pgVO);
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("检测VIN")
    @RequestMapping(value = "/api/cars/checkVin", method = RequestMethod.POST)
    public Result checkVin(@RequestBody RequestCheckVin cVin) {
        Result result = new Result();
        try {
            result.setMsg(mpl.checkVin(cVin));
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("检测车型是否存在")
    @RequestMapping(value = "/api/cars/checkCarType", method = RequestMethod.POST)
    public Result checkCarType(@RequestBody RequestCheckCarType carType) {

        Result result = new Result();
        try {
            result.setMsg(cartypesTypeImpl.checkCarType(carType));
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }

    @ApiOperation("检测终端编号是否存在")
    @RequestMapping(value = "/api/cars/checkTerminalCode", method = RequestMethod.POST)
    public Result checkTerminalCode(@RequestBody RequestCheckTerminalCode tcode){
        Result result = new Result();
        try {
            result.setMsg(mpl.checkTerminalCode(tcode));
            result.setSuccess(1);
        } catch (Exception ex) {
            result.setSuccess(0);
        }
        return result;
    }
}
