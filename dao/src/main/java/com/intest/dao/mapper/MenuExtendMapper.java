package com.intest.dao.mapper;

import com.intest.dao.entity.MenuBto;
import com.intest.dao.entity.MenuBtoExample;
import com.intest.dao.entity.table.MenuExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuExtendMapper {

    List<MenuExtend> findAllRecursion();

}