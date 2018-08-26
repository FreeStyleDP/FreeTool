package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstService;

public interface EstServiceMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstService record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstService record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstService selectByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstService record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstService record);
}