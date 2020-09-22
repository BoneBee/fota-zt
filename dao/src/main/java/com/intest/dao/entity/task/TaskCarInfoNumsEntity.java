package com.intest.dao.entity.task;

import lombok.Getter;
import lombok.Setter;

/**
 * @作者:dl
 * @描述:任务车辆数量实体
 * @创建时间: 2020/9/11 16:49
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class TaskCarInfoNumsEntity {
    /**
     * 总数
     */
    public int carTotalNum;
    /**
     * 已完成数量
     */
    public int carComNum;
    /**
     * 升级中数量
     */
    public int carUpNum;
    /**
     * 失败数量数量
     */
    public int carFailedNum;
    /**
     * 取消数量
     */
    public int carCancelNum;
}
