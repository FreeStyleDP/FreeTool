package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstEnum;

public interface EstEnumMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String enumId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstEnum record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstEnum record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstEnum selectByPrimaryKey(String enumId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstEnum record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstEnum record);
}