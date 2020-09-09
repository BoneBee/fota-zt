package com.intest.dao.entity.partsConfig;

import lombok.Getter;
import lombok.Setter;

/**
 * @作者:dl
 * @描述:车型与零部件信息集合
 * @创建时间: 2020/9/1 11:02
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
@Getter
@Setter
public class CarTypeAPartsEntity {
    /*
    车型Id
   */
        public String CarTypeId;
    /*
    车型名称
   */
    public String CarTypeName;
    /*
    零部件ID
   */
    public String PartsId;
    /*
    零部件名称
   */
    public String PartsName;
    /*
    零件升级顺序
     */
    public String OrderNum;
}
