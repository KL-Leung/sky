package com.sky.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Storageaccount {
    private String storageaccountid;

    private Date iodate;

    private Date iounit;

    private BigDecimal amount;

    private BigDecimal actuallypaid;

    private BigDecimal due;

    private String invoice;

    private String comment;

    private Date closingdate;

    private Integer judge;

    public String getStorageaccountid() {
        return storageaccountid;
    }

    public void setStorageaccountid(String storageaccountid) {
        this.storageaccountid = storageaccountid == null ? null : storageaccountid.trim();
    }

    public Date getIodate() {
        return iodate;
    }

    public void setIodate(Date iodate) {
        this.iodate = iodate;
    }

    public Date getIounit() {
        return iounit;
    }

    public void setIounit(Date iounit) {
        this.iounit = iounit;
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

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
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

    public Integer getJudge() {
        return judge;
    }

    public void setJudge(Integer judge) {
        this.judge = judge;
    }
}