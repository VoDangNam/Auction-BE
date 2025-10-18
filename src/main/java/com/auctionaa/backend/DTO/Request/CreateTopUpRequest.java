package com.auctionaa.backend.DTO.Request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DepositRequest {
    @NotNull
    @DecimalMin("1000")
    private Long amount; // VND
    private String callbackUrl;     // nơi nhận webhook
    private String webhookSecret;   // để ký HMAC; nếu null thì BE generate
}
