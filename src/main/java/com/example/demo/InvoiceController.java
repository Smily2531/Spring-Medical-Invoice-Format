package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

    private final InvoiceService service;

    public InvoiceController(InvoiceService service) {
        this.service=service;
    }

    @GetMapping
    public String viewInvoice(Model model) {
        model.addAttribute("items",service.getAllItems());
        model.addAttribute("item",new InvoiceItem());
        model.addAttribute("totalAmount",service.getTotalAmount());
        model.addAttribute("totalGST",service.getTotalGST());
        model.addAttribute("totalReceivable",service.getTotalReceivable());
        model.addAttribute("cashReceived", 0.0); 
        model.addAttribute("cashBack",0.0);     
        model.addAttribute("showForm",false);   
        return "invoice";
    }

//    @PostMapping("/add")
//    public String addItem(@ModelAttribute InvoiceItem item, Model model) {
//        service.addItem(item);
//
//      
//        model.addAttribute("items", service.getAllItems());
//        model.addAttribute("item", new InvoiceItem());
//        model.addAttribute("totalAmount", service.getTotalAmount());
//        model.addAttribute("totalGST", service.getTotalGST());
//        model.addAttribute("totalReceivable", service.getTotalReceivable());
//        model.addAttribute("cashReceived", 0.0);
//        model.addAttribute("cashBack", 0.0);
//        model.addAttribute("showForm", true);
//
//        return "redirect:/invoice";
//
//    }
}
