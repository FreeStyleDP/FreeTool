package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignImage;
import com.adtec.jfBuilder.entity.EstDesignImageKey;
import com.adtec.jfBuilder.entity.EstDesignImageWithBLOBs;

public interface EstDesignImageMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(EstDesignImageKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignImageWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignImageWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignImageWithBLOBs selectByPrimaryKey(EstDesignImageKey key);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignImageWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeyWithBLOBs(EstDesignImageWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignImage record);
}