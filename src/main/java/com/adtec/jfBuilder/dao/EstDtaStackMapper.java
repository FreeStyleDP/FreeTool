package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaStack;
import com.adtec.jfBuilder.entity.EstDtaStackKey;

public interface EstDtaStackMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDtaStackKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDtaStack record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDtaStack record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDtaStack selectByPrimaryKey(EstDtaStackKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDtaStack record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDtaStack record);
}