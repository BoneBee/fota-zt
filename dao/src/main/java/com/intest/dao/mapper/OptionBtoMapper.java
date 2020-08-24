package com.intest.dao.mapper;

import com.intest.dao.entity.OptionBto;
import com.intest.dao.entity.OptionBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptionBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(OptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(OptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String optionId);

    /**
     *
     * @mbg.generated
     */
    int insert(OptionBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(OptionBto record);

    /**
     *
     * @mbg.generated
     */
    List<OptionBto> selectByExample(OptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    OptionBto selectByPrimaryKey(String optionId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OptionBto record, @Param("example") OptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OptionBto record, @Param("example") OptionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OptionBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OptionBto record);
}