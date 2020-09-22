package com.intest.dao.mapper;

import com.intest.dao.entity.RoleBto;
import com.intest.dao.entity.RoleBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(RoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(RoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String roleId);

    /**
     *
     * @mbg.generated
     */
    int insert(RoleBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(RoleBto record);

    /**
     *
     * @mbg.generated
     */
    List<RoleBto> selectByExample(RoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    RoleBto selectByPrimaryKey(String roleId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RoleBto record, @Param("example") RoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RoleBto record, @Param("example") RoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RoleBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RoleBto record);
}