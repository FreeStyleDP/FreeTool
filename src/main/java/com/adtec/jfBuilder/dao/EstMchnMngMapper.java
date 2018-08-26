package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstMchnMng;

public interface EstMchnMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String mchnId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstMchnMng selectByPrimaryKey(String mchnId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstMchnMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstMchnMng record);
}