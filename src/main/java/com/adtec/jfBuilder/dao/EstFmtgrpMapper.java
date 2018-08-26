package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstFmtgrp;
import com.adtec.jfBuilder.entity.EstFmtgrpKey;

public interface EstFmtgrpMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstFmtgrpKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstFmtgrp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstFmtgrp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstFmtgrp selectByPrimaryKey(EstFmtgrpKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstFmtgrp record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstFmtgrp record);
}