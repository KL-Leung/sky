package com.sky.pojo;

public class Goodsallocation {
    private Integer gaid;

    private String ganame;

    private String comment;

    public Integer getGaid() {
        return gaid;
    }

    public void setGaid(Integer gaid) {
        this.gaid = gaid;
    }

    public String getGaname() {
        return ganame;
    }

    public void setGaname(String ganame) {
        this.ganame = ganame == null ? null : ganame.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}