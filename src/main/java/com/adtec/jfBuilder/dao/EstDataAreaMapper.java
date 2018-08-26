package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDataArea;

public interface EstDataAreaMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String dataAreaId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDataArea record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDataArea record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDataArea selectByPrimaryKey(String dataAreaId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDataArea record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDataArea record);
}