package com.sky.pojo;

public class Manufacturer {
    private Integer manufacturerid;

    private String manufacturername;

    private String shor;

    public Integer getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(Integer manufacturerid) {
        this.manufacturerid = manufacturerid;
    }

    public String getManufacturername() {
        return manufacturername;
    }

    public void setManufacturername(String manufacturername) {
        this.manufacturername = manufacturername == null ? null : manufacturername.trim();
    }

    public String getShor() {
        return shor;
    }

    public void setShor(String shor) {
        this.shor = shor == null ? null : shor.trim();
    }
}