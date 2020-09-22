package com.intest.dao.mapper;

import com.intest.dao.entity.RolePermissionBto;
import com.intest.dao.entity.RolePermissionBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(RolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(RolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String rolepermissionId);

    /**
     *
     * @mbg.generated
     */
    int insert(RolePermissionBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(RolePermissionBto record);

    /**
     *
     * @mbg.generated
     */
    List<RolePermissionBto> selectByExample(RolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    RolePermissionBto selectByPrimaryKey(String rolepermissionId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RolePermissionBto record, @Param("example") RolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RolePermissionBto record, @Param("example") RolePermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RolePermissionBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RolePermissionBto record);
}