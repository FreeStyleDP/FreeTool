package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDataCacheDay;

public interface EstDataCacheDayMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String dataCacheId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDataCacheDay record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDataCacheDay record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDataCacheDay selectByPrimaryKey(String dataCacheId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDataCacheDay record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDataCacheDay record);
}