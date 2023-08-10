package com.example.plantnest.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PlantDTO {
    private int plantId;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private int categoryId;
    private Date createdAt;
    private Date updatedAt;
}
