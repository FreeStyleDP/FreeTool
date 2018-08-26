package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstBeanProperty;

public interface EstBeanPropertyMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String propertyId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstBeanProperty record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstBeanProperty record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstBeanProperty selectByPrimaryKey(String propertyId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstBeanProperty record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstBeanProperty record);
}