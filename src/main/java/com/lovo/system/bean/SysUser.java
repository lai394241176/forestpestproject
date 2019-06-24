package com.lovo.system.bean;

/**
 * @author che
 * @title: SysRole1 角色表
 * @projectName forestpestproject
 * @description: 用户实体类
 * @date 2019/6/21 15:56
 */
public class SysUser {

    private long userId;
    private String userName;
    private String userPwd;
    private String userTrueName;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


    public String getUserTrueName() {
        return userTrueName;
    }

    public void setUserTrueName(String userTrueName) {
        this.userTrueName = userTrueName;
    }

}
