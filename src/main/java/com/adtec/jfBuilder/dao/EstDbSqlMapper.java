package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbSql;
import com.adtec.jfBuilder.entity.EstDbSqlKey;

public interface EstDbSqlMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDbSqlKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDbSql record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDbSql record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDbSql selectByPrimaryKey(EstDbSqlKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDbSql record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDbSql record);
}