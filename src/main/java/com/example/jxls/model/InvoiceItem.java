package com.example.jxls.model;


public class InvoiceItem {
    String billNo;
    String apartmentName;
    String categoryName;
    String issueDate;
    String amount;

    public InvoiceItem() {}

    public InvoiceItem(String billNo,  String apartmentName, String categoryName
    , String issueDate, String amount) {
        this.billNo = billNo;
        this.apartmentName = apartmentName;
        this.categoryName = categoryName;
        this.issueDate = issueDate;
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public String getBillNo() {
        return billNo;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
