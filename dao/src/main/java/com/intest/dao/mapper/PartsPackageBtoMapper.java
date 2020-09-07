package com.intest.dao.mapper;

import com.intest.dao.entity.PartsPackageBto;
import com.intest.dao.entity.PartsPackageBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsPackageBtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    long countByExample(PartsPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int deleteByExample(PartsPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int deleteByPrimaryKey(String partspackageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int insert(PartsPackageBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int insertSelective(PartsPackageBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    List<PartsPackageBto> selectByExample(PartsPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    PartsPackageBto selectByPrimaryKey(String partspackageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int updateByExampleSelective(@Param("record") PartsPackageBto record, @Param("example") PartsPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int updateByExample(@Param("record") PartsPackageBto record, @Param("example") PartsPackageBtoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int updateByPrimaryKeySelective(PartsPackageBto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_PARTSPACKAGE
     *
     * @mbg.generated Fri Sep 04 16:29:54 CST 2020
     */
    int updateByPrimaryKey(PartsPackageBto record);
}