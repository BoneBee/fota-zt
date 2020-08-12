package com.intest.dao.mapper;

import com.intest.dao.entity.UploadFile;
import com.intest.dao.entity.UploadFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    long countByExample(UploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByExample(UploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int deleteByPrimaryKey(String uploadfileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insert(UploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int insertSelective(UploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    List<UploadFile> selectByExample(UploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    UploadFile selectByPrimaryKey(String uploadfileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByExample(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKeySelective(UploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table F_UPLOADFILE
     *
     * @mbg.generated Wed Aug 12 10:43:19 CST 2020
     */
    int updateByPrimaryKey(UploadFile record);
}