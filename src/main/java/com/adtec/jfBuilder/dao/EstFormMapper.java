package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstForm;

public interface EstFormMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String formId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstForm record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstForm record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstForm selectByPrimaryKey(String formId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstForm record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstForm record);
}