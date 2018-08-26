package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvcLogicProc;
import com.adtec.jfBuilder.entity.EstSvcLogicProcKey;

public interface EstSvcLogicProcMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstSvcLogicProcKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstSvcLogicProc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstSvcLogicProc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstSvcLogicProc selectByPrimaryKey(EstSvcLogicProcKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstSvcLogicProc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstSvcLogicProc record);
}