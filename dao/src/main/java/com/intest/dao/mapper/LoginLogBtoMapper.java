package com.intest.dao.mapper;

import com.intest.dao.entity.LoginLogBto;
import com.intest.dao.entity.LoginLogBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginLogBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(LoginLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(LoginLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String loginlogId);

    /**
     *
     * @mbg.generated
     */
    int insert(LoginLogBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(LoginLogBto record);

    /**
     *
     * @mbg.generated
     */
    List<LoginLogBto> selectByExample(LoginLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    LoginLogBto selectByPrimaryKey(String loginlogId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LoginLogBto record, @Param("example") LoginLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LoginLogBto record, @Param("example") LoginLogBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LoginLogBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LoginLogBto record);
}