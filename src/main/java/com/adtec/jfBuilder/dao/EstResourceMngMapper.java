package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstResourceMng;

public interface EstResourceMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String resourceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstResourceMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstResourceMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstResourceMng selectByPrimaryKey(String resourceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstResourceMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstResourceMng record);
}