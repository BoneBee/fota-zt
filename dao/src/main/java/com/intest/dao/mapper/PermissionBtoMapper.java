package com.intest.dao.mapper;

import com.intest.dao.entity.PermissionBto;
import com.intest.dao.entity.PermissionBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(PermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(PermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String permissionId);

    /**
     *
     * @mbg.generated
     */
    int insert(PermissionBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(PermissionBto record);

    /**
     *
     * @mbg.generated
     */
    List<PermissionBto> selectByExample(PermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    PermissionBto selectByPrimaryKey(String permissionId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PermissionBto record, @Param("example") PermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PermissionBto record, @Param("example") PermissionBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PermissionBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PermissionBto record);
}