package com.lovo.system.service.impl;

import com.lovo.system.bean.SysDoctor;
import com.lovo.system.dao.IDoctorDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IDoctorService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: DoctorServiceImpl 专家持久接口实现类
 * @projectName forestpestproject
 * @description: 专家持久接口实现类
 * @date 2019/6/21 16:24
 */
public class DoctorServiceImpl implements IDoctorService {

    /**
     * sqlSession
     */
    SqlSession sqlSession = null;

    /**
     * 专家持久接口
     */
    IDoctorDao doctorDao = null;

    /**
     * 方法前调用
     */
    public void before() {
        sqlSession = GetSession.getSqlSession();
        doctorDao = sqlSession.getMapper(IDoctorDao.class);
    }

    /**
     * 方法结束后调用
     */
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }


    @Override
    public int insertDoctor(SysDoctor doctorBean) {
        before();
        int n = doctorDao.insertDoctor(doctorBean);
        after();
        return n;
    }

    @Override
    public int deleteDoctorById(int doctorId) {
        before();
        int n = doctorDao.deleteDoctorById(doctorId);
        after();
        return n;
    }

    @Override
    public SysDoctor findDoctorById(int doctorId) {
        before();
        SysDoctor doctor = doctorDao.findDoctorById(doctorId);
        after();
        return doctor;
    }

    @Override
    public List<SysDoctor> findAllDoctor() {
        before();
        List<SysDoctor> doctorList = doctorDao.findAllDoctor();
        after();
        return doctorList;
    }

    @Override
    public List<SysDoctor> findDoctorByItem(Map itemMap) {
        before();
        List<SysDoctor> doctorList = doctorDao.findDoctorByItem(itemMap);
        after();
        return doctorList;
    }

    @Override
    public int updateDoctor(Map doctorUpdateMap) {
        before();
        int n = doctorDao.updateDoctor(doctorUpdateMap);
        after();
        return n;
    }
}
