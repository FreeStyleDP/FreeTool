package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstNodeMng;
import com.adtec.jfBuilder.entity.EstNodeMngKey;

public interface EstNodeMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstNodeMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstNodeMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstNodeMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstNodeMng selectByPrimaryKey(EstNodeMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstNodeMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstNodeMng record);
}