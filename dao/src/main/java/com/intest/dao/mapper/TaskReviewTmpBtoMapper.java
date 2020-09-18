package com.intest.dao.mapper;

import com.intest.dao.entity.TaskReviewTmpBto;
import com.intest.dao.entity.TaskReviewTmpBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskReviewTmpBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TaskReviewTmpBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TaskReviewTmpBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String taskreviewtmpId);

    /**
     *
     * @mbg.generated
     */
    int insert(TaskReviewTmpBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TaskReviewTmpBto record);

    /**
     *
     * @mbg.generated
     */
    List<TaskReviewTmpBto> selectByExample(TaskReviewTmpBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TaskReviewTmpBto selectByPrimaryKey(String taskreviewtmpId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskReviewTmpBto record, @Param("example") TaskReviewTmpBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskReviewTmpBto record, @Param("example") TaskReviewTmpBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskReviewTmpBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskReviewTmpBto record);
}