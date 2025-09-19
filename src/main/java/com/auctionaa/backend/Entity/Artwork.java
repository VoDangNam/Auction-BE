package com.auctionaa.backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "artworks")
public class Artwork {

    @Id
    private String id;

    // Tham chiếu đến tài liệu User (chủ sở hữu)
    @DBRef
    private User owner;

    private String title;
    private String description;
    private String imageUrl;
    private String status;
    private boolean aiVerified;

    private double price;
    // Tham chiếu đến tài liệu Certificate
    @DBRef
    private Certificate certificate;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}