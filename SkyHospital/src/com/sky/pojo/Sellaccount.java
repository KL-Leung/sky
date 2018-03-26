package com.sky.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Sellaccount {
    private String sellaccountid;

    private String uid;

    private Date selldate;

    private String vipid;

    private BigDecimal amount;

    private BigDecimal actuallypaid;

    private BigDecimal due;

    private BigDecimal cutamount;

    private String cutcomment;

    private String payway;

    private String comment;

    private Date closingdate;

    private String salesman;

    public String getSellaccountid() {
        return sellaccountid;
    }

    public void setSellaccountid(String sellaccountid) {
        this.sellaccountid = sellaccountid == null ? null : sellaccountid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Date getSelldate() {
        return selldate;
    }

    public void setSelldate(Date selldate) {
        this.selldate = selldate;
    }

    public String getVipid() {
        return vipid;
    }

    public void setVipid(String vipid) {
        this.vipid = vipid == null ? null : vipid.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getActuallypaid() {
        return actuallypaid;
    }

    public void setActuallypaid(BigDecimal actuallypaid) {
        this.actuallypaid = actuallypaid;
    }

    public BigDecimal getDue() {
        return due;
    }

    public void setDue(BigDecimal due) {
        this.due = due;
    }

    public BigDecimal getCutamount() {
        return cutamount;
    }

    public void setCutamount(BigDecimal cutamount) {
        this.cutamount = cutamount;
    }

    public String getCutcomment() {
        return cutcomment;
    }

    public void setCutcomment(String cutcomment) {
        this.cutcomment = cutcomment == null ? null : cutcomment.trim();
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getClosingdate() {
        return closingdate;
    }

    public void setClosingdate(Date closingdate) {
        this.closingdate = closingdate;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
    }
}