package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSysinfoMng;
import com.adtec.jfBuilder.entity.EstSysinfoMngKey;

public interface EstSysinfoMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstSysinfoMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstSysinfoMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstSysinfoMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstSysinfoMng selectByPrimaryKey(EstSysinfoMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstSysinfoMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstSysinfoMng record);
}