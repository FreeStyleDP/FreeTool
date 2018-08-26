package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignTable;

public interface EstDesignTableMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String tableId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignTable record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignTable record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignTable selectByPrimaryKey(String tableId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignTable record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignTable record);
}