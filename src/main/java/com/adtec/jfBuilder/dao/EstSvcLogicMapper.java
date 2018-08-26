package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvcLogic;

public interface EstSvcLogicMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String serviceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstSvcLogic record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstSvcLogic record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstSvcLogic selectByPrimaryKey(String serviceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstSvcLogic record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstSvcLogic record);
}