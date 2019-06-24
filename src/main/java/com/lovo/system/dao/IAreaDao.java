package com.lovo.system.dao;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: IAreaDao 地区持久接口
 * @projectName forestpestproject
 * @description: 地区持久接口
 * @date 2019/6/24 9:25
 */
public interface IAreaDao {

    //===================添加======================

    /**
     * 添加地区
     *
     * @param insertArea 添加的小班
     * @return 受影响的行数
     */
    int insertArea(SysArea insertArea);

    //===================查询======================

    /**
     * 查询所有地区
     *
     * @return 地区集合
     */
    List<SysArea> findAllArea();


    /**
     * 条件查询地区
     *
     * @param findItems 查询条件Map
     * @return 查询结果地区集合
     */
    List<SysArea> findAreaByItems(Map findItems);

}
