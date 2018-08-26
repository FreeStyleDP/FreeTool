package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbMng;

public interface EstDbMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String dbMngId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDbMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDbMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDbMng selectByPrimaryKey(String dbMngId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDbMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDbMng record);
}