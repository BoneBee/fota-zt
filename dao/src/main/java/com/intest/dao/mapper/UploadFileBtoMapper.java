package com.intest.dao.mapper;

import com.intest.dao.entity.UploadFileBto;
import com.intest.dao.entity.UploadFileBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFileBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(UploadFileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(UploadFileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String uploadfileId);

    /**
     *
     * @mbg.generated
     */
    int insert(UploadFileBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UploadFileBto record);

    /**
     *
     * @mbg.generated
     */
    List<UploadFileBto> selectByExample(UploadFileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    UploadFileBto selectByPrimaryKey(String uploadfileId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UploadFileBto record, @Param("example") UploadFileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UploadFileBto record, @Param("example") UploadFileBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UploadFileBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UploadFileBto record);
}