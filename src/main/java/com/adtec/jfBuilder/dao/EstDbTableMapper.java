package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbTable;

public interface EstDbTableMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(Integer tabid);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDbTable record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDbTable record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDbTable selectByPrimaryKey(Integer tabid);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDbTable record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDbTable record);
}