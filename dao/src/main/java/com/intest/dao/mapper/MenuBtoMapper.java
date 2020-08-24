package com.intest.dao.mapper;

import com.intest.dao.entity.MenuBto;
import com.intest.dao.entity.MenuBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(MenuBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(MenuBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String menuId);

    /**
     *
     * @mbg.generated
     */
    int insert(MenuBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(MenuBto record);

    /**
     *
     * @mbg.generated
     */
    List<MenuBto> selectByExample(MenuBtoExample example);

    /**
     *
     * @mbg.generated
     */
    MenuBto selectByPrimaryKey(String menuId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MenuBto record, @Param("example") MenuBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MenuBto record, @Param("example") MenuBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MenuBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MenuBto record);
}