package com.intest.dao.mapper;

import com.intest.dao.entity.PartsConfigBto;
import com.intest.dao.entity.PartsConfigBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsConfigBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PartsConfigBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PartsConfigBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String partsconfigId);

    /**
     *
     * @mbg.generated
     */
    int insert(PartsConfigBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PartsConfigBto record);

    /**
     *
     * @mbg.generated
     */
    List<PartsConfigBto> selectByExample(PartsConfigBtoExample example);

    /**
     *
     * @mbg.generated
     */
    PartsConfigBto selectByPrimaryKey(String partsconfigId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PartsConfigBto record, @Param("example") PartsConfigBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PartsConfigBto record, @Param("example") PartsConfigBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PartsConfigBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PartsConfigBto record);
}