package com.intest.basicservice.table.impl.service.impl;


import com.intest.basicservice.table.impl.service.ItemService;
import com.intest.dao.entity.ItemBto;
import com.intest.dao.entity.ItemBtoExample;
import com.intest.dao.mapper.ItemBtoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemImpl implements ItemService {

    @Resource
    ItemBtoMapper itemBtoMapper;

    @Override
    public List<ItemBto> getAllItem() {
        ItemBtoExample example = new ItemBtoExample();
        return itemBtoMapper.selectByExample(example);
    }

    @Override
    public ItemBto getItemById(String itemId) {
        return itemBtoMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int addItem(ItemBto itemBto) {
        return itemBtoMapper.insert(itemBto);
    }

    @Override
    public int updateItem(ItemBto itemBto) {
        return itemBtoMapper.updateByPrimaryKey(itemBto);
    }

    @Override
    public int deleteItem(String itemId) {
        return itemBtoMapper.deleteByPrimaryKey(itemId);
    }
}
