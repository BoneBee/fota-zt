package com.intest.basicservice.table.impl.service.impl;

import com.intest.basicservice.table.impl.ro.GetDataRO;
import com.intest.basicservice.table.impl.service.TableDataService;
import com.intest.common.tableData.SpringContextLoader;
import org.springframework.stereotype.Service;

/**
 * @author zhanghui
 * @create 2020-08-13 12:05
 */
@Service
public class TableDataImpl implements TableDataService {
    @Override
    public Object GetTableData(GetDataRO model) {
        Object result = null;
        try {
            result = SpringContextLoader.DoMethodName(model.getTableId());
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }
}
