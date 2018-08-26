package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignBeginComp;

public interface EstDesignBeginCompMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String beginId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignBeginComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignBeginComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignBeginComp selectByPrimaryKey(String beginId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignBeginComp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignBeginComp record);
}