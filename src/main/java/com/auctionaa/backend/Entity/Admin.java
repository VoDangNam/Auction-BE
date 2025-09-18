package com.auctionaa.backend.Entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "admins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    private String adminId;

    private String fullName;

    private String email;

    private String password;

    private String phoneNumber;

    private String address;

    private String avatar;

    private String status;

    private String role;
}
