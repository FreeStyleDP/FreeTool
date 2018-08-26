package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDatadict;

public interface EstDatadictMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String dataId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDatadict record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDatadict record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDatadict selectByPrimaryKey(String dataId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDatadict record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDatadict record);
}