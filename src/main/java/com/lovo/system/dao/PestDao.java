package com.lovo.system.dao;

import com.lovo.system.bean.SysMouse;
import com.lovo.system.bean.SysPest;

import java.util.List;
import java.util.Map;

/**
 * 虫害持久接口
 */
public interface PestDao {
    /**
     *
     * @param pest
     * @return
     */
    public int insertPest(SysPest pest);
    /**
     *查询全部
     * @return
     */
    List<SysPest> findAllPest();

    /**
     *
     * @param map 条件
     * @return 虫害集合
     */
    public List<SysPest> getListPest(Map map);


}
