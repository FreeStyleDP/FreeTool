package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstBus;
import com.adtec.jfBuilder.entity.EstBusKey;

public interface EstBusMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstBusKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstBus record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstBus record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstBus selectByPrimaryKey(EstBusKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstBus record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstBus record);
}