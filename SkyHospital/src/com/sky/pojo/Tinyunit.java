package com.sky.pojo;

public class Tinyunit {
    private Integer tinyunitid;

    private String tinyunitname;

    public Integer getTinyunitid() {
        return tinyunitid;
    }

    public void setTinyunitid(Integer tinyunitid) {
        this.tinyunitid = tinyunitid;
    }

    public String getTinyunitname() {
        return tinyunitname;
    }

    public void setTinyunitname(String tinyunitname) {
        this.tinyunitname = tinyunitname == null ? null : tinyunitname.trim();
    }
}