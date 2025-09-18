package com.auctionaa.backend.Service;

import com.auctionaa.backend.Entity.Invoice;
import com.auctionaa.backend.Repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    public List<Invoice> getAllInvoice(){
        return invoiceRepository.findAll();
    }

    public Invoice saveInvoice(Invoice invoice){
        return invoiceRepository.save(invoice);
    }
}
