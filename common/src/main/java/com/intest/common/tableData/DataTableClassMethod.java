package com.intest.common.tableData;

import java.lang.reflect.Method;

/**
 * @author zhanghui
 * @create 2020-09-11 21:45
 */
public class DataTableClassMethod {

    private Method method;

    private String dataTableId;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getDataTableId() {
        return dataTableId;
    }

    public void setDataTableId(String dataTableId) {
        this.dataTableId = dataTableId;
    }
}
