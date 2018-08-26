package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDebug;

public interface EstDebugMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String unionId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDebug record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDebug record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDebug selectByPrimaryKey(String unionId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDebug record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDebug record);
}