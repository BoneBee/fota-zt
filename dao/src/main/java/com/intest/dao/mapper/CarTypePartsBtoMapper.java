package com.intest.dao.mapper;

import com.intest.dao.entity.CarTypePartsBto;
import com.intest.dao.entity.CarTypePartsBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarTypePartsBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(CarTypePartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(CarTypePartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String cartypepartsId);

    /**
     *
     * @mbg.generated
     */
    int insert(CarTypePartsBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(CarTypePartsBto record);

    /**
     *
     * @mbg.generated
     */
    List<CarTypePartsBto> selectByExample(CarTypePartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    CarTypePartsBto selectByPrimaryKey(String cartypepartsId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CarTypePartsBto record, @Param("example") CarTypePartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CarTypePartsBto record, @Param("example") CarTypePartsBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CarTypePartsBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CarTypePartsBto record);
}