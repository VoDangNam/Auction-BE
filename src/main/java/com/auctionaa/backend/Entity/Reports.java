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
@Document(collection = "reports")
public class Reports {
    @Id
    private String reportId;
    private String reportTarget;
    private String reportReason;
    private String reportStatus;
    private LocalDateTime reportTime;
    private LocalDateTime reportDoneTime;

    @DBRef
    private User user;

    @DBRef
    private ReportObject reportobject;

}
