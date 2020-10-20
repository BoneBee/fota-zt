package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.ColumnService;
import com.intest.dao.entity.ColumnBto;
import com.intest.dao.entity.ColumnBtoExample;
import com.intest.dao.mapper.ColumnBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ColumnImpl implements ColumnService {

    @Autowired
    ColumnBtoMapper columnBtoMapper;

    @Override
    public ColumnBto getColumnById(String columnId) {
        ColumnBtoExample example = new ColumnBtoExample();
        ColumnBtoExample.Criteria criteria = example.createCriteria();
        criteria.andIsdeleteEqualTo(new BigDecimal(1));
        criteria.andColumnIdEqualTo(columnId);
        List<ColumnBto> list = columnBtoMapper.selectByExample(example);
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int addColumn(ColumnBto columnBto) {
        return columnBtoMapper.insertSelective(columnBto);
    }

    @Override
    public int updateColumn(ColumnBto columnBto) {
        return columnBtoMapper.updateByPrimaryKeySelective(columnBto);
    }

    @Override
    public int deleteColumn(String columnId) {
        return columnBtoMapper.deleteByPrimaryKey(columnId);
    }
}
