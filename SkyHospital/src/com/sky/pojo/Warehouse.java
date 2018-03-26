package com.sky.pojo;

public class Warehouse {
    private Integer warehouseid;

    private Integer saitemid;

    private Integer gaid;

    private Integer inventoryfloor;

    private String handling;

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getSaitemid() {
        return saitemid;
    }

    public void setSaitemid(Integer saitemid) {
        this.saitemid = saitemid;
    }

    public Integer getGaid() {
        return gaid;
    }

    public void setGaid(Integer gaid) {
        this.gaid = gaid;
    }

    public Integer getInventoryfloor() {
        return inventoryfloor;
    }

    public void setInventoryfloor(Integer inventoryfloor) {
        this.inventoryfloor = inventoryfloor;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling == null ? null : handling.trim();
    }
}