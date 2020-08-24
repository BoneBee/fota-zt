package com.intest.dao.mapper;

import com.intest.dao.entity.ToolbarBto;
import com.intest.dao.entity.ToolbarBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolbarBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(ToolbarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(ToolbarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String toolbarId);

    /**
     *
     * @mbg.generated
     */
    int insert(ToolbarBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(ToolbarBto record);

    /**
     *
     * @mbg.generated
     */
    List<ToolbarBto> selectByExample(ToolbarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    ToolbarBto selectByPrimaryKey(String toolbarId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ToolbarBto record, @Param("example") ToolbarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ToolbarBto record, @Param("example") ToolbarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ToolbarBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ToolbarBto record);
}