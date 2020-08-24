package com.intest.dao.mapper;

import com.intest.dao.entity.ColumnBto;
import com.intest.dao.entity.ColumnBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(ColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(ColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String columnId);

    /**
     *
     * @mbg.generated
     */
    int insert(ColumnBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(ColumnBto record);

    /**
     *
     * @mbg.generated
     */
    List<ColumnBto> selectByExample(ColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    ColumnBto selectByPrimaryKey(String columnId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ColumnBto record, @Param("example") ColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ColumnBto record, @Param("example") ColumnBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ColumnBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ColumnBto record);
}