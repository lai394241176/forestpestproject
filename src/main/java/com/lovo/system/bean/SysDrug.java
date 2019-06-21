package com.lovo.system.bean;


/**
 * @author che
 * @title: SysDrug 药品类
 * @projectName forestpestproject
 * @description: 药品实体类
 * @date 2019/6/21 15:56
 */
public class SysDrug {

  private long drugId;
  private String drugName;
  private long drugCureType;
  private long drugType;
  private String drugUseWay;
  private long drugNum;


  public long getDrugId() {
    return drugId;
  }

  public void setDrugId(long drugId) {
    this.drugId = drugId;
  }


  public String getDrugName() {
    return drugName;
  }

  public void setDrugName(String drugName) {
    this.drugName = drugName;
  }


  public long getDrugCureType() {
    return drugCureType;
  }

  public void setDrugCureType(long drugCureType) {
    this.drugCureType = drugCureType;
  }


  public long getDrugType() {
    return drugType;
  }

  public void setDrugType(long drugType) {
    this.drugType = drugType;
  }


  public String getDrugUseWay() {
    return drugUseWay;
  }

  public void setDrugUseWay(String drugUseWay) {
    this.drugUseWay = drugUseWay;
  }


  public long getDrugNum() {
    return drugNum;
  }

  public void setDrugNum(long drugNum) {
    this.drugNum = drugNum;
  }

}
