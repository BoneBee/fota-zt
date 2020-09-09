package com.intest.partsconfigservice.service.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @作者:dl
 * @描述:零部件基础信息实体
 * @创建时间: 2020/8/31 13:59
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class PartsBaseInfoEntity {
    /**
    零部件名称
     */
    public String title;
    /**
    零部件信息ID
     */
    public String key;
    /**
    零部件升级顺序
     */
    public String orderNum;

}
