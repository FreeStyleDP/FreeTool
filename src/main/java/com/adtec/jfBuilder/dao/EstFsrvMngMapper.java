package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFsrvMng;
import com.adtec.jfBuilder.entity.EstFsrvMngKey;

public interface EstFsrvMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstFsrvMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFsrvMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFsrvMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFsrvMng selectByPrimaryKey(EstFsrvMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFsrvMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFsrvMng record);
}