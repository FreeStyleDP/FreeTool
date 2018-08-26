package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstTestCombineSvc;

public interface EstTestCombineSvcMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String combineSvcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstTestCombineSvc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstTestCombineSvc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstTestCombineSvc selectByPrimaryKey(String combineSvcId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstTestCombineSvc record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstTestCombineSvc record);
}