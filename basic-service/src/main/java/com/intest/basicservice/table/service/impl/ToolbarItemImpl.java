package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.ToolbarItemService;
import com.intest.dao.entity.ToolbarItemBto;
import com.intest.dao.entity.ToolbarItemBtoExample;
import com.intest.dao.mapper.ToolbarItemBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ToolbarItemImpl implements ToolbarItemService {
    @Autowired
    ToolbarItemBtoMapper toolbarItemBtoMapper;

    @Override
    public List<ToolbarItemBto> getToolbarAllItemById(String toolbarId) {
        ToolbarItemBtoExample example = new ToolbarItemBtoExample();
        ToolbarItemBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkToolbarIdEqualTo(toolbarId);
        return toolbarItemBtoMapper.selectByExample(example);
    }

    @Override
    public ToolbarItemBto getToolbarItemById(String toolbarItemBtoId) {
        return toolbarItemBtoMapper.selectByPrimaryKey(toolbarItemBtoId);
    }

    @Override
    public ToolbarItemBto getToolbarItemByItemId(String ItemId) {
        ToolbarItemBtoExample example = new ToolbarItemBtoExample();
        ToolbarItemBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkItemIdEqualTo(ItemId);
        List<ToolbarItemBto> toolbarItemBtos = toolbarItemBtoMapper.selectByExample(example);
        if (toolbarItemBtos != null || toolbarItemBtos.size() != 0) {
            return toolbarItemBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int addToolbarItem(ToolbarItemBto toolbarItemBto) {
        return toolbarItemBtoMapper.insertSelective(toolbarItemBto);
    }

    @Override
    public int updateToolbarItem(ToolbarItemBto toolbarItemBto) {
        return toolbarItemBtoMapper.updateByPrimaryKeySelective(toolbarItemBto);
    }

    @Override
    public int deleteToolbarItem(String toolbarItemBtoId) {
        return toolbarItemBtoMapper.deleteByPrimaryKey(toolbarItemBtoId);
    }
}
