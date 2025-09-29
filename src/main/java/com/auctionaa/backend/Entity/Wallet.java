package com.auctionaa.backend.Entity;

import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "wallets")
public class Wallet extends BaseEntity {

    private String userId;

    @DecimalMin(value = "0.0", inclusive = true, message = "Số tiền giao dịch không được âm.")
    @Field("balance")
    private BigDecimal balance;
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private BigDecimal frozenBalance; // so_du_khoa

    @Override
    public String getPrefix() {
        return "WL-";
    }
}
