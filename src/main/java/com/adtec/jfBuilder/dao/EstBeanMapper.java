package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstBean;

public interface EstBeanMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String beanId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstBean record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstBean record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstBean selectByPrimaryKey(String beanId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstBean record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstBean record);
}