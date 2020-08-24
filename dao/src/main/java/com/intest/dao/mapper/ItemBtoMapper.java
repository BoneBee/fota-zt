package com.intest.dao.mapper;

import com.intest.dao.entity.ItemBto;
import com.intest.dao.entity.ItemBtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemBtoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(ItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(ItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String itemId);

    /**
     *
     * @mbg.generated
     */
    int insert(ItemBto record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(ItemBto record);

    /**
     *
     * @mbg.generated
     */
    List<ItemBto> selectByExample(ItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    ItemBto selectByPrimaryKey(String itemId);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ItemBto record, @Param("example") ItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ItemBto record, @Param("example") ItemBtoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ItemBto record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ItemBto record);
}