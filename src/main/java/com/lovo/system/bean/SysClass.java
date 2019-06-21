package com.lovo.system.bean;


/**
 * @author che
 * @title: SysClass 小班类
 * @projectName forestpestproject
 * @description: 小班实体类
 * @date 2019/6/21 15:56
 */
public class SysClass {

  private long sclassId;
  private long areaId;
  private String sclassName;
  private String sclassLeader;
  private String sclassLeaderTel;
  private long sclassNum;
  private String sclassStartDate;


  public long getSclassId() {
    return sclassId;
  }

  public void setSclassId(long sclassId) {
    this.sclassId = sclassId;
  }


  public long getAreaId() {
    return areaId;
  }

  public void setAreaId(long areaId) {
    this.areaId = areaId;
  }


  public String getSclassName() {
    return sclassName;
  }

  public void setSclassName(String sclassName) {
    this.sclassName = sclassName;
  }


  public String getSclassLeader() {
    return sclassLeader;
  }

  public void setSclassLeader(String sclassLeader) {
    this.sclassLeader = sclassLeader;
  }


  public String getSclassLeaderTel() {
    return sclassLeaderTel;
  }

  public void setSclassLeaderTel(String sclassLeaderTel) {
    this.sclassLeaderTel = sclassLeaderTel;
  }


  public long getSclassNum() {
    return sclassNum;
  }

  public void setSclassNum(long sclassNum) {
    this.sclassNum = sclassNum;
  }


  public String getSclassStartDate() {
    return sclassStartDate;
  }

  public void setSclassStartDate(String sclassStartDate) {
    this.sclassStartDate = sclassStartDate;
  }

}
