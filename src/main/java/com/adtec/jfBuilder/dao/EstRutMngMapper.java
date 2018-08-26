package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstRutMng;
import com.adtec.jfBuilder.entity.EstRutMngKey;

public interface EstRutMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstRutMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstRutMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstRutMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstRutMng selectByPrimaryKey(EstRutMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstRutMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstRutMng record);
}