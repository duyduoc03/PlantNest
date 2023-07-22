package com.example.leduyduoc_examp.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class ProductDTO {

    private int prodID;
    private String prodName;
    private String description;
    private Date dateOfManf;
    private BigDecimal price;
    private List<SaleDTO> sales;
}
