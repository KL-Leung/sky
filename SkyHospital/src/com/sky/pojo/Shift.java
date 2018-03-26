package com.sky.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Shift {
    private Integer shiftid;

    private String uid;

    private Date shifttime;

    private BigDecimal money;

    private String comment;

    public Integer getShiftid() {
        return shiftid;
    }

    public void setShiftid(Integer shiftid) {
        this.shiftid = shiftid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Date getShifttime() {
        return shifttime;
    }

    public void setShifttime(Date shifttime) {
        this.shifttime = shifttime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}