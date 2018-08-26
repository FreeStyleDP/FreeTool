package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvrDef;

public interface EstSvrDefMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String svrId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstSvrDef record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstSvrDef record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstSvrDef selectByPrimaryKey(String svrId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstSvrDef record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstSvrDef record);
}