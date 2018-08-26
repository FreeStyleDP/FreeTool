package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstUserMng;

public interface EstUserMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String userName);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstUserMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstUserMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstUserMng selectByPrimaryKey(String userName);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstUserMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstUserMng record);
}