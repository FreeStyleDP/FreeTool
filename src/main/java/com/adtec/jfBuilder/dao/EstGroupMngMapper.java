package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstGroupMng;

public interface EstGroupMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String groupId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstGroupMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstGroupMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstGroupMng selectByPrimaryKey(String groupId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstGroupMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstGroupMng record);
}