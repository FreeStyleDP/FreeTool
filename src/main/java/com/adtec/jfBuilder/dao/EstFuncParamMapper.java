package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFuncParam;
import com.adtec.jfBuilder.entity.EstFuncParamKey;

public interface EstFuncParamMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstFuncParamKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFuncParam record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFuncParam record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFuncParam selectByPrimaryKey(EstFuncParamKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFuncParam record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFuncParam record);
}