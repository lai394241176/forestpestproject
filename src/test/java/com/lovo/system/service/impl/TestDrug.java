package com.lovo.system.service.impl;

import com.lovo.system.bean.SysDrug;
import com.lovo.system.bean.SysType;
import com.lovo.system.service.IDrugService;
import org.junit.Test;

public class TestDrug {
    @Test
    public void tset(){
        IDrugService drugService=new IDrugServiceImpl();
        SysDrug a=new SysDrug();
        a.setDrugName("敌敌畏");
        a.getDrugCureType().setTypeVal("虫害");
        a.getDrugType().setTypeVal("药品");
        a.setDrugUseWay("随便吧");
        a.setDrugNum(1000);
        drugService.addSysDrug(a);
    }
}
