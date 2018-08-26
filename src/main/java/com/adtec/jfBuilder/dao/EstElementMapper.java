package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstElement;

public interface EstElementMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String elemId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstElement record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstElement record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstElement selectByPrimaryKey(String elemId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstElement record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstElement record);
}