package com.sky.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Mtiny {
    private Integer mtid;

    private Integer saitemid;

    private Integer unitid;

    private String tinyspecification;

    private Integer number;

    private BigDecimal costprice;

    private BigDecimal saleprice;

    private Date tinydate;

    private String comment;

    public Integer getMtid() {
        return mtid;
    }

    public void setMtid(Integer mtid) {
        this.mtid = mtid;
    }

    public Integer getSaitemid() {
        return saitemid;
    }

    public void setSaitemid(Integer saitemid) {
        this.saitemid = saitemid;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getTinyspecification() {
        return tinyspecification;
    }

    public void setTinyspecification(String tinyspecification) {
        this.tinyspecification = tinyspecification == null ? null : tinyspecification.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public Date getTinydate() {
        return tinydate;
    }

    public void setTinydate(Date tinydate) {
        this.tinydate = tinydate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}