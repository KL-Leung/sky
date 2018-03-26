package com.sky.pojo;

import java.util.Date;

public class Saitem {
    private Integer saitemid;

    private String storageaccountid;

    private Integer medicineid;

    private Integer supplierid;

    private String batchnumber;

    private Integer number;

    private Date validity;

    private Integer respectively;

    public Integer getSaitemid() {
        return saitemid;
    }

    public void setSaitemid(Integer saitemid) {
        this.saitemid = saitemid;
    }

    public String getStorageaccountid() {
        return storageaccountid;
    }

    public void setStorageaccountid(String storageaccountid) {
        this.storageaccountid = storageaccountid == null ? null : storageaccountid.trim();
    }

    public Integer getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(Integer medicineid) {
        this.medicineid = medicineid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public Integer getRespectively() {
        return respectively;
    }

    public void setRespectively(Integer respectively) {
        this.respectively = respectively;
    }
}