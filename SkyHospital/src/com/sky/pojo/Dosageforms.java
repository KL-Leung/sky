package com.sky.pojo;

public class Dosageforms {
    private Integer dosageformsid;

    private String dosageformsname;

    public Integer getDosageformsid() {
        return dosageformsid;
    }

    public void setDosageformsid(Integer dosageformsid) {
        this.dosageformsid = dosageformsid;
    }

    public String getDosageformsname() {
        return dosageformsname;
    }

    public void setDosageformsname(String dosageformsname) {
        this.dosageformsname = dosageformsname == null ? null : dosageformsname.trim();
    }
}