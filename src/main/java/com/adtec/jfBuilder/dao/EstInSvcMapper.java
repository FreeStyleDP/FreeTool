package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstInSvc;
import com.adtec.jfBuilder.entity.EstInSvcKey;

public interface EstInSvcMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstInSvcKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstInSvc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstInSvc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstInSvc selectByPrimaryKey(EstInSvcKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstInSvc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstInSvc record);
}