package com.lovo.system.bean;


/**
 * @author che
 * @title: SysClass 小班类
 * @projectName forestpestproject
 * @description: 小班实体类
 * @date 2019/6/21 15:56
 */
public class SysClass {

    /**
     * 小班id
     */
    private long sClassId;
    /**
     * 负责地区id
     */
    private long areaId;
    /**
     * 小班名称
     */
    private String sClassName;
    /**
     * 小班领导
     */
    private String sClassLeader;
    /**
     * 小班领导电话
     */
    private String sClassLeaderTel;
    /**
     * 小班人数
     */
    private long sClassNum;
    /**
     * 小班创建日期
     */
    private String sClassStartDate;


    public long getsClassId() {
        return sClassId;
    }

    public void setsClassId(long sClassId) {
        this.sClassId = sClassId;
    }


    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }


    public String getsClassName() {
        return sClassName;
    }

    public void setsClassName(String sClassName) {
        this.sClassName = sClassName;
    }


    public String getsClassLeader() {
        return sClassLeader;
    }

    public void setsClassLeader(String sClassLeader) {
        this.sClassLeader = sClassLeader;
    }


    public String getsClassLeaderTel() {
        return sClassLeaderTel;
    }

    public void setsClassLeaderTel(String sClassLeaderTel) {
        this.sClassLeaderTel = sClassLeaderTel;
    }


    public long getsClassNum() {
        return sClassNum;
    }

    public void setsClassNum(long sClassNum) {
        this.sClassNum = sClassNum;
    }


    public String getsClassStartDate() {
        return sClassStartDate;
    }

    public void setsClassStartDate(String sClassStartDate) {
        this.sClassStartDate = sClassStartDate;
    }

}
