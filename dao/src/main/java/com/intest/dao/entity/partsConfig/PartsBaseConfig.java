package com.intest.dao.entity.partsConfig;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
public class PartsBaseConfig {

    /**
     * 零部件策略配置信息ID PARTSCONFIG_ID
     */
    @JsonIgnore
    public String partsConfigId;

    /**
     * 零部件信息ID FK_PARTS_ID
     */
    public String partsId;

    /**
     * 零部件名称
     */
    public String partsName;

    /**
     * 零件类型
     */
    public String partsTypeName;

    /**
     * 车型名称
     */
    public String carTypeName;

    /**
     * 网段名称
     */
    public String name;

    /**
     * 物理寻址ID
     */
    public String phyicalId;

    /**
     * 功能寻址ID
     */
    public String functionId;

    /**
     * 响应ID
     */
    public String responseId;



    /**
     * 电压模式 0-高压，1-低压，2-其他； VOLTAGEMODEL
     */
    public Short voltageModel;

    /**
     * 升级方式 0-Can，1-Can FD，2-DoIP； CANTYPE
     */
    public Short canType;

    /**
     * 车辆行驶状态 0-停止，1-行驶，2-其他； TRAVELSTATE
     */
    public Short travelState;

    /**
     * 车辆档位 0-N档，1-P档，2-其他； GEAR
     */
    public Short gear;

    /**
     * 零件升级顺序 ORDERNUM
     */
    public Short orderNum;

    /**
     * 预编程异常处理 0-执行后编程，1-结束 PREPROGRAMME
     */
    public Short preProgramme;

    /**
     * 编程中异常处理 0-执行后编程，1-结束 INPROGRAMME
     */
    public Short inProgramme;

    /**
     * 27服务 安全等级 SAFETYLEVEL
     */
    public Short safetyLevel;

    /**
     * 27服务 算法掩码 ALGORITHMMASK
     */
    public String algorithmMask;

    /**
     * 27服务 NRC RTDNE延时 单位ms DELAY
     */
    public Short delay;

    /**
     * 36服务是否对齐 0-是，1-否 ISALIGNMENT
     */
    public Short isAlignment;

    /**
     * 36服务对齐单位 ALIGNMENTCOMPANY
     */
    public Short alignmentCompany;

    /**
     * 重启等待复位时间 单位ms ECUWAITRESETTIME
     */
    public Short ecuWaitResetTime;

    /**
     * 创建时间 CREATEAT
     */
    @JsonIgnore
    public Date createAt;

    /**
     * 创建人 CREATEBY
     */
    @JsonIgnore
    public String createBy;

    /**
     * 修改时间 UPDATEAT
     */
    @JsonIgnore
    public Timestamp updateAt;

    /**
     * 修改人 UPDATEBY
     */
    @JsonIgnore
    public String updateBy;

    public PartsBaseConfig(){
        updateAt= new Timestamp(System.currentTimeMillis());
        updateBy="策略模块";
    }
}