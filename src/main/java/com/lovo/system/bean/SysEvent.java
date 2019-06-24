package com.lovo.system.bean;


/**
 * @author che
 * @title: SysEvent 事件类
 * @projectName forestpestproject
 * @description: 事件实体类
 * @date 2019/6/21 15:56
 */
public class SysEvent {

    /**
     * 事件id
     */
    private long eventId;
    /**
     * 地区id
     */
    private long areaId;
    /**
     * 事件名称
     */
    private String eventName;
    /**
     * 事件图片路径
     */
    private String eventImgPath;
    /**
     * 事件发生时间
     */
    private String eventDate;

    /**
     * 时间灾情阶段
     */
    private long eventStage;
    /**
     * 事件灾害类型
     */
    private long eventType;
    /**
     * 事件描述
     */
    private String eventInfo;
    /**
     * 事件发现途径
     */
    private long eventFindWay;
    /**
     * 事件初步损失
     */
    private String eventLose;
    /**
     * 事件影响面积
     */
    private String eventArea;
    /**
     * 事件防治方案
     */
    private String eventMethod;


    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }


    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }


    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public String getEventImgPath() {
        return eventImgPath;
    }

    public void setEventImgPath(String eventImgPath) {
        this.eventImgPath = eventImgPath;
    }


    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }


    public long getEventStage() {
        return eventStage;
    }

    public void setEventStage(long eventStage) {
        this.eventStage = eventStage;
    }


    public long getEventType() {
        return eventType;
    }

    public void setEventType(long eventType) {
        this.eventType = eventType;
    }


    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }


    public long getEventFindWay() {
        return eventFindWay;
    }

    public void setEventFindWay(long eventFindWay) {
        this.eventFindWay = eventFindWay;
    }


    public String getEventLose() {
        return eventLose;
    }

    public void setEventLose(String eventLose) {
        this.eventLose = eventLose;
    }


    public String getEventArea() {
        return eventArea;
    }

    public void setEventArea(String eventArea) {
        this.eventArea = eventArea;
    }


    public String getEventMethod() {
        return eventMethod;
    }

    public void setEventMethod(String eventMethod) {
        this.eventMethod = eventMethod;
    }

}
