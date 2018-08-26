package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstAutoTaskDay;

public interface EstAutoTaskDayMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String serviceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstAutoTaskDay record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstAutoTaskDay record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstAutoTaskDay selectByPrimaryKey(String serviceId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstAutoTaskDay record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstAutoTaskDay record);
}