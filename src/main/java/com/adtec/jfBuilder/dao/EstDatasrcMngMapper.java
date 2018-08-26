package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDatasrcMng;

public interface EstDatasrcMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String datasrcMngId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDatasrcMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDatasrcMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDatasrcMng selectByPrimaryKey(String datasrcMngId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDatasrcMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDatasrcMng record);
}