package com.intest.carservice.carservice.cartypesimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.carservice.carservice.CarTypesService;
import com.intest.carservice.carservice.Request.addCarType;
import com.intest.carservice.carservice.Respone.*;
import com.intest.carservice.carservice.carTypeTool.carTools;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.intest.carservice.Request.CarTypeRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@TableDataAnnotation
@Transactional
public class cartypesassemblyImpl implements CarTypesService {

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

        PageHelper.startPage(pageindex, pagesize);
        List<CarTypeBto> carTypes = new ArrayList<>();
        try {
            CarTypeBtoExample btoExample = new CarTypeBtoExample();

            String sort = carTools.replaceCharacter(request.getSort());
            btoExample.setOrderByClause(sort);
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

            if (index > rownumstar && index <= rownumend) {
                TerminalBto tmnBto = tmMapper.selectByPrimaryKey(ctb.getFkTerminalId());
                CarTypeRespone respone = new CarTypeRespone();
                respone.setIndex(index);
                respone.setCartypeName(ctb.getCartypename());
                respone.setTerminal(tmnBto.getTerminalname());
                respone.setRemark(ctb.getRemark());
                respone.setCreateAt(ft.format(ctb.getCreateat()));
                respone.setCreateBy(ctb.getCreateby());
                respone.setUpdateAt(ctb.getUpdateat() == null ? "" : ft.format(ctb.getUpdateat()));
                respone.setUpdateBy(ctb.getUpdateby() == null ? "" : ctb.getUpdateby());
                respone.setCartypeId(ctb.getCartypeId());
                ctRespones.add(respone);
            }
        }

        PageInfo pageInfo = new PageInfo<CarTypeRespone>(ctRespones);
        carTypesVO.setTotal(pageInfo.getTotal());
        carTypesVO.setData(ctRespones);

        return carTypesVO;
    }


    /*
    获取车型详情接口
     */
    @Override
    public PagerDataBaseVO getCarTypeInfo(String carTypeId) {
        //查找车型

        CarTypeBto ctb = cartypeMapper.selectByPrimaryKey(carTypeId);
        //查找终端
        TerminalBto tmnBto = tmMapper.selectByPrimaryKey(ctb.getFkTerminalId());

        PartsBtoExample partEx = new PartsBtoExample();
        PartsBtoExample.Criteria cia = partEx.createCriteria();
        cia.andFkCartypeIdEqualTo(carTypeId);

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
            //零件类型全名
            ecu.setFullName(ptbto.getFullname());
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
        TypeInfo.setCreateBy(ctb.getCreateby() == null ? "" : ctb.getCreateby());
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
        PartsBtoExample partsBtoExample = new PartsBtoExample();

        List<PartsBto> tmnBtos = partMapper.selectByExample(partsBtoExample);

        List<CarTypeResponeEcu> ecus = new ArrayList<>();
        for (PartsBto pbto : tmnBtos) {
            CarTypeResponeEcu ecu = new CarTypeResponeEcu();

            ecu.setPartId(pbto.getPartsId());
            ecu.setPartName(pbto.getPartsname());
            ecus.add(ecu);
        }

        PagerDataBaseVO partsVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<CarTypeResponeEcu>(ecus);
        partsVO.setTotal(pageInfo.getTotal());
        partsVO.setData(ecus);

        return partsVO;
    }


    /*
    删除车型
     */
    @Override
    public PagerDataBaseVO delCarType(List<CarTypeBto> carTypes) {
        carmpl mpl = new carmpl();
        PagerDataBaseVO delCarTypeVO = new PagerDataBaseVO();
        String errMsg = "";
        int delcount = 0;
        List<delCarTypeRespone> resp = new ArrayList<>();
        delCarTypeRespone rep = new delCarTypeRespone();
        for (CarTypeBto cartype : carTypes) {
            //根据车型获取车辆
            List<CarBto> carbto = mpl.getCar(cartype.getCartypeId());
            //车型下有车辆则不能删除
            if (carbto != null && carbto.size() > 0) {
                errMsg += String.format("车型：%s 下有 %s 辆车，删除失败，请先删除车辆！\r\n", cartype.getCartypename(), carbto.size());
            }
            else if (carbto.size() == 0) {
                //更新删除字段
                cartype.setIsdelete((short) 0);
                //更新车型删除状态
                delcount += cartypeMapper.updateByPrimaryKey(cartype);
            }
        }
        rep.setSuccessCount(delcount);
        rep.setSuccessMsg(errMsg);
        resp.add(rep);

        PageInfo pageInfo = new PageInfo<delCarTypeRespone>(resp);
        delCarTypeVO.setTotal(pageInfo.getTotal());
        delCarTypeVO.setData(resp);
        return delCarTypeVO;
    }

    /*
    添加车型
     */
    @Override
    public PagerDataBaseVO addCarType(addCarType addcartype) {

        PagerDataBaseVO addcarTypeVO = new PagerDataBaseVO();

        CarTypeBto cbto = new CarTypeBto();
        String carId = UUID.randomUUID().toString();
        cbto.setCartypeId(carId);
        cbto.setCartypename(addcartype.getCarTypeName());
        cbto.setFkTerminalId(addcartype.getTerminalId());
        cbto.setRemark(addcartype.getRemark());
        //添加新车型
        int carcount = cartypeMapper.insertSelective(cbto);
        List<String> pts = addcartype.getPartTypes();
        for (String pId : pts) {
            PartsBto tbto = new PartsBto();
            tbto.setPartsId(pId);
            tbto.setFkCartypeId(carId);
            //添加车型相关的零件
            int partcount = extendMapper.addcarupdatePart(tbto);
        }

        return addcarTypeVO;
    }


    /*
    修改车型
     */
    @Override
    public PagerDataBaseVO mdfCarType(String carTypeId, String carTypeName, String terminalId, List<String> partTypes, String remark) {
        CarTypeBto cbto = new CarTypeBto();
        cbto.setCartypeId(carTypeId);
        cbto.setCartypename(carTypeName);
        cbto.setFkTerminalId(terminalId);
        cbto.setRemark(remark);
        //修改车型
        cartypeMapper.updateByPrimaryKey(cbto);
        for (String pId : partTypes) {
            PartsBto tbto = new PartsBto();
            tbto.setPartsId(pId);
            tbto.setFkCartypeId(carTypeId);
            //添加车型相关的零件
            extendMapper.addcarupdatePart(tbto);
            //partMapper.updateByPrimaryKey(tbto);
        }
        PagerDataBaseVO partsTypeVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<PartsTypeBto>(null);
        partsTypeVO.setTotal(pageInfo.getTotal());
        partsTypeVO.setData(null);

        return partsTypeVO;
    }

}
