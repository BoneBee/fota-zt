package com.intest.basicservice.table.impl.service;


import com.intest.dao.entity.TableBto;

import java.util.List;

public interface EditSaveTableService {
    TableBto getTableByID(String tableID);

    List<TableBto> getTableByMenuId(String menuId);

    List<TableBto> getAllTable();

    int addTable(TableBto tableBto);

    int updateTable(TableBto tableBto);

    int deleteTable(String tableID);
}
