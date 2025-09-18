package com.auctionaa.backend.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "certificates")
public class Certificate {

    @Id
    private String id;

    // Sử dụng @DBRef để tham chiếu đến tài liệu Artwork.
    // MongoDB không có mối quan hệ 1-1, nhưng DBRef có thể mô phỏng nó.
    @DBRef
    private Artwork artwork;

    @Field("file_path")
    private String filePath;

    @Field("verification_status")
    private String verificationStatus;

    @Field("certifier")
    private String certifier;

    @Field("uploaded_at")
    private LocalDateTime uploadedAt;


}