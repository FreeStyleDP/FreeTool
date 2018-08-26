package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstAddress;
import com.adtec.jfBuilder.entity.EstAddressKey;

public interface EstAddressMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstAddressKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstAddress record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstAddress record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstAddress selectByPrimaryKey(EstAddressKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstAddress record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstAddress record);
}