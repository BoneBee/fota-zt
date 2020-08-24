package com.intest.dao.mapper;

import com.intest.dao.entity.ColumnOptionBto;
import com.intest.dao.entity.ColumnOptionBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnOptionBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(ColumnOptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(ColumnOptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String columnoptionId);

    /**
     *
     * @mbg.generated
     */
    int insert(ColumnOptionBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(ColumnOptionBto record);

    /**
     *
     * @mbg.generated
     */
    List<ColumnOptionBto> selectByExample(ColumnOptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    ColumnOptionBto selectByPrimaryKey(String columnoptionId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ColumnOptionBto record, @Param("example") ColumnOptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ColumnOptionBto record, @Param("example") ColumnOptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ColumnOptionBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ColumnOptionBto record);
}