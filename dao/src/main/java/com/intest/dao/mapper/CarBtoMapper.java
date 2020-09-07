package com.intest.dao.mapper;

import com.intest.dao.entity.CarBto;
import com.intest.dao.entity.CarBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(CarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(CarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String carId);

    /**
     *
     * @mbg.generated
     */
    int insert(CarBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(CarBto record);

    /**
     *
     * @mbg.generated
     */
    List<CarBto> selectByExample(CarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    CarBto selectByPrimaryKey(String carId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CarBto record, @Param("example") CarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CarBto record, @Param("example") CarBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CarBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CarBto record);
}