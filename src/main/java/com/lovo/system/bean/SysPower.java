package com.lovo.system.bean;


/**
 * @author che
 * @title: SysPower 权限实体类
 * @projectName forestpestproject
 * @description: 权限实体类
 * @date 2019/6/21 15:56
 */
public class SysPower {

    private long powerId;
    private String powerName;
    private String powerSource;
    private String powerTag;


    public long getPowerId() {
        return powerId;
    }

    public void setPowerId(long powerId) {
        this.powerId = powerId;
    }


    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }


    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }


    public String getPowerTag() {
        return powerTag;
    }

    public void setPowerTag(String powerTag) {
        this.powerTag = powerTag;
    }

}
