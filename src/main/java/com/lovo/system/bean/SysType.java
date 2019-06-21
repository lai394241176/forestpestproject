package com.lovo.system.bean;

/**
 * @author che
 * @title: SysType 类型表
 * @projectName forestpestproject
 * @description: 类型表实体类
 * @date 2019/6/21 15:56
 */
public class SysType {

  private long typeId;
  private String typeName;
  private long typeKey;
  private String typeVal;


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public long getTypeKey() {
    return typeKey;
  }

  public void setTypeKey(long typeKey) {
    this.typeKey = typeKey;
  }


  public String getTypeVal() {
    return typeVal;
  }

  public void setTypeVal(String typeVal) {
    this.typeVal = typeVal;
  }

}
