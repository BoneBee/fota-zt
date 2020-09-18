package com.intest.dao.entity.task;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @作者:dl
 * @描述:根据车型ID获取升级包信息
 * @创建时间: 2020/9/14 14:49
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class PackageByCarTypeEntity {

    public int index;
    /**
     * 升级包任务Id
     */
    public String packageTaskId;

    /**
     * 升级包任务名称
     */
    public String packageName;

    /**
     * 车型
     */
    public String carTypeName;

    /**
     * 状态
     */
    public String packageTaskStatusValueName;

    /**
     * 制作时间
     */
    public Date createAt;
    /**
     * 制作人
     */
    public String createBy;
}
