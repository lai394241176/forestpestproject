package com.lovo.system.service;


import com.lovo.system.bean.SysPower;
import com.lovo.system.bean.SysUser;

import java.util.List;
import java.util.Map;

public interface IUserService {
    /**
     * 用户登陆
     *
     * @param userName 用户名
     * @param userPwd  密码
     * @return
     */
    public SysUser getUserByNameAndPass(String userName, String userPwd);

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 判断用户是否存在，存在返回0。不存在返回1；
     */
    public int addUserName(SysUser user);

    /**
     * 删除用户
     *
     * @param userId 用户ID
     */
    public void deleteUserName(int userId);

    /**
     * 根据id查询用户信息
     *
     * @param userId 用户id
     */
    public SysUser findUser(int userId);

    /**
     * 修改用户
     *
     * @param
     * @param
     * @param powerName 用户等级
     */
    public void updateSysUser(String powerName);

    /**
     * 根据权限模糊查询用户集合
     *
     * @param map （所有权限（模糊），分页起始行，分页显示行数）
     * @return List<SysUser> 用户集合
     * @throws
     */
    public List<SysUser> getSysUser(Map<String, Object> map);

    /**
     * 根据用户ID查询用户对应权限
     *
     * @param userId 用户ID
     * @return 用户对应权限集合
     */
    public List<SysPower> findPowerByUserId(int userId);

    /**
     * 获得总行数
     *
     * @param map （所有权限（模糊））
     * @return
     */
    public int getintrowcount(Map<String, Object> map);
}
