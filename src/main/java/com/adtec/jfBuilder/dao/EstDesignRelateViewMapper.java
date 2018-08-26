package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignRelateView;

public interface EstDesignRelateViewMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String viewId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignRelateView record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignRelateView record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignRelateView selectByPrimaryKey(String viewId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignRelateView record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignRelateView record);
}