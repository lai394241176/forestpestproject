package com.lovo.system.service.impl;

import com.lovo.system.bean.SysClass;
import com.lovo.system.dao.IClassDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IClassService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: ClassServiceImpl
 * @projectName forestpestproject
 * @description: TODO
 * @date 2019/6/2414:06
 */
public class ClassServiceImpl implements IClassService {

    /**
     * sqlSession
     */
    SqlSession sqlSession = null;

    /**
     * 专家持久接口
     */
    IClassDao classDao = null;

    /**
     * 方法前调用
     */
    public void before() {
        sqlSession = GetSession.getSqlSession();
        classDao = sqlSession.getMapper(IClassDao.class);
    }

    /**
     * 方法结束后调用
     */
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public int insertClass(SysClass insertArea) {
        before();
        int n = classDao.insertClass(insertArea);
        after();
        return n;
    }

    @Override
    public List<SysClass> findAllClass() {
        before();
        List<SysClass> classList = classDao.findAllClass();
        after();
        return classList;
    }

    @Override
    public SysClass findClassById(int classId) {
        before();
        SysClass sysClass = classDao.findClassById(classId);
        after();
        return sysClass;
    }

    @Override
    public List<SysClass> findClassByItems(Map classItemMap) {
        before();
        List<SysClass> classList = classDao.findClassByItems(classItemMap);
        after();
        return classList;
    }

    @Override
    public int updateClass(Map classUpdateMap) {
        before();
        int n = classDao.updateClass(classUpdateMap);
        after();
        return n;
    }
}
