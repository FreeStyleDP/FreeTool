package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFlowImage;

public interface EstFlowImageMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFlowImage record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFlowImage record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFlowImage selectByPrimaryKey(String svcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFlowImage record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeyWithBLOBs(EstFlowImage record);
}