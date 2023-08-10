package com.example.plantnest.dto;

import lombok.Data;

@Data
public class OrderDetailDTO {
    private int orderDetailId;
    private int orderId;
    private int userId;
    private int plantId;
    private int quantity;
}
