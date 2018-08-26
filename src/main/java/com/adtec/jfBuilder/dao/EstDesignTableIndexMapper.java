package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignTableIndex;

public interface EstDesignTableIndexMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String indexId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignTableIndex record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignTableIndex record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignTableIndex selectByPrimaryKey(String indexId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignTableIndex record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignTableIndex record);
}