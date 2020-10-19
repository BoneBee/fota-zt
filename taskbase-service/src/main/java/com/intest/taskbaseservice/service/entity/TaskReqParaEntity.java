package com.intest.taskbaseservice.service.entity;

import com.intest.common.ro.PagerBaseRO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @作者:
 * @描述:
 * @创建时间: 2020/9/10 13:34
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class TaskReqParaEntity extends PagerBaseRO {

    public String taskId;

    public String taskName;

    public String carTypeId;

//    public int pi;
//
//    public int ps;


}
