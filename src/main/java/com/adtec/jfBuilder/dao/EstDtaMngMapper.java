package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaMng;
import com.adtec.jfBuilder.entity.EstDtaMngKey;

public interface EstDtaMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDtaMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDtaMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDtaMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDtaMng selectByPrimaryKey(EstDtaMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDtaMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDtaMng record);
}