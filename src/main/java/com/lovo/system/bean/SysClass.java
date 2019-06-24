package com.lovo.system.bean;

/**
 * @Description: 小班实体类
 * @Author: che
 * @CreateDate: 2019/6/24  12:54
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class SysClass {

    /**
     * 小班id
     */
    private long sClassId;
    /**
     * 地区id
     */
    private long areaId;
    /**
     * 小班名称
     */
    private String sClassName;
    /**
     * 小班领导人
     */
    private String sClassLeader;
    /**
     * 小班领导人电话
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


    public String getSclassName() {
        return sClassName;
    }

    public void setSclassName(String sclassName) {
        this.sClassName = sclassName;
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
