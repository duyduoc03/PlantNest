package com.example.plantnest.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderDTO {
    private int orderId;
    private int userId;
    private int plantId;
    private int quantity;
    private Date orderDate;
    private BigDecimal totalAmount;

    // Constructors, getters, and setters
}
