package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignProcedureItems;
import com.adtec.jfBuilder.entity.EstDesignProcedureItemsKey;

public interface EstDesignProcedureItemsMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDesignProcedureItemsKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignProcedureItems record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignProcedureItems record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignProcedureItems selectByPrimaryKey(EstDesignProcedureItemsKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignProcedureItems record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignProcedureItems record);
}