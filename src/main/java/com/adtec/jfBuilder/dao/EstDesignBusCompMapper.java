package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignBusComp;
import com.adtec.jfBuilder.entity.EstDesignBusCompKey;

public interface EstDesignBusCompMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDesignBusCompKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignBusComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignBusComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignBusComp selectByPrimaryKey(EstDesignBusCompKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignBusComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignBusComp record);
}