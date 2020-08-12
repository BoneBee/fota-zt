package com.intest.basicservice.table.impl.service;


import com.intest.dao.entity.ToolbarBto;

import java.util.List;

public interface ToolbarService {
    ToolbarBto getToolbarById(String toolbarId);

    ToolbarBto getToolbarByTableId(String tableId);

    List<ToolbarBto> getToolbarList();

    int addToolbar(ToolbarBto ToolbarBto);

    int updateToolbar(ToolbarBto ToolbarBto);

    int deleteToolbar(String toolbarId);
}
