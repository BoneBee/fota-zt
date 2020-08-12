package com.intest.basicservice.table.impl.service.impl;


import com.intest.basicservice.table.impl.service.TableColumnService;
import com.intest.dao.entity.TableColumnBto;
import com.intest.dao.entity.TableColumnBtoExample;
import com.intest.dao.mapper.TableColumnBtoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TableColumnImpl implements TableColumnService {
    @Resource
    TableColumnBtoMapper tableColumnBtoMapper;

    @Override
    public List<TableColumnBto> getTableColumnListById(String tableId) {
        TableColumnBtoExample example = new TableColumnBtoExample();
        TableColumnBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkTableIdEqualTo(tableId);
        return tableColumnBtoMapper.selectByExample(example);
    }

    @Override
    public TableColumnBto getTableColumnById(String tableColumnId) {
        return tableColumnBtoMapper.selectByPrimaryKey(tableColumnId);
    }

    @Override
    public TableColumnBto getTableColumnByColumnId(String columnId) {
        TableColumnBtoExample example = new TableColumnBtoExample();
        TableColumnBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkColumnIdEqualTo(columnId);
        List<TableColumnBto> tableColumnBtos = tableColumnBtoMapper.selectByExample(example);
        if (tableColumnBtos != null || tableColumnBtos.size() != 0) {
            return tableColumnBtos.get(0);
        } else {
            return null;
        }

    }

    @Override
    public int addTableColumn(TableColumnBto tableColumnBto) {
        return tableColumnBtoMapper.insert(tableColumnBto);
    }

    @Override
    public int updateTableColumn(TableColumnBto tableColumnBto) {
        return tableColumnBtoMapper.updateByPrimaryKey(tableColumnBto);
    }

    @Override
    public int deleteTableColumn(String tableColumnId) {
        return tableColumnBtoMapper.deleteByPrimaryKey(tableColumnId);
    }
}
