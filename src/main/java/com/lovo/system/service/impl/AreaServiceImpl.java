package com.lovo.system.service.impl;

import com.lovo.system.bean.SysArea;
import com.lovo.system.dao.IAreaDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IAreaService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: AreaServiceImpl
 * @projectName forestpestproject
 * @description: 地区的添加、查询
 * @date 2019/6/24 13:15
 */
public class AreaServiceImpl implements IAreaService {

    /**
     * sqlSession
     */
    SqlSession sqlSession = null;

    /**
     * 专家持久接口
     */
    IAreaDao areaDao = null;

    /**
     * 方法前调用
     */
    public void before() {
        sqlSession = GetSession.getSqlSession();
        areaDao = sqlSession.getMapper(IAreaDao.class);
    }

    /**
     * 方法结束后调用
     */
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }


    @Override
    public int insertArea(SysArea insertArea) {
        before();
        int n = areaDao.insertArea(insertArea);
        after();
        return n;
    }

    @Override
    public List<SysArea> findAllArea() {
        before();
        List<SysArea> areaList = areaDao.findAllArea();
        after();
        return areaList;
    }

    @Override
    public List<SysArea> findAreaByItems(Map findItems) {
        before();
        List<SysArea> areaList = areaDao.findAreaByItems(findItems);
        after();
        return areaList;
    }
}
