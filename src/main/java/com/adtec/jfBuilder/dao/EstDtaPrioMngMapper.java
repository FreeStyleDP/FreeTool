package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaPrioMng;
import com.adtec.jfBuilder.entity.EstDtaPrioMngKey;

public interface EstDtaPrioMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDtaPrioMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDtaPrioMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDtaPrioMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDtaPrioMng selectByPrimaryKey(EstDtaPrioMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDtaPrioMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDtaPrioMng record);
}