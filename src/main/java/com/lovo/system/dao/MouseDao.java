package com.lovo.system.dao;

import com.lovo.system.bean.SysMouse;

import java.util.List;
import java.util.Map;

/**
 * 鼠害持久接口
 */
public interface MouseDao {
    /**
     *
     * @param mouse
     * @return
     */
    public int registerInfo(SysMouse mouse);

    /**
     *
     * @param map 条件
     * @return 鼠害集合
     */
    public List<SysMouse> getListStudent(Map map);

    public List
}
