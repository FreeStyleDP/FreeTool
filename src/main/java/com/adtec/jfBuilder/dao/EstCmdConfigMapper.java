package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstCmdConfig;

public interface EstCmdConfigMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String adapterName);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstCmdConfig record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstCmdConfig record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstCmdConfig selectByPrimaryKey(String adapterName);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstCmdConfig record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstCmdConfig record);
}