package com.example.demo;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class InvoiceItem {

    private int id;
    private int quantity;
    private String description;
    private String packing;
    private double gst;
    private double tradePrice;
    private double retailPrice;
    private double discount;

    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date expiryDate;

    private double netAmount;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPacking() { return packing; }
    public void setPacking(String packing) { this.packing = packing; }

    public double getGst() { return gst; }
    public void setGst(double gst) { this.gst = gst; }

    public double getTradePrice() { return tradePrice; }
    public void setTradePrice(double tradePrice) { this.tradePrice = tradePrice; }

    public double getRetailPrice() { return retailPrice; }
    public void setRetailPrice(double retailPrice) { this.retailPrice = retailPrice; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }

    public double getNetAmount() { return netAmount; }
    public void setNetAmount(double netAmount) { this.netAmount = netAmount; }
}
