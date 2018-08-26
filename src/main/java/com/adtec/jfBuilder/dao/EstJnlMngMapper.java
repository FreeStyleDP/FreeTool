package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstJnlMng;
import com.adtec.jfBuilder.entity.EstJnlMngKey;

public interface EstJnlMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstJnlMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstJnlMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstJnlMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstJnlMng selectByPrimaryKey(EstJnlMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstJnlMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstJnlMng record);
}