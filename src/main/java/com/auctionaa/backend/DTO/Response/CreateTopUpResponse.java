package com.auctionaa.backend.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepositResponse {
    private String qrCodeUrl;   // ảnh QR để FE hiển thị
    private String paymentRef;  // id giao dịch nội bộ
    private String addInfo;     // nội dung chuyển khoản (để user thấy & đối soát)
}