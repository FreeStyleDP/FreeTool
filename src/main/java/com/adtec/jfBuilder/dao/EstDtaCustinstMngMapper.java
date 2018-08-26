package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaCustinstMng;
import com.adtec.jfBuilder.entity.EstDtaCustinstMngKey;

public interface EstDtaCustinstMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDtaCustinstMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDtaCustinstMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDtaCustinstMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDtaCustinstMng selectByPrimaryKey(EstDtaCustinstMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDtaCustinstMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDtaCustinstMng record);
}