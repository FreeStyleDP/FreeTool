package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFormat;

public interface EstFormatMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String fmtId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFormat record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFormat record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFormat selectByPrimaryKey(String fmtId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFormat record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFormat record);
}