package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbColumn;
import com.adtec.jfBuilder.entity.EstDbColumnKey;

public interface EstDbColumnMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDbColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDbColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDbColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDbColumn selectByPrimaryKey(EstDbColumnKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDbColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDbColumn record);
}