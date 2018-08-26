package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignRelateSublist;
import com.adtec.jfBuilder.entity.EstDesignRelateSublistKey;

public interface EstDesignRelateSublistMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDesignRelateSublistKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignRelateSublist record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignRelateSublist record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignRelateSublist selectByPrimaryKey(EstDesignRelateSublistKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignRelateSublist record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignRelateSublist record);
}