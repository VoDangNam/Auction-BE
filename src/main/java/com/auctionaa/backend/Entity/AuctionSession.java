package com.auctionaa.backend.Entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "auction_sessions")
public class AuctionSession extends BaseEntity {

   @Indexed private String auctionRoomId;

    private String artworkId; // id_tac_pham (FK)

    private String imageUrl; // hinh_anh

    @Indexed private LocalDateTime startTime; // thoi_gian_bat_dau
    @Indexed private LocalDateTime endTime; // thoi_gian_ket_thuc
    private BigDecimal startingPrice; // gia_khoi_diem
    private BigDecimal currentPrice; // gia_hien_tai
    @Indexed private int status; // trang_thai

    private String winnerId; // id_winner
    private String type; // type
    private Integer viewCount; // so_luot_xem

    @CreatedDate
    private LocalDateTime createdAt; // created_at

    private BigDecimal bidStep; // buoc_gia

    private BigDecimal finalPrice; // final_price

    private Integer bidCount; // bid_count

    private String sellerId; // id_seller

    @Override
    public String getPrefix() {
        return "ATSS-";
    }
}
