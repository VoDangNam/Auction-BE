package com.auctionaa.backend.DTO.Request;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private String phone;
}
