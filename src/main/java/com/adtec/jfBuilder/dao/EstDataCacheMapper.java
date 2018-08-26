package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDataCache;
import com.adtec.jfBuilder.entity.EstDataCacheKey;

public interface EstDataCacheMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDataCacheKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDataCache record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDataCache record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDataCache selectByPrimaryKey(EstDataCacheKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDataCache record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDataCache record);
}