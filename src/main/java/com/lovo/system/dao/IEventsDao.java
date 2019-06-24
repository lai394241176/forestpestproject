package com.lovo.system.dao;

import com.lovo.system.bean.SysEvent;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: IEventsDao 事件持久接口
 * @projectName forestpestproject
 * @description: 事件的持久化
 * @date 2019/6/24 9:51
 */
public interface IEventsDao {

    //================添加====================

    /**
     * 添加事件
     *
     * @param insertEvent 添加事件
     * @return 受影响的行数
     */
    int insertEvent(SysEvent insertEvent);

    //================删除====================
    //================查询====================

    /**
     * 查询所有事件
     *
     * @return 所有事件集合
     */
    List<SysEvent> findAllEvent();

    /**
     * 按照id查询事件
     *
     * @param eventId 事件id
     * @return 事件实体类
     */
    SysEvent findEventById(int eventId);

    /**
     * 条件查询事件
     *
     * @param eventItemMap 事件条件map
     * @return 查询结果
     */
    List<SysEvent> finEventsByItems(Map eventItemMap);

    //================修改====================

    /**
     * 申请专家会商
     *
     * @param eventId 事件id
     * @return 受影响的行数
     */
    int sendEventToDoctor(int eventId);

    /**
     * 修改事件信息
     *
     * @param updateEventMap 修改事件信息map
     * @return 受影响的行数
     */
    int updateEvent(Map updateEventMap);
}
