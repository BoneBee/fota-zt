package com.intest.partsconfigservice.service.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


/**
 * @作者:dl
 * @描述:车型基础信息实体
 * @创建时间: 2020/8/31 13:59
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class CarTypeBaseInfoEntity {
    /*
    车型名称
     */
    public String title;
    /*
    车型ID
     */
    public String key;

    /*
    零部件信息集合
     */
    public List<PartsBaseInfoEntity> children;

    public CarTypeBaseInfoEntity(){
        children=new ArrayList<>();
    }

}
