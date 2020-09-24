package com.intest.dao.mapper;

import com.intest.dao.entity.UserRolePermissionBto;
import com.intest.dao.entity.UserRolePermissionBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolePermissionBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(UserRolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(UserRolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userRolePermissionId);

    /**
     *
     * @mbg.generated
     */
    int insert(UserRolePermissionBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UserRolePermissionBto record);

    /**
     *
     * @mbg.generated
     */
    List<UserRolePermissionBto> selectByExample(UserRolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    UserRolePermissionBto selectByPrimaryKey(String userRolePermissionId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserRolePermissionBto record, @Param("example") UserRolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserRolePermissionBto record, @Param("example") UserRolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserRolePermissionBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserRolePermissionBto record);
}