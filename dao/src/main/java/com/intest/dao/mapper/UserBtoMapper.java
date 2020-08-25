package com.intest.dao.mapper;

import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.UserBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(UserBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(UserBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userId);

    /**
     *
     * @mbg.generated
     */
    int insert(UserBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UserBto record);

    /**
     *
     * @mbg.generated
     */
    List<UserBto> selectByExample(UserBtoExample example);

    /**
     *
     * @mbg.generated
     */
    UserBto selectByPrimaryKey(String userId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserBto record, @Param("example") UserBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserBto record, @Param("example") UserBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserBto record);
}