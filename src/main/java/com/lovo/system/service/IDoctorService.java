package com.lovo.system.service;

import com.lovo.system.bean.SysDoctor;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: IDoctorService 专家业务接口
 * @projectName forestpestproject
 * @description: 专家业务接口
 * @date 2019/6/21 16:21
 */
public interface IDoctorService {

    //==================增加=======================

    /**
     * 添加专家
     *
     * @param doctorBean 专家实体类
     * @return 受影响的行数
     */
    int insertDoctor(SysDoctor doctorBean);

    //==================删除=======================

    /**
     * 按专家id 删除专家
     *
     * @param doctorId 专家id
     * @return 受影响的行数
     */
    int deletDoctorByid(int doctorId);


    //==================查询=======================

    /**
     * 按专家id 查询专家
     *
     * @param doctorId 专家id
     * @return 专家实体类
     */
    SysDoctor findDoctorById(int doctorId);

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
     * @param doctorUpdateMap 专家修改信息map
     * @return 受影响的行数
     */
    int updateDoctor(Map doctorUpdateMap);
}
