package com.lovo.system.service.impl;

import com.lovo.system.bean.SysDoctor;
import com.lovo.system.dao.IDoctorDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IDoctorService;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author che
 * @title: DoctorServiceImplTest
 * @projectName forestpestproject
 * @description: 专家持久接口测试类
 * @date 2019/6/21 16:50
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
        Map<String, String> map = new HashMap<>();
        map.put("findByName", null);
        map.put("findBySpeciality", null);
        map.put("findByCompany", null);

        List<SysDoctor> list = service.findDoctorByItem(map);
        System.out.println(list);
    }

    @Test
    public void updateDoctor() {
        Map<String, Object> updateMap = new HashMap<>();
        updateMap.put("updateId", 3);
        updateMap.put("updateTel", "123123123");
        updateMap.put("updatePost", "123123123");
        updateMap.put("updateCompany", "朗沃");
        updateMap.put("updateEmail", "123123123");

        service.updateDoctor(updateMap);
        SysDoctor s = service.findDoctorById(3);
        System.out.println(s);
    }
}