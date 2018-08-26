package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstEnumValue;

public interface EstEnumValueMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String enumItemId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstEnumValue record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstEnumValue record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstEnumValue selectByPrimaryKey(String enumItemId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstEnumValue record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstEnumValue record);
}