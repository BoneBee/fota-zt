package com.intest.basicservice.table.service.impl;

import com.intest.basicservice.table.service.TableDataService;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.ro.GetDataRO;
import com.intest.common.tableData.SpringContextLoader;
import org.springframework.stereotype.Service;

/**
 * @author zhanghui
 * @create 2020-08-13 12:05
 */
@Service
public class TableDataImpl implements TableDataService {
    @Override
    public PagerDataBaseVO GetTableData(GetDataRO model) {
        PagerDataBaseVO result = null;
        try {
            result = (PagerDataBaseVO) SpringContextLoader.DoMethodName(model);
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }
}
