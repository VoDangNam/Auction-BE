package com.auctionaa.backend.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "ai_detections")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AIDetection {
    @Id
    private  String aiDetectionId;
    private  String aiDetectionResult;
    private LocalDateTime aiDetectionCreatedAt;
    private  LocalDateTime aiDetectionUpdatedAt;

    @DBRef
    private Artwork artwork;
}
