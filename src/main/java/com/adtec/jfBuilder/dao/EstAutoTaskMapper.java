package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstAutoTask;

public interface EstAutoTaskMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String serviceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstAutoTask record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstAutoTask record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstAutoTask selectByPrimaryKey(String serviceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstAutoTask record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstAutoTask record);
}