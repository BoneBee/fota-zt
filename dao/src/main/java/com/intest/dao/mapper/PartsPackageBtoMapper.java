package com.intest.dao.mapper;

import com.intest.dao.entity.PartsPackageBto;
import com.intest.dao.entity.PartsPackageBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsPackageBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PartsPackageBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PartsPackageBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String partspackageId);

    /**
     *
     * @mbg.generated
     */
    int insert(PartsPackageBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PartsPackageBto record);

    /**
     *
     * @mbg.generated
     */
    List<PartsPackageBto> selectByExample(PartsPackageBtoExample example);

    /**
     *
     * @mbg.generated
     */
    PartsPackageBto selectByPrimaryKey(String partspackageId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PartsPackageBto record, @Param("example") PartsPackageBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PartsPackageBto record, @Param("example") PartsPackageBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PartsPackageBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PartsPackageBto record);
}