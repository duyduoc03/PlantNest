package com.example.leduyduoc_examp.dto;

import com.example.leduyduoc_examp.entity.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class SaleDTO {

    private int slNo;
    private int salesmanID;
    private ProductDTO product;
    private String salesmanName;
    private Date dos;
}
