package com.sky.pojo;

public class Sellitem {
    private Integer sellitem;

    private String sellaccountid;

    private Integer medicineid;

    public Integer getSellitem() {
        return sellitem;
    }

    public void setSellitem(Integer sellitem) {
        this.sellitem = sellitem;
    }

    public String getSellaccountid() {
        return sellaccountid;
    }

    public void setSellaccountid(String sellaccountid) {
        this.sellaccountid = sellaccountid == null ? null : sellaccountid.trim();
    }

    public Integer getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(Integer medicineid) {
        this.medicineid = medicineid;
    }
}