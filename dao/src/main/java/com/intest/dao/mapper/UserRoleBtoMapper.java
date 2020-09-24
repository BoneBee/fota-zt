package com.intest.dao.mapper;

import com.intest.dao.entity.UserRoleBto;
import com.intest.dao.entity.UserRoleBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(UserRoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(UserRoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userRoleId);

    /**
     *
     * @mbg.generated
     */
    int insert(UserRoleBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UserRoleBto record);

    /**
     *
     * @mbg.generated
     */
    List<UserRoleBto> selectByExample(UserRoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    UserRoleBto selectByPrimaryKey(String userRoleId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserRoleBto record, @Param("example") UserRoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserRoleBto record, @Param("example") UserRoleBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserRoleBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserRoleBto record);
}