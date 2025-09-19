package com.auctionaa.backend.Controller;

import com.auctionaa.backend.Entity.Invoice;
import com.auctionaa.backend.Service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class InvoiceController {


    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
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

    @GetMapping("invoice/{ownerid}")
    public List<Invoice> getInvoiceById(@PathVariable String ownerid){
        return invoiceService.getByOwnerId(ownerid);
    }
}

