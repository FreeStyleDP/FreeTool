package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDrqSeqMng;
import com.adtec.jfBuilder.entity.EstDrqSeqMngKey;

public interface EstDrqSeqMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDrqSeqMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDrqSeqMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDrqSeqMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDrqSeqMng selectByPrimaryKey(EstDrqSeqMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDrqSeqMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDrqSeqMng record);
}