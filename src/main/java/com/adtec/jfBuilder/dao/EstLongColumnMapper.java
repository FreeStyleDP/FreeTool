package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstLongColumn;
import com.adtec.jfBuilder.entity.EstLongColumnKey;

public interface EstLongColumnMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstLongColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstLongColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstLongColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstLongColumn selectByPrimaryKey(EstLongColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstLongColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstLongColumn record);
}