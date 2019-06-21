package com.lovo.system.bean;


/**
 * @author che
 * @title: SysSick 药品器械实体
 * @projectName forestpestproject
 * @description: 药品器械实体类
 * @date 2019/6/21 15:56
 */
public class DrugStockpile {

  private long drugId;
  private long stockpileId;


  public long getDrugId() {
    return drugId;
  }

  public void setDrugId(long drugId) {
    this.drugId = drugId;
  }


  public long getStockpileId() {
    return stockpileId;
  }

  public void setStockpileId(long stockpileId) {
    this.stockpileId = stockpileId;
  }

}
