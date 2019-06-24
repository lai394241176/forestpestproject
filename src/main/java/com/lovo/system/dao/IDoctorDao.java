package com.lovo.system.dao;

import java.util.List;
import java.util.Map;


/**
 * @author che
 * @title: IDoctorDao 专家持久接口
 * @projectName forestpestproject
 * @description: 专家持久接口
 * @date 2019/6/18 17:37
 */
public interface IDoctorDao {

    //==================增加=======================

    /**
     * 添加专家
     *
     * @param DoctorBean 专家实体类
     * @return 受影响的行数
     */
    int insertDoctor(SysDoctor DoctorBean);

    //==================删除=======================

    /**
     * 按专家id 删除专家
     *
     * @param DoctorId 专家id
     * @return 受影响的行数
     */
    int deletDoctorByid(int DoctorId);


    //==================查询=======================

    /**
     * 按专家id 查询专家
     *
     * @param DoctorId 专家id
     * @return 专家实体类
     */
    SysDoctor findProessorById(int DoctorId);

    /**
     * 查询所有专家
     *
     * @return 专家集合
     */
    List<SysDoctor> findAllDoctor();

    /**
     * 条件查询专家
     *
     * @param itemMap 条件map
     * @return 符合条件专家集合
     */
    List<SysDoctor> findDoctorByItem(Map itemMap);

    //==================修改=======================

    /**
     * 修改专家信息
     *
     * @param DoctorUpdateMap 专家修改信息map
     * @return 受影响的行数
     */
    int updateDoctor(Map DoctorUpdateMap);
}
