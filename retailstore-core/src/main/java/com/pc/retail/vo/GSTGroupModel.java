package com.pc.retail.vo;

import java.util.Date;

/**
 * Created by pavanc on 7/29/17.
 */
public class GSTGroupModel {

    private int gstGroupId;
    private String groupCode;

    private double taxRate;

    private double sGSTRate;
    private double cGSTRate;

    private Date effectiveDate;

    public int getGstGroupId() {
        return gstGroupId;
    }

    public void setGstGroupId(int gstGroupId) {
        this.gstGroupId = gstGroupId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getsGSTRate() {
        return sGSTRate;
    }

    public void setsGSTRate(double sGSTRate) {
        this.sGSTRate = sGSTRate;
    }

    public double getcGSTRate() {
        return cGSTRate;
    }

    public void setcGSTRate(double cGSTRate) {
        this.cGSTRate = cGSTRate;
    }
}
