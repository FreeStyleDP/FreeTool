package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstAddrMng;
import com.adtec.jfBuilder.entity.EstAddrMngKey;

public interface EstAddrMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstAddrMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstAddrMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstAddrMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstAddrMng selectByPrimaryKey(EstAddrMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstAddrMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstAddrMng record);
}