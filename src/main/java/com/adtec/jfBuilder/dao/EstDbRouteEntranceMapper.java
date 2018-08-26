package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDbRouteEntrance;
import com.adtec.jfBuilder.entity.EstDbRouteEntranceKey;

public interface EstDbRouteEntranceMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDbRouteEntranceKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDbRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDbRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDbRouteEntrance selectByPrimaryKey(EstDbRouteEntranceKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDbRouteEntrance record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDbRouteEntrance record);
}