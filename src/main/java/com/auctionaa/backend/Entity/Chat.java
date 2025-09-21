package com.auctionaa.backend.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "chats")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    @Id
    private  String messageId;
    private  String content;
    private LocalDateTime deliveredTime;

    //sender va receiver deu la admin va user
    @DBRef
    private User user;

    @DBRef
    private Admin admin;

    @DBRef
    private AuctionRoom auctionroom;


}
