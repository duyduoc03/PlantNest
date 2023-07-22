package com.example.leduyduoc_examp.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Product")
public class Product {
    @Id
    private int prodID;

    private String prodName;

    private String description;

    private LocalDate dateOfManf;

    private BigDecimal price;

}
