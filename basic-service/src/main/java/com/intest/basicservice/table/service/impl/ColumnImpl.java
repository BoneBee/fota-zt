package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.ColumnService;
import com.intest.basicservice.table.service.ColumnService;
import com.intest.dao.entity.ColumnBto;
import com.intest.dao.mapper.ColumnBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ColumnImpl implements ColumnService {

    @Autowired
    ColumnBtoMapper columnBtoMapper;

    @Override
    public ColumnBto getColumnById(String columnId) {
        return columnBtoMapper.selectByPrimaryKey(columnId);
    }

    @Override
    public int addColumn(ColumnBto columnBto) {
        return columnBtoMapper.insert(columnBto);
    }

    @Override
    public int updateColumn(ColumnBto columnBto) {
        return columnBtoMapper.updateByPrimaryKey(columnBto);
    }

    @Override
    public int deleteColumn(String columnId) {
        return columnBtoMapper.deleteByPrimaryKey(columnId);
    }
}
