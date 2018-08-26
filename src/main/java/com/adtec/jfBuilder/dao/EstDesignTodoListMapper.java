package com.adtec.jfBuilder.dao;

import com.adtec.jfBuilder.entity.EstDesignTodoList;

public interface EstDesignTodoListMapper {
    /**
     *
     * @mbggenerated 2018-08-26
     */
    int deleteByPrimaryKey(String todoId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insert(EstDesignTodoList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int insertSelective(EstDesignTodoList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    EstDesignTodoList selectByPrimaryKey(String todoId);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKeySelective(EstDesignTodoList record);

    /**
     *
     * @mbggenerated 2018-08-26
     */
    int updateByPrimaryKey(EstDesignTodoList record);
}