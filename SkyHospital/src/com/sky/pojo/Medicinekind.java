package com.sky.pojo;

public class Medicinekind {
    private Integer medicinekindid;

    private String medicinekindname;

    public Integer getMedicinekindid() {
        return medicinekindid;
    }

    public void setMedicinekindid(Integer medicinekindid) {
        this.medicinekindid = medicinekindid;
    }

    public String getMedicinekindname() {
        return medicinekindname;
    }

    public void setMedicinekindname(String medicinekindname) {
        this.medicinekindname = medicinekindname == null ? null : medicinekindname.trim();
    }
}