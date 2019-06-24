package com.lovo.system.bean;

/**
 * @Description: 下拉框维护
 * @Author: che
 * @CreateDate: 2019/6/24  14:07
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class SysType {

    /**
     * 类型id
     */
    private long typeId;
    /**
     * 类型名称
     */
    private String typeName;
    /**
     * 类型Key
     */
    private long typeKey;
    /**
     * 类型Val
     */
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
