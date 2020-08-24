package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.ToolbarService;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.ToolbarBto;
import com.intest.dao.entity.ToolbarBtoExample;
import com.intest.dao.mapper.ToolbarBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ToolbarImpl implements ToolbarService {
    @Autowired
    ToolbarBtoMapper toolbarBtoMapper;

    @Override
    public ToolbarBto getToolbarById(String toolbarId) {
        return toolbarBtoMapper.selectByPrimaryKey(toolbarId);
    }

    @Override
    public ToolbarBto getToolbarByTableId(String tableId) {
        ToolbarBtoExample example = new ToolbarBtoExample();
        ToolbarBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkTableIdEqualTo(tableId);
        List<ToolbarBto> toolbarBtos = toolbarBtoMapper.selectByExample(example);
        if (toolbarBtos != null || toolbarBtos.size() != 0) {
            return toolbarBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<ToolbarBto> getToolbarList() {
        ToolbarBtoExample example = new ToolbarBtoExample();
        return toolbarBtoMapper.selectByExample(example);
    }

    @Override
    public int addToolbar(ToolbarBto toolbarBto) {
        return toolbarBtoMapper.insert(toolbarBto);
    }

    @Override
    public int updateToolbar(ToolbarBto toolbarBto) {
        return toolbarBtoMapper.updateByPrimaryKey(toolbarBto);
    }

    @Override
    public int deleteToolbar(String toolbarId) {
        return toolbarBtoMapper.deleteByPrimaryKey(toolbarId);
    }
}
