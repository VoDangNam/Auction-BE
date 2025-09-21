package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvoiceRepository extends MongoRepository<Invoice,String> {
    List<Invoice> findAll();
<<<<<<< HEAD

=======
    List<Invoice> findByUser_Id(String userId);
>>>>>>> origin/main
}
