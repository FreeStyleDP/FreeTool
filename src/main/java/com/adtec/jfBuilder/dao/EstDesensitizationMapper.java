package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesensitization;

public interface EstDesensitizationMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String desensitizationId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesensitization record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesensitization record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesensitization selectByPrimaryKey(String desensitizationId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesensitization record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesensitization record);
}