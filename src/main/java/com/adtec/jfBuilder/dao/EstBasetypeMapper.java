package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstBasetype;

public interface EstBasetypeMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String basetypeId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstBasetype record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstBasetype record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstBasetype selectByPrimaryKey(String basetypeId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstBasetype record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstBasetype record);
}