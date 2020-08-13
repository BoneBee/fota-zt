package com.intest.basicservice.table.impl.service.impl;


import com.intest.basicservice.table.impl.service.EditSaveTableService;
import com.intest.dao.entity.TableBto;
import com.intest.dao.entity.TableBtoExample;
import com.intest.dao.mapper.TableBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EditSaveTableImpl implements EditSaveTableService {

    @Autowired
    TableBtoMapper tableBtoMapper;

    @Override
    public TableBto getTableByID(String tableID) {
        return tableBtoMapper.selectByPrimaryKey(tableID);
    }

    @Override
    public List<TableBto> getTableByMenuId(String menuId) {
        TableBtoExample example=new TableBtoExample();
        TableBtoExample.Criteria criteria=example.createCriteria();
        criteria.andFkMenuIdEqualTo(menuId);
        return tableBtoMapper.selectByExample(example);
    }

    @Override
    public List<TableBto> getAllTable() {
        TableBtoExample example=new TableBtoExample();
        return tableBtoMapper.selectByExample(example);
    }

    @Override
    public int addTable(TableBto tableBto) {
        return tableBtoMapper.insert(tableBto);
    }

    @Override
    public int updateTable(TableBto tableBto) {
        return tableBtoMapper.updateByPrimaryKey(tableBto);
    }

    @Override
    public int deleteTable(String tableID) {
        return tableBtoMapper.deleteByPrimaryKey(tableID);
    }
}
