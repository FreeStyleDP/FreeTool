package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFlowDerive;
import com.adtec.jfBuilder.entity.EstFlowDeriveKey;

public interface EstFlowDeriveMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstFlowDeriveKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFlowDerive record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFlowDerive record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFlowDerive selectByPrimaryKey(EstFlowDeriveKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFlowDerive record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFlowDerive record);
}