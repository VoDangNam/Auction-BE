package com.auctionaa.backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class MbBankTxn {
    private String postingDate;
    private String transactionDate;
    private String accountNo;
    private String creditAmount;     // "1000000"
    private String debitAmount;      // "0"
    private String currency;         // "VND"
    private String description;      // có thể chứa addInfo
    private String addDescription;   // thường rõ addInfo hơn
    private String availableBalance;
    private String beneficiaryAccount;
    private String refNo;            // ví dụ: "FT25276450204930"
    private String benAccountName;
    private String bankName;
    private String benAccountNo;
    private String dueDate;
    private String docId;
    private String transactionType;
    private String pos;
    private String tracingType;
}