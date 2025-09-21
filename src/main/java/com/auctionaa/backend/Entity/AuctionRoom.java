package com.auctionaa.backend.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document(collection = "auction_rooms")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuctionRoom {

    @Id
    private String auctionRoomId;

    // Reference to artwork
    @DBRef
    private Artwork artwork;

    // Reference to admin (a user with admin role)
    @DBRef
    private User admin;

    private LocalDateTime startTime;

    private String roomName;

    private String decription;

    private int numberOfArtwork;

    private LocalDateTime endTime;

    private BigDecimal startingPrice;

    private BigDecimal currentPrice;

    private String status;

    // Reference to user (creator or participant)
    @DBRef
    private User user;

    private LocalDateTime createdAt;
}
