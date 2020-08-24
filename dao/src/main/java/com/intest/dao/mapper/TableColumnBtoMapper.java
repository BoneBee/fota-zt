package com.intest.dao.mapper;

import com.intest.dao.entity.TableColumnBto;
import com.intest.dao.entity.TableColumnBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableColumnBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TableColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TableColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String tablecolumnId);

    /**
     *
     * @mbg.generated
     */
    int insert(TableColumnBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TableColumnBto record);

    /**
     *
     * @mbg.generated
     */
    List<TableColumnBto> selectByExample(TableColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TableColumnBto selectByPrimaryKey(String tablecolumnId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TableColumnBto record, @Param("example") TableColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TableColumnBto record, @Param("example") TableColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TableColumnBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TableColumnBto record);
}