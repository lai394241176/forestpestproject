package com.lovo.system.dao;

import com.lovo.system.bean.SysMouse;
import com.lovo.system.bean.SysPest;

/**
 * 虫害持久接口
 */
public interface PsetDao {
    /**
     *
     * @param pset
     * @return
     */
    public int registerInfo(SysPest pset);

}
