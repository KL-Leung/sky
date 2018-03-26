package com.sky.pojo;

public class Goodskind {
    private Integer goodskindid;

    private String goodskindname;

    public Integer getGoodskindid() {
        return goodskindid;
    }

    public void setGoodskindid(Integer goodskindid) {
        this.goodskindid = goodskindid;
    }

    public String getGoodskindname() {
        return goodskindname;
    }

    public void setGoodskindname(String goodskindname) {
        this.goodskindname = goodskindname == null ? null : goodskindname.trim();
    }
}