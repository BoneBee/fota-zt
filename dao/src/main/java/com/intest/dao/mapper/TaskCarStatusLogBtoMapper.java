package com.intest.dao.mapper;

import com.intest.dao.entity.TaskCarStatusLogBto;
import com.intest.dao.entity.TaskCarStatusLogBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskCarStatusLogBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TaskCarStatusLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TaskCarStatusLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String taskcarstatuslogId);

    /**
     *
     * @mbg.generated
     */
    int insert(TaskCarStatusLogBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TaskCarStatusLogBto record);

    /**
     *
     * @mbg.generated
     */
    List<TaskCarStatusLogBto> selectByExample(TaskCarStatusLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TaskCarStatusLogBto selectByPrimaryKey(String taskcarstatuslogId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskCarStatusLogBto record, @Param("example") TaskCarStatusLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskCarStatusLogBto record, @Param("example") TaskCarStatusLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskCarStatusLogBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskCarStatusLogBto record);
}