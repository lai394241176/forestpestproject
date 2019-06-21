package com.lovo.system.service.impl;

import com.lovo.system.bean.SysDoctor;
import com.lovo.system.dao.IDoctorDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IDoctorService;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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

        doctor.setDoctorName("王华");
        doctor.setDoctorSex("女");
        doctor.setDoctorBirthday("1992-02-07");
        doctor.setDoctorImgPath("d://wewe/wewe");
        doctor.setDoctorSpeciality("除鼠");
        doctor.setDoctorPost("硕士");
        doctor.setDoctorTel("13123123114");
        doctor.setDoctorCompany("华泰");
        doctor.setDoctorHome("她家");
        doctor.setDoctorEmail("12312312398@qq.com");

        int n = service.insertDoctor(doctor);
        System.out.println(n);

    }

    @Test
    public void deleteDoctorById() {
        int n = service.deleteDoctorById(1);
        System.out.println(n);
    }

    @Test
    public void findDoctorById() {
        SysDoctor doctor = service.findDoctorById(3);
        System.out.println(doctor);
    }

    @Test
    public void findAllDoctor() {
        List<SysDoctor> list = service.findAllDoctor();
        System.out.println(list);
    }

    @Test
    public void findDoctorByItem() {
    }

    @Test
    public void updateDoctor() {
    }
}