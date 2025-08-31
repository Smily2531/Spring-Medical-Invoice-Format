package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    private final InvoiceItemDao dao;

    public InvoiceService(InvoiceItemDao dao) {
        this.dao = dao;
    }

    public void addItem(InvoiceItem item) {
        // Calculate net amount: (retailPrice * quantity) - discount + GST
        double total = item.getRetailPrice() * item.getQuantity();
        double discountAmt = total * (item.getDiscount() / 100);
        double gstAmt = (total - discountAmt) * (item.getGst() / 100);
        item.setNetAmount(total - discountAmt + gstAmt);

        dao.save(item);
    }

    public List<InvoiceItem> getAllItems() {
        return dao.findAll();
    }

    // Optional helper methods to calculate totals
    public double getTotalAmount() {
        return getAllItems().stream().mapToDouble(InvoiceItem::getNetAmount).sum();
    }

    public double getTotalGST() {
        return getAllItems().stream()
                .mapToDouble(i -> (i.getRetailPrice() * i.getQuantity() - (i.getRetailPrice() * i.getQuantity() * i.getDiscount() / 100)) * i.getGst() / 100)
                .sum();
    }

    public double getTotalReceivable() {
        return getTotalAmount() + getTotalGST();
    }
}
