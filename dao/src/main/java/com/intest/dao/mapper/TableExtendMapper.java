package com.intest.dao.mapper;

import com.intest.dao.entity.TableBto;
import com.intest.dao.entity.TableBtoExample;
import com.intest.dao.entity.table.MenuByTableIdExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableExtendMapper {

    List<MenuByTableIdExtend> getMenuByTableIdDate();

}