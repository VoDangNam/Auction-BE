package com.auctionaa.backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bids")
public class Bids extends BaseEntity {

    private LocalDateTime bidTime;

    private String auctionSessionId;
    private String userId;
    private BigDecimal amountAtThatTime;

    @CreatedDate
    private LocalDateTime createdAt;

    @Override
    public String getPrefix() {
        return "Bid-";
    }
}
