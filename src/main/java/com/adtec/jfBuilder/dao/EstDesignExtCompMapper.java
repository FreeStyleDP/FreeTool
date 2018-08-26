package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignExtComp;

public interface EstDesignExtCompMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String esId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignExtComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignExtComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignExtComp selectByPrimaryKey(String esId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignExtComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignExtComp record);
}