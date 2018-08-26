package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCode;
import com.adtec.jfBuilder.entity.EstCodeKey;

public interface EstCodeMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstCode selectByPrimaryKey(EstCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstCode record);
}