package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstElmap;

public interface EstElmapMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String elmapId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstElmap record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstElmap record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstElmap selectByPrimaryKey(String elmapId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstElmap record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstElmap record);
}