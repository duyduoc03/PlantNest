package com.example.leduyduoc_examp.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Sale")
public class Sale {
    @Id
    private int slNo;

    private int salesmanID;

    private int prodID;

    private String salesmanName;

    private LocalDate dos;

}
