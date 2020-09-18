package com.intest.carservice.cartypesimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.carservice.CarTypesService;
import com.intest.carservice.Request.*;
import com.intest.carservice.Respone.*;
import com.intest.carservice.carTypeTool.carTools;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@TableDataAnnotation
@Transactional
public class cartypesassemblyImpl implements CarTypesService {
    //public class cartypesassemblyImpl{
    public int pagecount;

    public int pagesize;

    public int currpage;

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

    @Autowired
    CarBtoMapper carmp;

    @Autowired
    UserBtoMapper userMapper;

    @Override
    public CarTypeBto getCarTypeById(String cartypeid) {

        CarTypeBto bto = cartypeMapper.selectByPrimaryKey(cartypeid);

        return bto;
    }


    /*
    获取所有车型
    */
    @Override
    @TableDataAnnotation(tableId = "835d6461-fb44-4606-b41b-3467a89355db")
    public PagerDataBaseVO getCarTypes(CarTypeRequest request) {

        int pageindex = request.getPi();
        int pagesize = request.getPs();
        PagerDataBaseVO carTypesVO = new PagerDataBaseVO();


        List<CarTypeBto> carTypes = new ArrayList<>();
        long cartypecount = 0;
        CarTypeBtoExample btoExample = new CarTypeBtoExample();

        CarTypeBtoExample.Criteria cia = btoExample.createCriteria();
        cia.andIsdeleteEqualTo((short) 1);
        cartypecount = cartypeMapper.countByExample(btoExample);
        //分页
        if (pageindex * pagesize > cartypecount) {
            //取余，最后一页的数量
            long newsize = Math.floorMod(cartypecount, pagesize);
            PageHelper.startPage(pageindex, (int) newsize);
        }
        else {
            PageHelper.startPage(pageindex, pagesize);
        }
        try {
            if (request.getSort() != null && !request.getSort().equals("")) {
                String sort = carTools.replaceCharacter(request.getSort());
                btoExample.setOrderByClause(sort);
            }


            carTypes = cartypeMapper.selectByExample(btoExample);

        } catch (Exception ex) {
            return new PagerDataBaseVO();
        }

        List<CarTypeRespone> ctRespones = new ArrayList<>();

        int index = 0;
        int rownumstar = 0;
        int rownumend = (pageindex) * pagesize;
        if (pageindex > 1) {
            rownumstar = (pageindex - 1) * pagesize;
        }
        index = rownumstar;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (CarTypeBto ctb : carTypes) {
            index += 1;
            if (index <= rownumstar) {
                continue;
            }
            if (index > rownumend) {
                break;
            }

            if (index > rownumstar && index <= rownumend && ctb.getFkTerminalId() != null) {
                TerminalBto tmnBto = tmMapper.selectByPrimaryKey(ctb.getFkTerminalId());
                CarTypeRespone respone = new CarTypeRespone();
                respone.setIndex(index);
                respone.setCartypeName(ctb.getCartypename());
                if (tmnBto != null) {
                    respone.setTerminal(tmnBto.getTerminalname());
                    respone.setTerminalId(tmnBto.getTerminalId());
                }
                respone.setRemark(ctb.getRemark());
                if (ctb.getCreateat() == null || ctb.getCreateat().equals("")) {
                    respone.setCreateAt("");
                }
                else {
                    respone.setCreateAt(ft.format(ctb.getCreateat()));
                }
                String CreateBy = carTools.getUserRealName(userMapper, ctb.getCreateby());
                respone.setCreateBy(CreateBy);

                String UpdateBy = ctb.getUpdateby() == null ? "" : ctb.getUpdateby();
                if (!UpdateBy.equals("")) {
                    respone.setUpdateAt(ctb.getUpdateat() == null ? "" : ft.format(ctb.getUpdateat()));
                    respone.setUpdateBy(carTools.getUserRealName(userMapper, ctb.getUpdateby()));
                }

                respone.setCartypeId(ctb.getCartypeId());
                ctRespones.add(respone);
            }
        }

        PageInfo pageInfo = new PageInfo<CarTypeRespone>(ctRespones);
        //carTypesVO.setTotal(pageInfo.getTotal());
        carTypesVO.setTotal(cartypecount);
        carTypesVO.setData(ctRespones);

        return carTypesVO;
    }


    /*
    获取车型详情接口
     */
    @Override
    public PagerDataBaseVO getCarTypeInfo(RequestCarTypebyId CarTypebyId) {

        //查找车型
        CarTypeBto ctb = cartypeMapper.selectByPrimaryKey(CarTypebyId.getCarTypeId());
        //查找终端
        TerminalBto tmnBto = tmMapper.selectByPrimaryKey(ctb.getFkTerminalId());

        PartsBtoExample partEx = new PartsBtoExample();
        PartsBtoExample.Criteria cia = partEx.createCriteria();
        cia.andFkCartypeIdEqualTo(CarTypebyId.getCarTypeId());

        //查找终端的零件
        List<PartsBto> pBto = partMapper.selectByExample(partEx);

        List<CarTypeEcus> ecus = new ArrayList<>();

        int ecuindex = 0;
        for (PartsBto pbto : pBto) {

            CarTypeEcus ecu = new CarTypeEcus();
            //获取零件的零件类型
            PartsTypeBto ptbto = partsTypeBtoMapper.selectByPrimaryKey(pbto.getFkPartstypeId());
            //零件类型名
            ecu.setTypeName(ptbto.getPartstypename());
            //零件名
            ecu.setPartName(pbto.getPartsname());
            //零件index
            ecu.setIndex(ecuindex += 1);

            ecus.add(ecu);
        }

        //组装返回对象
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CarTypeInfoRespone TypeInfo = new CarTypeInfoRespone();
        TypeInfo.setCarTypeId(ctb.getCartypeId());
        TypeInfo.setCarTypeName(ctb.getCartypename());
        TypeInfo.setTerminalId(tmnBto.getTerminalId());
        TypeInfo.setTerminal(tmnBto.getTerminalname());
        TypeInfo.setCreateAt(ctb.getCreateat() == null ? "" : ft.format(ctb.getCreateat()));
        if (ctb.getCreateby() != null && !ctb.getCreateby().equals("")) {
            String CreateBy = carTools.getUserRealName(userMapper, ctb.getCreateby());
            TypeInfo.setCreateBy(CreateBy);
        }
        String UpdateBy = ctb.getUpdateby() == null ? "" : ctb.getUpdateby();
        if (!UpdateBy.equals("")) {
            TypeInfo.setUpdateBy(carTools.getUserRealName(userMapper, ctb.getUpdateby()));
        }

        TypeInfo.setUpdateBy(ctb.getUpdateby() == null ? "" : ctb.getUpdateby());
        TypeInfo.setRemark(ctb.getRemark());

        TypeInfo.setEcus(ecus);

        List<CarTypeInfoRespone> TypeInfos = new ArrayList<>();
        TypeInfos.add(TypeInfo);

        PagerDataBaseVO carTypesVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<CarTypeInfoRespone>(TypeInfos);
        carTypesVO.setTotal(pageInfo.getTotal());
        carTypesVO.setData(TypeInfos);

        return carTypesVO;
    }

    /*
    添加车型时，获取所有终端
     */
    @Override
    public PagerDataBaseVO getTerminal() {
        TerminalBtoExample terminalBtoExample = new TerminalBtoExample();
        List<TerminalBto> tmnBtos = tmMapper.selectByExample(terminalBtoExample);

        List<CarTypeResponeTerminal> terminals = new ArrayList<>();

        for (TerminalBto bto : tmnBtos) {
            CarTypeResponeTerminal terminal = new CarTypeResponeTerminal();
            terminal.setTerminalId(bto.getTerminalId());
            terminal.setTerminalName(bto.getTerminalname());
            terminals.add(terminal);
        }

        PagerDataBaseVO TerminalVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<CarTypeResponeTerminal>(terminals);
        TerminalVO.setTotal(pageInfo.getTotal());
        TerminalVO.setData(terminals);

        return TerminalVO;
    }

    /*
    添加车型时，获取所有零件
     */
    @Override
    public PagerDataBaseVO getPartTypes() {

        PartsTypeBtoExample partsTypeex = new PartsTypeBtoExample();

        //获取零件类型
        List<PartsTypeBto> ptbtos = partsTypeBtoMapper.selectByExample(partsTypeex);
        List<CarTypeEcuType> ctets = new ArrayList<>();

        for (PartsTypeBto ptbto : ptbtos) {

            PartsBtoExample partEx = new PartsBtoExample();
            PartsBtoExample.Criteria cia = partEx.createCriteria();
            cia.andFkPartstypeIdEqualTo(ptbto.getPartstypeId());

            //查找相关零件
            List<PartsBto> pbtos = partMapper.selectByExample(partEx);
            if (pbtos.size() > 0) {
                CarTypeEcuType ctet = new CarTypeEcuType();

                ctet.setPartTypeName(ptbto.getPartstypename());
                List<CarTypeResponeEcu> ecus = new ArrayList<>();
                for (PartsBto pbto : pbtos) {
                    CarTypeResponeEcu ecu = new CarTypeResponeEcu();
                    ecu.setPartId(pbto.getPartsId());
                    ecu.setPartName(pbto.getPartsname());
                    //把零件加到类型集合
                    ecus.add(ecu);
                }
                ctet.setEcus(ecus);

                //把类型加到类型集合
                ctets.add(ctet);
            }
        }

        PagerDataBaseVO partsVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<CarTypeEcuType>(ctets);
        partsVO.setTotal(pageInfo.getTotal());
        partsVO.setData(ctets);

        return partsVO;
    }


    /*
    删除车型
     */
    @Override
    public String delCarType(List<RequestDelCarTypebyId> carTypes, StringBuffer buf) {

        String errMsg = "";
        List<delCarTypeRespone> resp = new ArrayList<>();
        delCarTypeRespone rep = new delCarTypeRespone();
        //根据需要删除的车型ID去找是否存在车辆
        //如果车型下有车辆，那就不删除，其他的车型也不再执行删除车型操作
        for (RequestDelCarTypebyId cartype : carTypes) {
            //根据车型获取车辆
            List<CarBto> carbto = getCar(cartype.getCarTypeId());
            //车型下有车辆则不能删除
            if (carbto != null && carbto.size() > 0) {
                errMsg += String.format("车型：%s 下有 %s 辆车，删除失败，请先删除车辆！\r\n", cartype.getCarTypeName(), carbto.size());
            }
        }

        //车型下没有车辆，执行删除车型操作
        if (errMsg.equals("") || errMsg == null) {
            for (RequestDelCarTypebyId cartype : carTypes) {
                CarTypeBto ctbto = new CarTypeBto();

                //更新删除字段
                ctbto.setCartypeId(cartype.getCarTypeId());
                ctbto.setCartypename(cartype.getCarTypeName());
                ctbto.setIsdelete((short) 0);
                //更新车型删除状态
                cartypeMapper.updateByPrimaryKey(ctbto);
            }
        }

        return errMsg;
    }

    /*
    添加车型
     */
    @Override
    public int addCarType(addCarType addcartype) {

        CarTypeBto cbto = new CarTypeBto();
        String carId = UUID.randomUUID().toString();
        cbto.setCartypeId(carId);
        cbto.setCartypename(addcartype.getCarTypeName());
        cbto.setFkTerminalId(addcartype.getTerminalId());
        cbto.setRemark(addcartype.getRemark());

        List<String> pts = addcartype.getPartTypes();
        int partcount = 0;
        for (String pId : pts) {
            PartsBto tbto = new PartsBto();
            tbto.setPartsId(pId);
            tbto.setFkCartypeId(carId);
            //添加车型相关的零件
            partcount += extendMapper.addcarupdatePart(tbto);
        }
        int carcount = 0;

        if (partcount == pts.size()) {
            //添加新车型
            carcount = cartypeMapper.insertSelective(cbto);
        }
        return carcount;
    }


    /*
    修改车型
     */
    @Override
    public int mdfCarType(addCarType addcartype) {
        CarTypeBto cbto = new CarTypeBto();
        cbto.setCartypeId(addcartype.getCarTypeId());
        cbto.setCartypename(addcartype.getCarTypeName());
        cbto.setFkTerminalId(addcartype.getTerminalId());
        cbto.setRemark(addcartype.getRemark());
        List<String> partTypes = addcartype.getPartTypes();
        int partCount = 0;
        for (String pId : partTypes) {
            PartsBto tbto = new PartsBto();
            tbto.setPartsId(pId);
            tbto.setFkCartypeId(addcartype.getCarTypeId());
            //添加车型相关的零件
            partCount += extendMapper.addcarupdatePart(tbto);
        }
        //修改车型
        int i = 0;
        if (partCount == partTypes.size()) {
            i = cartypeMapper.updateByPrimaryKey(cbto);
        }
        return i;
    }


    /* 删除车型时用到：查询车型下是否有车辆
    根据车型ID获取车辆
     */
    public List<CarBto> getCar(String carTypeId) {
        CarBtoExample carEx = new CarBtoExample();
        CarBtoExample.Criteria cia = carEx.createCriteria();
        cia.andFkCartypeIdEqualTo(carTypeId);
        List<CarBto> btos = new ArrayList<>();
        try {
            btos = carmp.selectByExample(carEx);
        } catch (Exception excar) {
        }
        return btos;
    }

    /*
    检测车型名称是否唯一
     */
    public String checkCarType(RequestCheckCarType carType) {

        CarTypeBtoExample carTypeEx = new CarTypeBtoExample();
        CarTypeBtoExample.Criteria cia = carTypeEx.createCriteria();
        cia.andCartypenameEqualTo(carType.getCarTypeName());

        //查找vin
        List<CarTypeBto> ctBto = cartypeMapper.selectByExample(carTypeEx);

        String Msg = "";
        if (ctBto.size() > 0) {
            Msg = String.format("车型：%s 已经存在", carType.getCarTypeName());
        }
        return Msg;
    }
}
