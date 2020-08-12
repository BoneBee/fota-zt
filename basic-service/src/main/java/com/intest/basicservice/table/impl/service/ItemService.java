package com.intest.basicservice.table.impl.service;


import com.intest.dao.entity.ItemBto;

import java.util.List;

public interface ItemService {

    List<ItemBto> getAllItem();

    ItemBto getItemById(String itemId);

    int addItem(ItemBto ItemBto);

    int updateItem(ItemBto ItemBto);

    int deleteItem(String itemId);
}
