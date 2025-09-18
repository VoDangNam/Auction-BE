package com.auctionaa.backend.Controller;

import com.auctionaa.backend.Entity.Invoice;
import com.auctionaa.backend.Service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class GetListInvoice {


    private final InvoiceService invoiceService;

    public GetListInvoice(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/getListInvoice")
    public List<Invoice> getAllInvoice(){
        return invoiceService.getAllInvoice();
    }

    @PostMapping("/addInvoice")
    public Invoice saveInvoice(@RequestBody Invoice invoice) {
        return invoiceService.saveInvoice(invoice);
    }
}
