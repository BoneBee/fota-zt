package com.intest.basicservice.table.service;


import com.intest.dao.entity.ToolbarItemBto;

import java.util.List;

public interface ToolbarItemService {
    List<ToolbarItemBto> getToolbarAllItemById(String toolbarId);

    ToolbarItemBto getToolbarItemById(String toolbarItemBtoId);

    ToolbarItemBto getToolbarItemByItemId(String ItemId);

    int addToolbarItem(ToolbarItemBto toolbarItemBto);

    int updateToolbarItem(ToolbarItemBto toolbarItemBto);

    int deleteToolbarItem(String toolbarItemBtoId);
}
