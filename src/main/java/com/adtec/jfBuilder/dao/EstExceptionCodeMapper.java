package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstExceptionCode;

public interface EstExceptionCodeMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String exceptionCodeId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstExceptionCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstExceptionCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstExceptionCode selectByPrimaryKey(String exceptionCodeId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstExceptionCode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstExceptionCode record);
}