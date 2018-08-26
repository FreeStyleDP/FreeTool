package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFactoryClass;

public interface EstFactoryClassMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String factoryId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFactoryClass record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFactoryClass record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFactoryClass selectByPrimaryKey(String factoryId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFactoryClass record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFactoryClass record);
}