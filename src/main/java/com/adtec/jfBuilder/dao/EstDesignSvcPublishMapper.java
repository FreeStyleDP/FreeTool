package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSvcPublish;

public interface EstDesignSvcPublishMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String svcPublishId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignSvcPublish record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignSvcPublish record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignSvcPublish selectByPrimaryKey(String svcPublishId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignSvcPublish record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignSvcPublish record);
}