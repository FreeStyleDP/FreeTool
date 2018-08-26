package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstPropertyValueList;

public interface EstPropertyValueListMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String valueId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstPropertyValueList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstPropertyValueList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstPropertyValueList selectByPrimaryKey(String valueId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstPropertyValueList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstPropertyValueList record);
}