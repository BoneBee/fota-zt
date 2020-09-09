package com.intest.dao.mapper;

import com.intest.dao.entity.CarTypeBto;
import com.intest.dao.entity.CarTypeBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarTypeBtoMapper {

    long countByExample(CarTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(CarTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String cartypeId);

    /**
     *
     * @mbg.generated
     */
    int insert(CarTypeBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(CarTypeBto record);

    /**
     *
     * @mbg.generated
     */
    List<CarTypeBto> selectByExample(CarTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    CarTypeBto selectByPrimaryKey(String cartypeId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CarTypeBto record, @Param("example") CarTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CarTypeBto record, @Param("example") CarTypeBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CarTypeBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CarTypeBto record);
}