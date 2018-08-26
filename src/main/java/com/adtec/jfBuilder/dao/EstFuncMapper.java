package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFunc;

public interface EstFuncMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String funcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFunc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFunc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFunc selectByPrimaryKey(String funcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFunc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFunc record);
}