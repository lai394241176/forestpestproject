package com.lovo.system.service.impl;

import com.lovo.system.bean.SysClass;
import com.lovo.system.service.IClassService;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author che
 * @title: ClassServiceImplTest
 * @projectName forestpestproject
 * @description: 小班业务实现类测试类
 * @date 2019/6/24 14:28
 */
public class ClassServiceImplTest {

    IClassService service = new ClassServiceImpl();

    @Test
    public void insertClass() {
        SysClass sysClass = new SysClass();
        sysClass.setAreaId(2);
        sysClass.setSclassName("雅林二班");
        sysClass.setsClassLeader("余化龙");
        sysClass.setsClassLeaderTel("1389123123");
        sysClass.setsClassNum(12);
        sysClass.setsClassStartDate("2018-01-23");

        int n = service.insertClass(sysClass);
        System.out.println(n);
    }

    @Test
    public void findAllClass() {
        Object o = service.findAllClass();
        System.out.println(o);
    }

    @Test
    public void findClassById() {
        Object o = service.findClassById(2);
        System.out.println(o);
    }

    @Test
    public void findClassByItems() {
        Map itemsMap = new HashMap();
        itemsMap.put("findByClassName", "");
        itemsMap.put("findByArea", "");

        Object o = service.findClassByItems(itemsMap);
        System.out.println(o);
    }

    @Test
    public void updateClass() {
        Map updateMap = new HashMap();
        updateMap.put("classId", 1);
        updateMap.put("updateLeader", "");
        updateMap.put("updateLeaderTel", "17600972720");

        Object o = service.updateClass(updateMap);
        System.out.println(o);
    }
}