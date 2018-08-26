package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDsAlias;

public interface EstDsAliasMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String dsId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDsAlias record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDsAlias record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDsAlias selectByPrimaryKey(String dsId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDsAlias record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDsAlias record);
}