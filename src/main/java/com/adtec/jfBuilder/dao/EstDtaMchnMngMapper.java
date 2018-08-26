package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDtaMchnMng;
import com.adtec.jfBuilder.entity.EstDtaMchnMngKey;

public interface EstDtaMchnMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDtaMchnMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDtaMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDtaMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDtaMchnMng selectByPrimaryKey(EstDtaMchnMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDtaMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDtaMchnMng record);
}