package com.intest.dao.mapper;

import com.intest.dao.entity.TerminalBto;
import com.intest.dao.entity.TerminalBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(TerminalBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(TerminalBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String terminalId);

    /**
     *
     * @mbg.generated
     */
    int insert(TerminalBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(TerminalBto record);

    /**
     *
     * @mbg.generated
     */
    List<TerminalBto> selectByExample(TerminalBtoExample example);

    /**
     *
     * @mbg.generated
     */
    TerminalBto selectByPrimaryKey(String terminalId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TerminalBto record, @Param("example") TerminalBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TerminalBto record, @Param("example") TerminalBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TerminalBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TerminalBto record);
}