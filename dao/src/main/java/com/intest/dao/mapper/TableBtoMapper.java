package com.intest.dao.mapper;

import com.intest.dao.entity.TableBto;
import com.intest.dao.entity.TableBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableBtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    long countByExample(TableBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByExample(TableBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByPrimaryKey(String tableId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insert(TableBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insertSelective(TableBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    List<TableBto> selectByExample(TableBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    TableBto selectByPrimaryKey(String tableId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") TableBto record, @Param("example") TableBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExample(@Param("record") TableBto record, @Param("example") TableBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKeySelective(TableBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_TABLE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKey(TableBto record);
}