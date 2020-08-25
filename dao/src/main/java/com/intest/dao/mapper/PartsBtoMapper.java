package com.intest.dao.mapper;

import com.intest.dao.entity.PartsBto;
import com.intest.dao.entity.PartsBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String partsId);

    /**
     *
     * @mbg.generated
     */
    int insert(PartsBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PartsBto record);

    /**
     *
     * @mbg.generated
     */
    List<PartsBto> selectByExample(PartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    PartsBto selectByPrimaryKey(String partsId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PartsBto record, @Param("example") PartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PartsBto record, @Param("example") PartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PartsBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PartsBto record);
}