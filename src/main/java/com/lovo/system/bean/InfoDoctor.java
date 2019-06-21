package com.lovo.system.bean;


/**
 * @author che
 * @title: InfoDoctor 专家会商中间表
 * @projectName forestpestproject
 * @description: 专家会商中间表
 * @date 2019/6/21 15:56
 */
public class InfoDoctor {

  private long resultId;
  private long doctorId;


  public long getResultId() {
    return resultId;
  }

  public void setResultId(long resultId) {
    this.resultId = resultId;
  }


  public long getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(long doctorId) {
    this.doctorId = doctorId;
  }

}
