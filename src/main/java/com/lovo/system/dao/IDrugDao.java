package com.lovo.system.dao;

import com.lovo.system.bean.SysDrug;

import java.util.List;
import java.util.Map;

/**
 * 药品器械持久接口
 */
public interface IDrugDao {
    /**
     * 添加药品器械
     *
     * @param drug 药品器械实体类
     */
    public void addSysDrug(SysDrug drug);

    /**
     * 动态查询 用Map的数据分别查询防治类型ID和药剂类别ID
     *
     * @param drug 查询条件Map
     * @return 药品器械对象集合
     */
    public List<SysDrug> queDrug(Map drug);

}
