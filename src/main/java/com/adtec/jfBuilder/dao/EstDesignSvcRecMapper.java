package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSvcRec;

public interface EstDesignSvcRecMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String svcRecId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignSvcRec record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignSvcRec record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignSvcRec selectByPrimaryKey(String svcRecId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignSvcRec record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignSvcRec record);
}