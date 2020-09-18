package com.intest.dao.mapper;

import com.intest.dao.entity.TaskReviewTmpDetileBto;
import com.intest.dao.entity.TaskReviewTmpDetileBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskReviewTmpDetileBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TaskReviewTmpDetileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TaskReviewTmpDetileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String taskreviewtmpdetaileId);

    /**
     *
     * @mbg.generated
     */
    int insert(TaskReviewTmpDetileBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TaskReviewTmpDetileBto record);

    /**
     *
     * @mbg.generated
     */
    List<TaskReviewTmpDetileBto> selectByExample(TaskReviewTmpDetileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TaskReviewTmpDetileBto selectByPrimaryKey(String taskreviewtmpdetaileId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskReviewTmpDetileBto record, @Param("example") TaskReviewTmpDetileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskReviewTmpDetileBto record, @Param("example") TaskReviewTmpDetileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskReviewTmpDetileBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskReviewTmpDetileBto record);
}