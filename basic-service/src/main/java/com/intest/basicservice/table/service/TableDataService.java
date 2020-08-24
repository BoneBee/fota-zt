package com.intest.basicservice.table.service;

import com.intest.basicservice.table.ro.GetDataRO;

/**
 * @author zhanghui
 * @create 2020-08-13 11:59
 */
public interface TableDataService {

    Object GetTableData(GetDataRO model);

}
