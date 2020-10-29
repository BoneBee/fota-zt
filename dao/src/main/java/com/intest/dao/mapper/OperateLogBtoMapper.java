package com.intest.dao.mapper;

import com.intest.dao.entity.OperateLogBto;
import com.intest.dao.entity.OperateLogBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperateLogBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(OperateLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(OperateLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String operateId);

    /**
     *
     * @mbg.generated
     */
    int insert(OperateLogBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(OperateLogBto record);

    /**
     *
     * @mbg.generated
     */
    List<OperateLogBto> selectByExample(OperateLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    OperateLogBto selectByPrimaryKey(String operateId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OperateLogBto record, @Param("example") OperateLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OperateLogBto record, @Param("example") OperateLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OperateLogBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OperateLogBto record);
}