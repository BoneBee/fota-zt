package com.intest.dao.mapper;

import com.intest.dao.entity.TaskCarBto;
import com.intest.dao.entity.TaskCarBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskCarBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TaskCarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TaskCarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String taskcarId);

    /**
     *
     * @mbg.generated
     */
    int insert(TaskCarBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TaskCarBto record);

    /**
     *
     * @mbg.generated
     */
    List<TaskCarBto> selectByExample(TaskCarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TaskCarBto selectByPrimaryKey(String taskcarId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskCarBto record, @Param("example") TaskCarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskCarBto record, @Param("example") TaskCarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskCarBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskCarBto record);
}