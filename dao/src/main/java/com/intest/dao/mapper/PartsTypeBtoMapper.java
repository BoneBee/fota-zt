package com.intest.dao.mapper;

import com.intest.dao.entity.PartsTypeBto;
import com.intest.dao.entity.PartsTypeBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsTypeBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PartsTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PartsTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String partstypeId);

    /**
     *
     * @mbg.generated
     */
    int insert(PartsTypeBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PartsTypeBto record);

    /**
     *
     * @mbg.generated
     */
    List<PartsTypeBto> selectByExample(PartsTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    PartsTypeBto selectByPrimaryKey(String partstypeId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PartsTypeBto record, @Param("example") PartsTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PartsTypeBto record, @Param("example") PartsTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PartsTypeBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PartsTypeBto record);
}