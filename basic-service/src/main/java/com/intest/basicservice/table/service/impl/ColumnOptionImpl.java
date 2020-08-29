package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.ColumnOptionService;
import com.intest.dao.entity.ColumnOptionBto;
import com.intest.dao.entity.ColumnOptionBtoExample;
import com.intest.dao.mapper.ColumnOptionBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ColumnOptionImpl implements ColumnOptionService {
    @Autowired
    ColumnOptionBtoMapper columnOptionBtoMapper;

    @Override
    public List<ColumnOptionBto> getColumnOptionAllById(String columnId) {
        ColumnOptionBtoExample example = new ColumnOptionBtoExample();
        ColumnOptionBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkColumnIdEqualTo(columnId);
        return columnOptionBtoMapper.selectByExample(example);
    }

    @Override
    public ColumnOptionBto getColumnOptionById(String columnOptionId) {
        return columnOptionBtoMapper.selectByPrimaryKey(columnOptionId);
    }

    @Override
    public ColumnOptionBto getColumnOptionByOptionId(String optionId) {
        ColumnOptionBtoExample example = new ColumnOptionBtoExample();
        ColumnOptionBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkOptionIdEqualTo(optionId);
        List<ColumnOptionBto> columnOptionBtos = columnOptionBtoMapper.selectByExample(example);
        if (columnOptionBtos != null || columnOptionBtos.size() != 0) {
            return columnOptionBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int addColumnOption(ColumnOptionBto columnOptionBto) {
        return columnOptionBtoMapper.insertSelective(columnOptionBto);
    }

    @Override
    public int updateColumnOption(ColumnOptionBto columnOptionBto) {
        return columnOptionBtoMapper.updateByPrimaryKeySelective(columnOptionBto);
    }

    @Override
    public int deleteColumnOption(String columnOptionId) {
        return columnOptionBtoMapper.deleteByPrimaryKey(columnOptionId);
    }

    @Override
    public int deleteColumnOptionByOptionId(String optionId) {
        ColumnOptionBtoExample example = new ColumnOptionBtoExample();
        ColumnOptionBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkOptionIdEqualTo(optionId);
        return columnOptionBtoMapper.deleteByExample(example);
    }
}
