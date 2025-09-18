package com.auctionaa.backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Invoice")
public class Invoice {
    @Id
    private String id;

    @DBRef
    private AuctionRoom auctionRoom;

    @DBRef
    private User user;

    private BigDecimal amount;
    private String paymentMethod;
    private String paymentStatus;
    private LocalDateTime createdAt;
}
