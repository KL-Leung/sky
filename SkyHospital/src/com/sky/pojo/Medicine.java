package com.sky.pojo;

import java.math.BigDecimal;

public class Medicine {
    private Integer medicineid;

    private String medicinename;

    private String commonname;

    private String specification;

    private Integer manufacturerid;

    private Integer unitid;

    private Integer dosageformsid;

    private Integer goodskindid;

    private Integer mckid;

    private Integer tinyunitid;

    private String modifierid;

    private Integer medicinekindid;

    private Integer tinynumber;

    private String tinyspecification;

    private String barcode;

    private BigDecimal retailstdprice;

    private BigDecimal purchaseprice;

    private BigDecimal saleprice;

    private String comment;

    private String standardcode;

    public Integer getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(Integer medicineid) {
        this.medicineid = medicineid;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename == null ? null : medicinename.trim();
    }

    public String getCommonname() {
        return commonname;
    }

    public void setCommonname(String commonname) {
        this.commonname = commonname == null ? null : commonname.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Integer getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(Integer manufacturerid) {
        this.manufacturerid = manufacturerid;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public Integer getDosageformsid() {
        return dosageformsid;
    }

    public void setDosageformsid(Integer dosageformsid) {
        this.dosageformsid = dosageformsid;
    }

    public Integer getGoodskindid() {
        return goodskindid;
    }

    public void setGoodskindid(Integer goodskindid) {
        this.goodskindid = goodskindid;
    }

    public Integer getMckid() {
        return mckid;
    }

    public void setMckid(Integer mckid) {
        this.mckid = mckid;
    }

    public Integer getTinyunitid() {
        return tinyunitid;
    }

    public void setTinyunitid(Integer tinyunitid) {
        this.tinyunitid = tinyunitid;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid == null ? null : modifierid.trim();
    }

    public Integer getMedicinekindid() {
        return medicinekindid;
    }

    public void setMedicinekindid(Integer medicinekindid) {
        this.medicinekindid = medicinekindid;
    }

    public Integer getTinynumber() {
        return tinynumber;
    }

    public void setTinynumber(Integer tinynumber) {
        this.tinynumber = tinynumber;
    }

    public String getTinyspecification() {
        return tinyspecification;
    }

    public void setTinyspecification(String tinyspecification) {
        this.tinyspecification = tinyspecification == null ? null : tinyspecification.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public BigDecimal getRetailstdprice() {
        return retailstdprice;
    }

    public void setRetailstdprice(BigDecimal retailstdprice) {
        this.retailstdprice = retailstdprice;
    }

    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getStandardcode() {
        return standardcode;
    }

    public void setStandardcode(String standardcode) {
        this.standardcode = standardcode == null ? null : standardcode.trim();
    }
}