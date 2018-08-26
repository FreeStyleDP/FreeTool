package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstTestSingleSvc;
import com.adtec.jfBuilder.entity.EstTestSingleSvcWithBLOBs;

public interface EstTestSingleSvcMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String singleSvcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstTestSingleSvcWithBLOBs selectByPrimaryKey(String singleSvcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeyWithBLOBs(EstTestSingleSvcWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstTestSingleSvc record);
}