package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstElementItem;

public interface EstElementItemMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String elemItemId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstElementItem record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstElementItem record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstElementItem selectByPrimaryKey(String elemItemId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstElementItem record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstElementItem record);
}