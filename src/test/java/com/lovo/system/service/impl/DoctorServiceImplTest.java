package com.lovo.system.service.impl;

import com.lovo.system.bean.SysDoctor;
import com.lovo.system.dao.IDoctorDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IDoctorService;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author che
 * @title: DoctorServiceImplTest
 * @projectName forestpestproject
 * @description: TODO
 * @date 2019/6/2116:50
 */
public class DoctorServiceImplTest {

    IDoctorService service = new DoctorServiceImpl();

    @Test
    public void insertDoctor() {

        SysDoctor doctor = new SysDoctor();

        doctor.setDoctorName("李光华");
        doctor.setDoctorSex("男");
        doctor.setDoctorBirthday("1994-02-07");
        doctor.setDoctorImgPath("d://wewe/wewe");
        doctor.setDoctorSpeciality("除虫");
        doctor.setDoctorPost("教授");
        doctor.setDoctorTel("123123123123");
        doctor.setDoctorCompany("朗沃");
        doctor.setDoctorHome("家");
        doctor.setDoctorEmail("89712398@qq.com");

        int n = service.insertDoctor(doctor);
        System.out.println(n);

    }

    @Test
    public void deletDoctorByid() {
    }

    @Test
    public void findDoctorById() {
    }

    @Test
    public void findAllDoctor() {
    }

    @Test
    public void findDoctorByItem() {
    }

    @Test
    public void updateDoctor() {
    }
}