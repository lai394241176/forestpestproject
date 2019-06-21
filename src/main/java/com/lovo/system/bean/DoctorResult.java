package com.lovo.system.bean;

/**
 * @author che
 * @title: DoctorResult 专家结果表
 * @projectName forestpestproject
 * @description: 专家结果表实体类
 * @date 2019/6/18 17:37
 */
public class DoctorResult {

  /**
   * 结果id
   */
  private long resultId;
  /**
   * 事件id
   */
  private long eventId;
  /**
   * 专家事件日期
   */
  private String doctorEventDate;
  /**
   * 专家事件结果
   */
  private String doctorEventResult;

  public long getResultId() {
    return resultId;
  }

  public void setResultId(long resultId) {
    this.resultId = resultId;
  }


  public long getEventId() {
    return eventId;
  }

  public void setEventId(long eventId) {
    this.eventId = eventId;
  }


  public String getDoctorEventDate() {
    return doctorEventDate;
  }

  public void setDoctorEventDate(String doctorEventDate) {
    this.doctorEventDate = doctorEventDate;
  }


  public String getDoctorEventResult() {
    return doctorEventResult;
  }

  public void setDoctorEventResult(String doctorEventResult) {
    this.doctorEventResult = doctorEventResult;
  }

}
