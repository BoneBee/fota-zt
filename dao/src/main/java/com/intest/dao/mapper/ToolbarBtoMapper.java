package com.intest.dao.mapper;

import com.intest.dao.entity.ToolbarBto;
import com.intest.dao.entity.ToolbarBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolbarBtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    long countByExample(ToolbarBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByExample(ToolbarBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByPrimaryKey(String toolbarId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insert(ToolbarBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insertSelective(ToolbarBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    List<ToolbarBto> selectByExample(ToolbarBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    ToolbarBto selectByPrimaryKey(String toolbarId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") ToolbarBto record, @Param("example") ToolbarBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExample(@Param("record") ToolbarBto record, @Param("example") ToolbarBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKeySelective(ToolbarBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TOOLBAR
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKey(ToolbarBto record);
}