package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstSvcCatalogMng;
import com.adtec.jfBuilder.entity.EstSvcCatalogMngKey;

public interface EstSvcCatalogMngMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstSvcCatalogMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstSvcCatalogMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstSvcCatalogMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstSvcCatalogMng selectByPrimaryKey(EstSvcCatalogMngKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstSvcCatalogMng record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstSvcCatalogMng record);
}