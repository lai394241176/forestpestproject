package com.lovo.system.bean;


/**
 * @author che
 * @title: SysArea 地区类
 * @projectName forestpestproject
 * @description: 地区实体类
 * @date 2019/6/21 15:56
 */
public class SysArea {

    /**
     * 地区id
     */
    private long areaId;
    /**
     * 地区名称
     */
    private String areaName;
    /**
     * 地区林种
     */
    private String areaTreeType;
    /**
     * 地区优势树种
     */
    private String areaGoodTree;
    /**
     * 区域地类
     */
    private long areaAdressId;



    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }


    public String getAreaTreeType() {
        return areaTreeType;
    }

    public void setAreaTreeType(String areaTreeType) {
        this.areaTreeType = areaTreeType;
    }


    public String getAreaGoodTree() {
        return areaGoodTree;
    }

    public void setAreaGoodTree(String areaGoodTree) {
        this.areaGoodTree = areaGoodTree;
    }


    public long getAreaAdressId() {
        return areaAdressId;
    }

    public void setAreaAdressId(long areaAdressId) {
        this.areaAdressId = areaAdressId;
    }

}
