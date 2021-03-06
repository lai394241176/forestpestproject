package com.lovo.system.bean;

/**
 * @author che
 * @title: SysRole 角色实体类
 * @projectName forestpestproject
 * @description: 角色实体类
 * @date 2019/6/21 15:56
 */
public class SysRole {

    private long roleId;
    private long userId;
    private long powerId;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPowerId() {
        return powerId;
    }

    public void setPowerId(long powerId) {
        this.powerId = powerId;
    }
}
