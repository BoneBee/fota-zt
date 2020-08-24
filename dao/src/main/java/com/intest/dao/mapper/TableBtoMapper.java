package com.intest.dao.mapper;

import com.intest.dao.entity.TableBto;
import com.intest.dao.entity.TableBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TableBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TableBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String tableId);

    /**
     *
     * @mbg.generated
     */
    int insert(TableBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TableBto record);

    /**
     *
     * @mbg.generated
     */
    List<TableBto> selectByExample(TableBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TableBto selectByPrimaryKey(String tableId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TableBto record, @Param("example") TableBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TableBto record, @Param("example") TableBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TableBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TableBto record);
}