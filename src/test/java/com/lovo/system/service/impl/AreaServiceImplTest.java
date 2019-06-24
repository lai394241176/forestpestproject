package com.lovo.system.service.impl;

import com.lovo.system.bean.SysArea;
import com.lovo.system.service.IAreaService;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: AreaServiceImplTest
 * @projectName forestpestproject
 * @description: 地区业务接口测试类
 * @date 2019/6/24 13:18
 */
public class AreaServiceImplTest {

    IAreaService areaService = new AreaServiceImpl();

    @Test
    public void insertArea() {
        SysArea area = new SysArea();
        area.setAreaName("卧龙自然保护区");
        area.setAreaTreeType("竹林");
        area.setAreaGoodTree("箭竹");
        area.setAreaAdressId(2);
        int n = areaService.insertArea(area);
        System.out.println(n);
    }

    @Test
    public void findAllArea() {
        List<SysArea> areaList = areaService.findAllArea();
        System.out.println(areaList);
    }

    @Test
    public void findAreaByItems() {

        Map<String, String> itemsMap = new HashMap<>();

        itemsMap.put("findByAreaName", "");
        itemsMap.put("findByAreaTreeType", "");
        itemsMap.put("sClassName", "");

        List<SysArea> areaList = areaService.findAreaByItems(itemsMap);
        System.out.println(areaList);
    }
}