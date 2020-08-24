package com.intest.dao.mapper;

import com.intest.dao.entity.ToolbarItemBto;
import com.intest.dao.entity.ToolbarItemBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolbarItemBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(ToolbarItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(ToolbarItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String toolbaritemId);

    /**
     *
     * @mbg.generated
     */
    int insert(ToolbarItemBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(ToolbarItemBto record);

    /**
     *
     * @mbg.generated
     */
    List<ToolbarItemBto> selectByExample(ToolbarItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    ToolbarItemBto selectByPrimaryKey(String toolbaritemId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ToolbarItemBto record, @Param("example") ToolbarItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ToolbarItemBto record, @Param("example") ToolbarItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ToolbarItemBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ToolbarItemBto record);
}