package com.intest.basicservice.table.service;


import com.intest.dao.entity.ColumnOptionBto;

import java.util.List;

public interface ColumnOptionService {
    List<ColumnOptionBto> getColumnOptionAllById(String columnId);

    ColumnOptionBto getColumnOptionById(String columnOptionId);

    ColumnOptionBto getColumnOptionByOptionId(String optionId);


    int addColumnOption(ColumnOptionBto ColumnOptionBto);

    int updateColumnOption(ColumnOptionBto ColumnOptionBto);

    int deleteColumnOption(String columnOptionId);

    int deleteColumnOptionByOptionId(String optionId);
}
