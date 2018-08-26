package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstResourceNode;
import com.adtec.jfBuilder.entity.EstResourceNodeKey;

public interface EstResourceNodeMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstResourceNodeKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstResourceNode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstResourceNode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstResourceNode selectByPrimaryKey(EstResourceNodeKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstResourceNode record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstResourceNode record);
}