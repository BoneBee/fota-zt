package com.intest.basicservice.table.service;


import com.intest.dao.entity.ColumnBto;

public interface ColumnService {
    ColumnBto getColumnById(String columnId);

    int addColumn(ColumnBto ColumnBto);

    int updateColumn(ColumnBto ColumnBto);

    int deleteColumn(String columnId);
}
