package com.pc.retail.vo;

import com.pc.retail.dao.InvoiceStatus;

import java.util.Date;
import java.util.List;

/**
 * Created by pavanc on 7/16/17.
 */
public class ProductInvoiceMasterDO {


    private int invoiceId;
    private String invoiceRefId;
    private String  supplierName;
    private Integer supplierId;
    private String invoiceStatus;
    private String invoiceDate;
    private double prdInvAmt;
    private double totalAmount;
    private double lumpsumCost;
    //private double totalInvAmt;
    private Date invDate;
    private boolean isModified;

    private List<ProductInvoiceDetailDO> productInvoiceDetailDOList;

    public ProductInvoiceMasterDO(ProductInvoiceMaster productInvoiceMaster){
        this.invoiceId = productInvoiceMaster.getInvoiceId();
        this.invoiceRefId = productInvoiceMaster.getInvoiceRefId();
        this.supplierId = productInvoiceMaster.getSupplierId();
        this.invoiceStatus = productInvoiceMaster.getInvoiceStatus().getName();
        this.invoiceDate = productInvoiceMaster.getInvoiceDate();
        this.totalAmount = productInvoiceMaster.getTotalInvAmt();
        this.prdInvAmt = productInvoiceMaster.getPrdInvAmt();
        this.lumpsumCost = productInvoiceMaster.getLumpsumCost();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<ProductInvoiceDetailDO> getProductInvoiceDetailDOList() {
        return productInvoiceDetailDOList;
    }

    public void setProductInvoiceDetailDOList(List<ProductInvoiceDetailDO> productInvoiceDetailDOList) {
        this.productInvoiceDetailDOList = productInvoiceDetailDOList;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getInvoiceRefId() {
        return invoiceRefId;
    }

    public void setInvoiceRefId(String invoiceRefId) {
        this.invoiceRefId = invoiceRefId;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public boolean isModified() {
        return isModified;
    }

    public void setModified(boolean modified) {
        isModified = modified;
    }

    public double getPrdInvAmt() {
        return prdInvAmt;
    }

    public void setPrdInvAmt(double prdInvAmt) {
        this.prdInvAmt = prdInvAmt;
    }

    public double getLumpsumCost() {
        return lumpsumCost;
    }

    public void setLumpsumCost(double lumpsumCost) {
        this.lumpsumCost = lumpsumCost;
    }
}
