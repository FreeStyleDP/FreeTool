package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSqlDosList;

public interface EstDesignSqlDosListMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String sublistId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignSqlDosList selectByPrimaryKey(String sublistId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeyWithBLOBs(EstDesignSqlDosList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignSqlDosList record);
}