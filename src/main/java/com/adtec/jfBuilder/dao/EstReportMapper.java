package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstReport;

public interface EstReportMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String reportId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstReport record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstReport record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstReport selectByPrimaryKey(String reportId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstReport record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeyWithBLOBs(EstReport record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstReport record);
}