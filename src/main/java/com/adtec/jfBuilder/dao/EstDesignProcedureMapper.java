package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignProcedure;
import com.adtec.jfBuilder.entity.EstDesignProcedureWithBLOBs;

public interface EstDesignProcedureMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String procedureId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignProcedureWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignProcedureWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignProcedureWithBLOBs selectByPrimaryKey(String procedureId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignProcedureWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeyWithBLOBs(EstDesignProcedureWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignProcedure record);
}