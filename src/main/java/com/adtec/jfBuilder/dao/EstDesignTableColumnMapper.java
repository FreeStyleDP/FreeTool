package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignTableColumn;

public interface EstDesignTableColumnMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String columnId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignTableColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignTableColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignTableColumn selectByPrimaryKey(String columnId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignTableColumn record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignTableColumn record);
}