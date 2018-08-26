package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstEnvMng;

public interface EstEnvMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String envId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstEnvMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstEnvMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstEnvMng selectByPrimaryKey(String envId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstEnvMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstEnvMng record);
}