package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCloudProject;

public interface EstCloudProjectMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String cloudProjectId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstCloudProject record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstCloudProject record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstCloudProject selectByPrimaryKey(String cloudProjectId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstCloudProject record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstCloudProject record);
}