package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvcRuleDef;

public interface EstSvcRuleDefMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstSvcRuleDef record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstSvcRuleDef record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstSvcRuleDef selectByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstSvcRuleDef record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstSvcRuleDef record);
}