package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCustom;

public interface EstCustomMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String customId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstCustom record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstCustom record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstCustom selectByPrimaryKey(String customId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstCustom record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstCustom record);
}