package com.lovo.system.dao;

import com.lovo.system.bean.ProfessorBean;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: IProfessorDao 专家持久接口
 * @projectName forestpestproject
 * @description: 专家持久接口
 * @date 2019/6/18 17:37
 */
public interface IProfessorDao {

    //==================增加=======================

    /**
     * 添加专家
     *
     * @param professorBean 专家实体类
     * @return 受影响的行数
     */
    int insertProfessor(ProfessorBean professorBean);

    //==================删除=======================

    /**
     * 按专家id 删除专家
     *
     * @param professorId 专家id
     * @return 受影响的行数
     */
    int deletProfessorByid(int professorId);


    //==================查询=======================

    /**
     * 按专家id 查询专家
     *
     * @param professorId 专家id
     * @return 专家实体类
     */
    ProfessorBean findProessorById(int professorId);

    /**
     * 查询所有专家
     *
     * @return 专家集合
     */
    List<ProfessorBean> findAllProfessor();

    /**
     * 条件查询专家
     *
     * @param itemMap 条件map
     * @return 符合条件专家集合
     */
    List<ProfessorBean> findProfessorByItem(Map itemMap);

    //==================修改=======================

    /**
     * 修改专家信息
     *
     * @param professorUpdateMap 专家修改信息map
     * @return 受影响的行数
     */
    int updateProfessor(Map professorUpdateMap);
}
