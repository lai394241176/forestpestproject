package com.lovo.system.dao;

import com.lovo.system.bean.SysType;

public interface ITypeDao {
    /**
     * 查询key
     * @param typeVal val值
     * @return val原本实体类的ID 也是Key值
     */
    public SysType findTypeValBytypeKey(String typeVal);
}
