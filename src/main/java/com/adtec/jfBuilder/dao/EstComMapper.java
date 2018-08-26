package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCom;
import com.adtec.jfBuilder.entity.EstComKey;

public interface EstComMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstComKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstCom record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstCom record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstCom selectByPrimaryKey(EstComKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstCom record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstCom record);
}