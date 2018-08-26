package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFuncCode;
import com.adtec.jfBuilder.entity.EstFuncCodeKey;

public interface EstFuncCodeMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstFuncCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFuncCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFuncCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFuncCode selectByPrimaryKey(EstFuncCodeKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFuncCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFuncCode record);
}