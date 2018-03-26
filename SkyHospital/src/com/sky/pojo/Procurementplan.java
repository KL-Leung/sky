package com.sky.pojo;

public class Procurementplan {
    private Integer ppid;

    private Integer medicineid;

    private Integer lower;

    private Integer ppnumber;

    private String pporganization;

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(Integer medicineid) {
        this.medicineid = medicineid;
    }

    public Integer getLower() {
        return lower;
    }

    public void setLower(Integer lower) {
        this.lower = lower;
    }

    public Integer getPpnumber() {
        return ppnumber;
    }

    public void setPpnumber(Integer ppnumber) {
        this.ppnumber = ppnumber;
    }

    public String getPporganization() {
        return pporganization;
    }

    public void setPporganization(String pporganization) {
        this.pporganization = pporganization == null ? null : pporganization.trim();
    }
}