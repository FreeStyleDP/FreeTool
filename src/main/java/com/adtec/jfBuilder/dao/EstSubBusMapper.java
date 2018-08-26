package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSubBus;
import com.adtec.jfBuilder.entity.EstSubBusKey;

public interface EstSubBusMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstSubBusKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstSubBus record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstSubBus record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstSubBus selectByPrimaryKey(EstSubBusKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstSubBus record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstSubBus record);
}