package com.intest.carservice.cartypesimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.carservice.CarService;
import com.intest.carservice.Request.*;
import com.intest.carservice.Respone.*;
import com.intest.carservice.carTypeTool.carTools;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.common.webcore.BaseController;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@TableDataAnnotation
@Transactional
public class carmpl extends BaseController implements CarService {
//public class carmpl{

    @Autowired
    CarBtoMapper carmp;

    @Autowired
    CarTypeBtoMapper cartypemp;

    @Autowired
    TaskCarBtoMapper taskcarmp;

    @Autowired
    TaskBtoMapper taskmp;

    @Autowired
    TerminalBtoMapper terminalmp;

    @Autowired
    PartsBtoMapper partmp;

    @Autowired
    PartsTypeBtoMapper partstypemp;

    @Autowired
    PartsPackageBtoMapper ppmp;

    @Autowired
    CarExtendMapper carExmp;

    @Autowired
    CarTypePartsBtoMapper ctpbMapper;

    @Autowired
    CarTypeExtendMapper ctExMapper;

    @Autowired
    UserBtoMapper userMapper;

    /* 删除车型时用到：查询车型下是否有车辆
    根据车型ID获取车辆
     */
    @Override
    public List<CarBto> getCar(String carTypeId) {
        CarBtoExample carEx = new CarBtoExample();
        CarBtoExample.Criteria cia = carEx.createCriteria();
        cia.andFkCartypeIdEqualTo(carTypeId);
        List<CarBto> btos = new ArrayList<>();
        try {
            btos = carmp.selectByExample(carEx);
        } catch (Exception excar) {
            String aaa = "";
        }
        return btos;
    }

    /*
    删除车辆
     */
    @Override
    public delCarRespone delCars(List<carsEx> carArr) {

        PagerDataBaseVO carVO = new PagerDataBaseVO();
        String errMsg = "";
        int delcount = 0;

        delCarRespone carrsp = new delCarRespone();
        for (carsEx car : carArr) {
            //根据车辆ID删除车辆
            CarBto cbto = new CarBto();
            cbto.setCarId(car.getCarId());
//            cbto.setVin(car.getVin());
            cbto.setIsdelete((short) 0);
            int i = carmp.updateByPrimaryKeySelective(cbto);
            if (i == 0) {
                errMsg += String.format("车辆VIN：%s  删除失败！\r\n", car.getVin());
            }
            else {
                delcount += i;
            }
        }

        //给返回的对象赋值
        carrsp.setSuccessCount(delcount);
        carrsp.setSuccessMsg(errMsg);

        return carrsp;
    }

    /*
    获取车辆
     */
    @Override
    @TableDataAnnotation(tableId = "60bcb090-90e2-4508-835a-bf691cb3409f")
    public PagerDataBaseVO getCars(CarRequest carq) {
        int pageindex = carq.getPi();
        int pagesize = carq.getPs();

        List<CarBto> cars = new ArrayList<>();
        List<CarBtoExtend> cartmpExs = new ArrayList<>();
        List<CarBtoExtend> carExs = new ArrayList<>();
        //封装排序对象
        CarBtoExample carExample = new CarBtoExample();

        try {

            if (carq.getSort() != null && !carq.getSort().equals("")) {
                String sort = carTools.replaceCharacter(carq.getSort());
                carExample.setOrderByClause(sort);
            }
            //不能用生成工具生成的方法。
            //cars = carmp.selectByExample(carExample);
            CarBtoExtend cbex = new CarBtoExtend();
            cartmpExs = carExmp.getCars(cbex);
            //数据总行数;
            int cartcount = cartmpExs.size();
            //分页
            if (pageindex * pagesize > cartcount) {
                //取余，最后一页的数量
                long newsize = Math.floorMod(cartcount, pagesize);
                //PageHelper.startPage(pageindex, (int) newsize);
                PageHelper.startPage(pageindex, pagesize);
            }
            else {
                PageHelper.startPage(pageindex, pagesize);
            }
            carExs = carExmp.getCars(cbex);

        } catch (Exception carEx) {

        }

        //返回对象
        PagerDataBaseVO carsVO = new PagerDataBaseVO();
        List<CarRespone> carRespones = new ArrayList<>();

        //序号index赋值
        int index = 0;
        int rownumstar = 0;
        int rownumend = (pageindex) * pagesize;
        if (pageindex > 1) {
            rownumstar = (pageindex - 1) * pagesize;
        }
        index = rownumstar;
        //时间格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //循环赋值返回对象
        for (CarBtoExtend car : carExs) {
            index += 1;
            if (index <= rownumstar) {
                continue;
            }
            if (index > rownumend) {
                break;
            }
            CarRespone crp = new CarRespone();
            //给车辆赋值基本信息
            crp.setCarId(car.getCarId());
            crp.setCarTypeId(car.getCarTypeId());
            if (car.getCarTypeName() == null || car.getCarTypeName().equals("")) {
                crp.setCarTypeName("");
            }
            else {
                crp.setCarTypeName(car.getCarTypeName());
            }

            crp.setAddType(car.getAddType().toString());
            crp.setIndex(index);
            crp.setTerminalId(car.getTerminalId());
            crp.setTerminalPro(car.getTerminalPro());
            crp.setTerminalCode(car.getTerminalCode());
            crp.setTerminal(car.getTerminal());
            crp.setOperator(car.getOperator());
            crp.setVin(car.getVin());
            crp.setICCID(car.getICCID());
            crp.setSimNumber(car.getSimNumber());

            crp.setCreateAt(car.getCreateAt());
            String CreateBy = "";//carTools.getUserRealName(userMapper, car.getCreateBy());
            CreateBy = carTools.getUserRealName(userMapper, car.getCreateBy());
            crp.setCreateBy(CreateBy);

            if (car.getCreateAt() == null || car.getCreateAt().equals("")) {
                crp.setCreateAt("");
            }
            else {
                crp.setCreateAt(car.getCreateAt());
            }
            CarTask cartask = new CarTask();
            cartask.setTaskName(car.getTaskName());
            if (car.getTaskName() == null || car.getTaskName().equals("")) {
                cartask.setExTask(0);
            }
            else {
                cartask.setExTask(1);
            }
            //车辆任务执行状态
            cartask.setExecuteStatus(car.getExecuteStatus());
            //车辆任务审批状态
            cartask.setCheckStatus(car.getCheckStatus());

            //获取该车辆绑定的零件
//            CarTypePartsBtoExample ctpbEx = new CarTypePartsBtoExample();
//            CarTypePartsBtoExample.Criteria ciactpb = ctpbEx.createCriteria();
//            ciactpb.andFkCartypeIdEqualTo(car.getCarTypeId());
//            List<CarTypePartsBto> ctpbs=ctpbMapper.selectByExample(ctpbEx);
//
//            PartsBtoExample partEx = new PartsBtoExample();
//            PartsBtoExample.Criteria ciapart = partEx.createCriteria();
//            ciapart.andFkCartypeIdEqualTo(car.getCarTypeId());

            //查找车辆的零件
//            List<PartsBto> parts = partmp.selectByExample(partEx);
            List<PartsBto> parts = carExmp.getPartsOfCar(car.getCarTypeId());
            List<CarEcu> ecus = new ArrayList<>();
            int ecuCount = 0;
            //获取零件信息集合
            for (PartsBto pt : parts) {
                CarEcu te = new CarEcu();
                te.setIndex(ecuCount += 1);
                te.setEcuId(pt.getPartsId());
                te.setEcuName(pt.getPartsname());
                //辉哥说，这里零件号以parts表的partscode为准
                te.setPartCode(pt.getPartscode());
                //获取零件类型名称
                PartsTypeBto ptbto = partstypemp.selectByPrimaryKey(pt.getFkPartstypeId());
                //零件类型名
                te.setPartType(ptbto.getPartstypename());
                //获取零件版本
                PartsPackageBtoExample ppEX = new PartsPackageBtoExample();
                PartsPackageBtoExample.Criteria ciapp = ppEX.createCriteria();

                ciapp.andFkPartsIdEqualTo(pt.getPartsId());
                //String sort = carTools.replaceCharacter(carq.getSort());
                ppEX.setOrderByClause("UPDATEAT DESC");


                List<PartsPackageBto> ppbtos = ppmp.selectByExample(ppEX);
                if (ppbtos.size() > 0) {
                    PartsPackageBto ppbto = ppbtos.get(0);
                    te.setPartVersion(ppbto.getSoftwareversion());
                    if (ppbto.getUpdateat() == null || ppbto.getUpdateat().equals("")) {
                        te.setUpdateAt("");
                    }
                    else {
                        te.setUpdateAt(ft.format(ppbto.getUpdateat()));
                    }
                }
                ecus.add(te);
            }

            //添加车辆零件集合
            crp.setEcus(ecus);
            //赋值一辆车的数据
            crp.setTaskMsg(cartask);
            //把车辆添加到车辆集合里面，然后一起返回
            carRespones.add(crp);
        }

        PageInfo pageInfo = new PageInfo<CarRespone>(carRespones);
        carsVO.setTotal(cartmpExs.size());
        carsVO.setData(carRespones);
        return carsVO;
    }


    /*
    查看车辆详情
     */
    @Override
    public PagerDataBaseVO getCarDetail(String carId) {
        CarBto car = new CarBto();
        try {
            car = carmp.selectByPrimaryKey(carId);
        } catch (Exception carEx) {
            return new PagerDataBaseVO();
        }
        List<CarRespone> carRespones = new ArrayList<>();
        //时间格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CarRespone crp = new CarRespone();

        //获取车型名称
        CarTypeBto carTypeBto = cartypemp.selectByPrimaryKey(car.getFkCartypeId());
        //根据车型的终端外键ID获取终端型号
        TerminalBto terminalBto = terminalmp.selectByPrimaryKey(carTypeBto.getFkTerminalId());
        //给车辆赋值基本信息
        crp.setCarId(car.getCarId());
        crp.setCarTypeId(carTypeBto.getCartypeId());
        crp.setCarTypeName(carTypeBto.getCartypename());
        crp.setAddType(car.getAddtype().toString());
        if (terminalBto != null) {
            crp.setTerminalId(terminalBto.getTerminalId());
            crp.setTerminalPro(terminalBto.getPcompany());
            crp.setTerminal(terminalBto.getTerminalname());
        }
        crp.setVin(car.getVin());
        crp.setCreateAt(ft.format(car.getCreateat()));
        crp.setCreateBy(car.getCreateby());
        crp.setTerminalCode(car.getTerminalcode());
        crp.setICCID(car.getIccid());
        crp.setOperator("电信");


        //获取车辆任务
        TaskCarBtoExample tcEx = new TaskCarBtoExample();
        TaskCarBtoExample.Criteria cia = tcEx.createCriteria();
        cia.andVinEqualTo(car.getVin());
        List<TaskCarBto> tcbtos = taskcarmp.selectByExample(tcEx);
        TaskCarBto tcbto = new TaskCarBto();

        //获取任务名称
        TaskBto tbto = new TaskBto();
        CarTask cartask = new CarTask();
        if (tcbtos.size() > 0) {
            tcbto = tcbtos.get(0);
            tbto = taskmp.selectByPrimaryKey(tcbto.getFkTaskId());
            cartask.setTaskName(tbto.getTaskname());
            cartask.setExTask(1);
        }

        //获取该车辆绑定的零件
        PartsBtoExample partEx = new PartsBtoExample();
        PartsBtoExample.Criteria ciapart = partEx.createCriteria();
        ciapart.andFkCartypeIdEqualTo(car.getFkCartypeId());

        //查找车辆的零件
        List<PartsBto> parts = partmp.selectByExample(partEx);
        List<CarEcu> ecus = new ArrayList<>();
        int ecuCount = 0;
        //获取零件信息集合
        for (PartsBto pt : parts) {
            CarEcu te = new CarEcu();
            te.setIndex(ecuCount += 1);
            te.setEcuName(pt.getPartsname());
            te.setPartCode(pt.getPartscode());
            //获取零件的零件类型
            PartsTypeBto ptbto = partstypemp.selectByPrimaryKey(pt.getFkPartstypeId());
            //零件类型名
            te.setPartType(ptbto.getPartstypename());
            //获取零件版本
            PartsPackageBtoExample ppEX = new PartsPackageBtoExample();
            PartsPackageBtoExample.Criteria ciapp = ppEX.createCriteria();
            ciapp.andFkPartsIdEqualTo(pt.getPartsId());
            List<PartsPackageBto> ppbtos = ppmp.selectByExample(ppEX);
            if (ppbtos.size() > 0) {
                PartsPackageBto ppbto = ppbtos.get(0);
                te.setPartVersion(ppbto.getSoftwareversion());
                te.setUpdateAt(ft.format(ppbto.getUpdateat()));
            }
            ecus.add(te);
        }

        crp.setEcus(ecus);
        carRespones.add(crp);
        //返回对象
        PagerDataBaseVO carVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<CarRespone>(carRespones);
        carVO.setTotal(pageInfo.getTotal());
        carVO.setData(carRespones);
        return carVO;
    }


    /*
    添加车辆
     */
    @Override
    public CarAddRespone addCar(addCar pcar) {
        //添加新车辆
        int carcount = 0;
        CarAddRespone addcar = new CarAddRespone();

        CarBto cb = new CarBto();
        cb.setCarId(UUID.randomUUID().toString());
        cb.setAddtype((short) 1);
        cb.setVin(pcar.getVin());
        cb.setFkCartypeId(pcar.getCarTypeId());
        UserBto ub = getAccount();
        cb.setCreateby(ub.getUserId());
        //终端厂商
        cb.setTerminalpro(pcar.getTerminalPro());
        cb.setIccid(pcar.getIccid());
        //运营商
        cb.setOperator(pcar.getOperator());

        cb.setSimnumber(pcar.getCardCode());

        cb.setTerminalcode(pcar.getTerminalCode());
        //添加新车辆
        carcount = carmp.insertSelective(cb);

        addcar.setAddCarResult(carcount);


        return addcar;
    }

    /*
    修改车辆
     */
    @Override
    public int mdfCar(addCar pcar) {
        CarBto cb = new CarBto();
        cb.setCarId(pcar.getCarId());
        cb.setAddtype((short) 1);
        cb.setVin(pcar.getVin());
        cb.setFkCartypeId(pcar.getCarTypeId());
        cb.setTerminalcode(pcar.getTerminalCode());
        cb.setIsdelete((short) 1);
        //终端厂商
        cb.setTerminalpro(pcar.getTerminalPro());
        cb.setIccid(pcar.getIccid());
        UserBto ub = getAccount();
        cb.setUpdateby(ub.getUserId());
        //运营商
        cb.setOperator(pcar.getOperator());

        //修改车辆
        int carcount = carmp.updateByPrimaryKeySelective(cb);

        return carcount;
    }

    /*
    新增车辆，获取的车型
     */
    @Override
    public PagerDataBaseVO getAddCarTypes() {
        CarTypeBtoExample carTypeExample = new CarTypeBtoExample();
        List<CarTypeBto> cartypes = cartypemp.selectByExample(carTypeExample);
        List<AddCarResponeCarType> cartyperps = new ArrayList<>();
        for (CarTypeBto ctbto : cartypes) {
            //过滤已删除的车型
            if (ctbto.getIsdelete().equals((short) 0)) {
                continue;
            }
            AddCarResponeCarType cartyperp = new AddCarResponeCarType();

            cartyperp.setCarTypeId(ctbto.getCartypeId());
            cartyperp.setCarTypeName(ctbto.getCartypename());
            //根据车型的终端外键ID获取终端型号
            if (ctbto.getFkTerminalId() != null) {
                TerminalBto terminalBto = terminalmp.selectByPrimaryKey(ctbto.getFkTerminalId());
                if (terminalBto != null) {
                    cartyperp.setTerminal(terminalBto.getTerminalname());
                    cartyperp.setTerminalPro(terminalBto.getPcompany());
                }
            }
            cartyperps.add(cartyperp);
        }

        PagerDataBaseVO cartypeVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<AddCarResponeCarType>(cartyperps);
        cartypeVO.setData(cartyperps);
        cartypeVO.setTotal(pageInfo.getTotal());

        return cartypeVO;
    }

    /*
    检测VIn唯一性
     */
    public String checkVin(RequestCheckVin cvin) {
        CarBtoExample carEx = new CarBtoExample();
        CarBtoExample.Criteria cia = carEx.createCriteria();
        cia.andVinEqualTo(cvin.getVin());
        cia.andIsdeleteEqualTo((short) 1);
        if (!cvin.getCarId().equals("")) {
            cia.andCarIdEqualTo(cvin.getCarId());
        }
        //查找vin
        List<CarBto> cBto = carmp.selectByExample(carEx);
        String Msg = "";

        if (cBto.size() > 0) {
            if (cvin.getCarId().equals("")) {
                Msg = String.format("Vin：%s 已经存在", cvin.getVin());
            }
        }
        return Msg;
    }

    /*
    检测终端编码唯一性
     */
    public String checkTerminalCode(RequestCheckTerminalCode ctcode) {
        CarBtoExample carEx = new CarBtoExample();
        CarBtoExample.Criteria cia = carEx.createCriteria();
        cia.andTerminalcodeEqualTo(ctcode.getTerminalCode());
        cia.andIsdeleteEqualTo((short) 1);
        if (!ctcode.getCarId().equals("")) {
            cia.andCarIdEqualTo(ctcode.getCarId());
        }
        //查找终端编号
        List<CarBto> cBto = carmp.selectByExample(carEx);
        String Msg = "";

        if (cBto.size() > 0) {
            if (ctcode.getCarId().equals("")) {
                Msg = String.format("终端编号：%s 已经存在", ctcode.getTerminalCode());
            }
        }
        return Msg;
    }
}
