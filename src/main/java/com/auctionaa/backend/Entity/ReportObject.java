package com.auctionaa.backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "report_objects")
public class ReportObject {
    @Id
    private String objectId;

    @DBRef
    private User user;

    @DBRef
    private  AuctionRoom auctionroom;

    @DBRef
    private Artwork artwork;
}
