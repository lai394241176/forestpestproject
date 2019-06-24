package com.lovo.system.service.impl;

import com.lovo.system.bean.SysPower;
import com.lovo.system.bean.SysUser;
import com.lovo.system.dao.ISysUserDao;
import com.lovo.system.db.GetSession;
import com.lovo.system.service.IUserService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements IUserService {
    @Override
    //登录
    public SysUser getUserByNameAndPass(String userName, String userPwd) {
        SqlSession session = GetSession.creatSession();//获得session
        SysUser user = session.getMapper(ISysUserDao.class).getUserByNameAndPass(userName, userPwd);
        session.close();
        return user;
    }

    @Override
    //添加用户
    public int addUserName(SysUser user) {
        return 0;
    }

    @Override
    public void deleteUserName(int userId) {

    }

    @Override
    public SysUser findUser(int userId) {
        return null;
    }

    @Override
    public void updateSysUser(String powerName) {

    }

    @Override
    public List<SysUser> getSysUser(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<SysPower> findPowerByUserId(int userId) {
        return null;
    }

    @Override
    public int getintrowcount(Map<String, Object> map) {
        return 0;
    }
}
