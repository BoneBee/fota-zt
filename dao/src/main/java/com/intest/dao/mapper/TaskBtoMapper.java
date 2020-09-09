package com.intest.dao.mapper;

import com.intest.dao.entity.TaskBto;
import com.intest.dao.entity.TaskBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TaskBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TaskBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String taskId);

    /**
     *
     * @mbg.generated
     */
    int insert(TaskBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TaskBto record);

    /**
     *
     * @mbg.generated
     */
    List<TaskBto> selectByExample(TaskBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TaskBto selectByPrimaryKey(String taskId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskBto record, @Param("example") TaskBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskBto record, @Param("example") TaskBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskBto record);
}