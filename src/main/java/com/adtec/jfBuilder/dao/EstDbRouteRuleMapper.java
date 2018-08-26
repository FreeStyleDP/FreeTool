package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbRouteRule;

public interface EstDbRouteRuleMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String dbRuleId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDbRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDbRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDbRouteRule selectByPrimaryKey(String dbRuleId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDbRouteRule record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDbRouteRule record);
}