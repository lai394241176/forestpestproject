package com.lovo.system.service.impl;

import com.lovo.system.bean.SysDrug;
import com.lovo.system.dao.IDrugDao;
import com.lovo.system.dao.ITypeDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IDrugService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 *业务实现类
 */
public class IDrugServiceImpl implements IDrugService {
    @Override
    public void addSysDrug(SysDrug drug) {
        SqlSession session= GetSession.getSqlSession();
       String DrugCureType=drug.getDrugCureType().getTypeVal();
       String DrugType=drug.getDrugType().getTypeVal();
       ITypeDao dao=session.getMapper(ITypeDao.class);
       drug.setDrugCureType(dao.findTypeValBytypeKey(DrugCureType));
       drug.setDrugType(dao.findTypeValBytypeKey(DrugType));
       session.getMapper(IDrugDao.class).addSysDrug(drug);
       session.close();

    }

    @Override
    public List<SysDrug> queDrug(Map drug) {
        return null;
    }
}
