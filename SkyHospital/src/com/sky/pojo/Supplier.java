package com.sky.pojo;

public class Supplier {
    private Integer supplierid;

    private String suppliername;

    private String phone;

    private String contact;

    private String explain;

    private String state;

    private String gspgmp;

    private String charter;

    private String operatingpermit;

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getGspgmp() {
        return gspgmp;
    }

    public void setGspgmp(String gspgmp) {
        this.gspgmp = gspgmp == null ? null : gspgmp.trim();
    }

    public String getCharter() {
        return charter;
    }

    public void setCharter(String charter) {
        this.charter = charter == null ? null : charter.trim();
    }

    public String getOperatingpermit() {
        return operatingpermit;
    }

    public void setOperatingpermit(String operatingpermit) {
        this.operatingpermit = operatingpermit == null ? null : operatingpermit.trim();
    }
}