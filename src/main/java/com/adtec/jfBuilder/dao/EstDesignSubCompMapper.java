package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignSubComp;
import com.adtec.jfBuilder.entity.EstDesignSubCompKey;

public interface EstDesignSubCompMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDesignSubCompKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignSubComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignSubComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignSubComp selectByPrimaryKey(EstDesignSubCompKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignSubComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignSubComp record);
}