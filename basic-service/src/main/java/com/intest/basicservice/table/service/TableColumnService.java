package com.intest.basicservice.table.service;


import com.intest.dao.entity.TableColumnBto;

import java.util.List;

public interface TableColumnService {
    List<TableColumnBto> getTableColumnListById(String tableId);

    TableColumnBto getTableColumnById(String tableColumnId);

    TableColumnBto getTableColumnByColumnId(String columnId);

    int addTableColumn(TableColumnBto tableColumnBto);

    int updateTableColumn(TableColumnBto tableColumnBto);

    int deleteTableColumn(String tableColumnId);
}
