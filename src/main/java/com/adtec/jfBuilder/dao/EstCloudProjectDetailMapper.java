package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCloudProjectDetail;

public interface EstCloudProjectDetailMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String detailId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstCloudProjectDetail record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstCloudProjectDetail record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstCloudProjectDetail selectByPrimaryKey(String detailId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstCloudProjectDetail record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstCloudProjectDetail record);
}