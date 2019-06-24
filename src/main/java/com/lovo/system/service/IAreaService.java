package com.lovo.system.service;

import com.lovo.system.bean.SysArea;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: IAreaService 地区业务接口
 * @projectName forestpestproject
 * @description: 地区的添加、查询
 * @date 2019/6/24 13:14
 */
public interface IAreaService {

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
