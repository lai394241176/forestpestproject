package com.lovo.system.service;

import com.lovo.system.bean.SysClass;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: IClassService 小班业务接口
 * @projectName forestpestproject
 * @description: 小班的增加、修改、查询
 * @date 2019/6/24 14:05
 */
public interface IClassService {


    //================添加=====================

    /**
     * 添加小班
     *
     * @param insertArea 添加小班
     * @return 受影响的行数
     */
    int insertClass(SysClass insertArea);

    //================查询=====================

    /**
     * 查询所有小班
     *
     * @return 所有小班集合
     */
    List<SysClass> findAllClass();

    /**
     * 按id查询小班
     *
     * @param classId 小班id
     * @return 小班对象
     */
    SysClass findClassById(int classId);

    /**
     * 条件查询小班
     *
     * @param classItemMap 小班查询条件map
     * @return 查询结果小班集合
     */
    List<SysClass> findClassByItems(Map classItemMap);

    //================修改=====================

    /**
     * 修改小班信息
     *
     * @param classUpdateMap 修改小班信息map
     * @return 受影响的行数
     */
    int updateClass(Map classUpdateMap);
}
