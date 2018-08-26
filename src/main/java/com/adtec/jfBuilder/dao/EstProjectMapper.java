package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstProject;

public interface EstProjectMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String projectId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstProject record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstProject record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstProject selectByPrimaryKey(String projectId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstProject record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstProject record);
}