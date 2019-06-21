package com.lovo.system.bean;


/**
 * @author che
 * @title: SysSick 病害类
 * @projectName forestpestproject
 * @description: 病害实体类
 * @date 2019/6/21 15:56
 */
public class SysLog {

  private long logId;
  private String logInfo;
  private String logDate;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public String getLogInfo() {
    return logInfo;
  }

  public void setLogInfo(String logInfo) {
    this.logInfo = logInfo;
  }


  public String getLogDate() {
    return logDate;
  }

  public void setLogDate(String logDate) {
    this.logDate = logDate;
  }

}
